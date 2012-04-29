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
	
	pointcut userInit() : execution(public void User.setName(String));
	
	before() : userInit() {
		System.out.println("Teste pointcut");
	}
	
	
}
