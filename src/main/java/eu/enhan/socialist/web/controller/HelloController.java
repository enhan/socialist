package eu.enhan.socialist.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping(method=RequestMethod.GET)
	public String sayHello(){
		return "hello";
	}

}
