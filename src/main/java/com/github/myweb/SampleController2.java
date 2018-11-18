/**
 * 
 */
package com.github.myweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>
 * SampleController.java
 * </pre>
 * 
 * @Author  : soo
 * @Date    : 2018. 10. 31.
 * @Version : 
 *
 */

@Controller
public class SampleController2 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String msg) {
		logger.info("doC called.");
		
		return "sample";
		
	}
	
}
