/**
 * 
 */
package com.github.myweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
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
public class SampleController {

	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping("doA")
	public void doA() {
		logger.info("doA called.");
		
	}
	
	@RequestMapping("doB")
	public void doB() {
		logger.info("doB called.");
	}
}
