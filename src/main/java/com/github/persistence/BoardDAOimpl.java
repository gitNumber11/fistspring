/**
 * 
 */
package com.github.persistence;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.github.domain.BoardVO;

/**
 * <pre>
 * com.github.persistence
 * BoardDAOimpl.java
 * </pre>
 * 
 * @Author  : soo
 * @Date    : 2018. 11. 1.
 * @Version : 
 *
 */
@Repository
public class BoardDAOimpl implements BoardDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.github.mappers.BoardMapper";

	@Override
	public void create(BoardVO vo) throws Exception {
		session.insert(namespace+".create", vo);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return session.selectOne(namespace+".read", bno);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		session.update(namespace+".update", vo);
	}

	@Override
	public void delete(Integer bno) throws Exception {
		session.delete(namespace+".delete", bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return session.selectList(namespace+".listAll");
	}
	
	

}
