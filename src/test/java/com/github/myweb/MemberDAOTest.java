/**
 * 
 */
package com.github.myweb;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.domain.MemberVO;
import com.github.persistence.MemberDAO;

/**
 * <pre>
 * com.ex.myTest
 * MemberDAOTest.java
 * </pre>
 * 
 * @Author  : soo
 * @Date    : 2018. 10. 31.
 * @Version : 
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
	
	//의존 관계를 자동으로 연결해주는 기능을 가진 애노테이션
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testTime() throws Exception{
		System.out.println("MemberDAOTest called........."+dao.getTime());
	}
	
	@Test
	public void testInsertMember() throws Exception{
		
		MemberVO vo = new MemberVO();
		vo.setUserid("user00");
		vo.setUserpw("user00");
		vo.setUsername("USER00");
		vo.setEmail("user00@aa.com");
		
		dao.insertMember(vo);
	}
	
	@Test
	public void testReadMember() throws Exception {
		System.out.println("readMember...."+dao.readMember("user01"));
	}
	
	@Test
	public void testReadWithPW() throws Exception{
		System.out.println("readWithPW....."+dao.readWithPW("user02", "userpw"));
	}

}
