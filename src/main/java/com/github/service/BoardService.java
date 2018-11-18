/**
 * <pre>
 * package	 	: com.github.service
 * </pre>
 * 
 * @filename	: BoardService.java
 * @author	    : Suhyeon
 * @since		: 2018. 11. 5.
 * @version     : 1.0
 * @see
 * 
 */
package com.github.service;

import java.util.List;

import com.github.domain.BoardVO;

/**
 * <pre>
 * package	 	: com.github.service
 * </pre>
 * 
 * @filename	: BoardService.java
 * @author	    : Suhyeon
 * @since		: 2018. 11. 5.
 * @version     : 1.0
 * @see
 * 
 */
public interface BoardService {
	
	public void regist(BoardVO board)throws Exception;
	
	public BoardVO read(Integer bno)throws Exception;
	
	public void modify(BoardVO board)throws Exception;
	
	public void remove(Integer bno)throws Exception;
	
	public List<BoardVO> listAll() throws Exception;

}
