/**
 * 
 */
package com.github.myweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
public class SampleController3 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	
	@RequestMapping("/doD")
	public String doD(Model model) {
		//Model 이라는 클래스를 파라미터로 사용함 -> 뷰에 원하는 데이터를 전달하는 일종의 컨테이너 역할을 함.
		
		logger.info("doD called.");
		
		//make sample data
		ProductVO product = new ProductVO("Sample Product", 10000);
		
		//Model이라는 객체를 이용하여 필요한 데이터를 담은 후 뷰로 전달함.
		model.addAttribute(product);
		//이름을 지정하지 않는 경우에는 클래스명을 이름으로 간주함.(앞글자는 소문자 처리)
		
		//객체에 특별한 이름을 부여해 뷰에서 이름값을 이용하여 객체 처리
		//model.addAttribute("product", product);
		
		return "productDetail";
		
	}
	
}
