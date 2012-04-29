/**
 * 
 */
package eu.enhan.socialist.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Emmanuel Nhan
 *
 */
public privileged aspect SampleAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(User.class);
	
	public String User.sayHello(){
		return "hello";
	}
	
	pointcut userInit() : call(public User.new(..));
	
	
	before() : userInit() {
		logger.debug("Creating user");
	}
	
	
}
