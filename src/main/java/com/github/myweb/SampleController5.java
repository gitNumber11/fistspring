/**
 * 
 */
package com.github.myweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.domain.ProductVO;

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
public class SampleController5 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController5.class);
	
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON() {
		//메소드의 선언에 사용된 리턴 타입을 보면 @ResponseBody 애노테이션이 사용됨. 리턴 타입 역시 일반 객체임.
		
		logger.info("doJSON called.");
		
		ProductVO vo = new ProductVO("샘플상품", 30000);
		
		return vo;
		
	}
	
}
