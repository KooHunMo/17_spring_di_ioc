package com.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * 
 * 어노테이션을 이용한 객체 주입 예시(xml파일)
 * 
 * */

@Controller //이것이 19번에서 저희가 했었던 방법이다.
public class SpringDiEx04 {

	@Autowired
	ProductManagerEx2 pdMgr;
	
	@Autowired
	Product product4;
	
	@Autowired
	Product product5;
	
	@Autowired
	Product product6;
	
	
	@RequestMapping(value="/springDiEx04" , method=RequestMethod.GET)
	public String springDiEx04() {
		
		pdMgr.setProduct(product4);
		pdMgr.printInfo();
		
		pdMgr.setProduct(product5);
		pdMgr.printInfo();
		
		pdMgr.setProduct(product6);
		pdMgr.printInfo();
		
		return "home";
	}
	
}
