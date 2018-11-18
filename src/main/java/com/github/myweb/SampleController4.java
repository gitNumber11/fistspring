/**
 * 
 */
package com.github.myweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
public class SampleController4 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr) {
		
		logger.info("doE called but redirect to /doF.");
		
		//doE() 메소드의 결과로 리다이렉트 시점에 문자열 정보를 하나 더 전달하고 싶기 때문에 msg 데이터 추가
		rttr.addFlashAttribute("msg","This is the Message!! with redirected");
		
		return "redirect:/doF";
		
	}
	
	@RequestMapping("/doF")
	public void doF(@ModelAttribute String msg) {
		logger.info("doF called."+msg);
	}
	
}
