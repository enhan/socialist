package eu.enhan.socialist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * 
 * @author Emmanuel Nhan
 *
 */
@Controller
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String sayHello(){
		return "hello";
	}

}
