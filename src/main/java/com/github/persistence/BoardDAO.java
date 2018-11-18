/**
 * 
 */
package com.github.persistence;

import java.util.List;

import com.github.domain.BoardVO;

/**
 * <pre>
 * com.github.persistence
 * BoardDAO.java
 * </pre>
 * 
 * @Author  : soo
 * @Date    : 2018. 11. 1.
 * @Version : 
 *
 */
public interface BoardDAO {
	
	public void create(BoardVO vo) throws Exception;
	
	public BoardVO read(Integer bno) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;

}
