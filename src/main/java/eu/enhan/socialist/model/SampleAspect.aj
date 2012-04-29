/**
 * 
 */
package eu.enhan.socialist.model;

/**
 * @author Emmanuel Nhan
 *
 */
public privileged aspect SampleAspect {
	
	public String User.sayHello(){
		return "hello";
	}
	
	pointcut userInit() : call(public User.new(..));
	
	before() : userInit() {
		System.out.println("Teste pointcut");
	}
	
	
}
