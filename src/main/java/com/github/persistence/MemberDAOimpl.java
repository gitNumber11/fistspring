/**
 * 
 */
package com.github.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.github.domain.MemberVO;

/**
 * <pre>
 * com.github.persistence
 * MemberDAOimpl.java
 * </pre>
 * 
 * @Author  : soo
 * @Date    : 2018. 10. 31.
 * @Version : 
 *
 */
@Repository
public class MemberDAOimpl implements MemberDAO{

	//클래스의 선언부에 사용된 @Repository 애노테이션 : DAO를 스프링에 인식시키기 위해서 사용함.
	
	@Inject
	private SqlSession sqlSession;
	
	//private static final Logger logger = LoggerFactory.getLogger(MemberDAOimpl.class);
	
	private static final String namespace = "com.github.mappers.MemberMapper";
	
	@Override
	public String getTime() {
		
		//logger.info("MemberDAOimpl getTime() entered.");
		return sqlSession.selectOne(namespace+".getTime");
	}
	
	@Override
	public void insertMember(MemberVO vo) {
		
		//logger.info("MemberDAOimpl insertMember() entered.");
		sqlSession.insert(namespace+".inserMember", vo);
	}

	@Override
	public MemberVO readMember(String userid) throws Exception {
		return (MemberVO) sqlSession.selectOne(namespace+".selectMember",userid);
		
	}

	@Override
	public MemberVO readWithPW(String userid, String userpw) throws Exception {
		
		//파라미터가 2개 이상 전달되는 경우 -> Map 타입의 객체를 구성해서 파라미터로 사용함.
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		
		return sqlSession.selectOne(namespace+".readWithPW",paramMap);
	}

}
