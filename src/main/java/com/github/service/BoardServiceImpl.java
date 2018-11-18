/**
 * <pre>
 * package	 	: com.github.service
 * </pre>
 * 
 * @filename	: BoardServiceImpl.java
 * @author	    : Suhyeon
 * @since		: 2018. 11. 5.
 * @version     : 1.0
 * @see
 * 
 */
package com.github.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.github.domain.BoardVO;
import com.github.persistence.BoardDAO;

/**
 * <pre>
 * package	 	: com.github.service
 * </pre>
 * 
 * @filename	: BoardServiceImpl.java
 * @author	    : Suhyeon
 * @since		: 2018. 11. 5.
 * @version     : 1.0
 * @see
 * 
 */
@Service
public class BoardServiceImpl implements BoardService{

	@Inject
	private BoardDAO dao;

	@Override
	public void regist(BoardVO board) throws Exception {
		dao.create(board);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		dao.update(board);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}
	
	
}
