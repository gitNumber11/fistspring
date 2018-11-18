/**
 * 
 */
package com.github.persistence;

import com.github.domain.MemberVO;

/**
 * <pre>
 * com.github.persistence
 * MemberDAO.java
 * </pre>
 * 
 * @Author  : soo
 * @Date    : 2018. 10. 31.
 * @Version : 
 *
 */
public interface MemberDAO {
	
	public String getTime();
	
	public void insertMember(MemberVO vo);
	
	public MemberVO readMember(String userid) throws Exception;
	
	public MemberVO readWithPW(String userid, String userpw) throws Exception;

}
