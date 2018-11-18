/**
 * <pre>
 * package	 	: com.github.controller
 * </pre>
 * 
 * @filename	: BoardController.java
 * @author	    : Suhyeon
 * @since		: 2018. 11. 5.
 * @version     : 1.0
 * @see
 * 
 */
package com.github.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.domain.BoardVO;
import com.github.service.BoardService;

/**
 * <pre>
 * package	 	: com.github.controller
 * </pre>
 * 
 * @filename	: BoardController.java
 * @author	    : Suhyeon
 * @since		: 2018. 11. 5.
 * @version     : 1.0
 * @see
 * 
 */
@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value ="/register", method = RequestMethod.GET)
	public void registerGET(BoardVO board, Model model)throws Exception{
		logger.info("register get........");
	}
	
	@RequestMapping(value ="/register", method = RequestMethod.POST)
	public String registerPOST(BoardVO board, Model model)throws Exception{
		logger.info("register post.......");
		logger.info(board.toString());
		
		service.regist(board);
		
		model.addAttribute("result","success");
		
		//return "/board/success";
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "listAll", method =RequestMethod.GET)
	public void listAll(Model model)throws Exception{
		logger.info("show all list....");
	}
	
	
}
