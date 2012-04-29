/**
 * 
 */
package eu.enhan.socialist.model;

/**
 * @author Emmanuel Nhan
 *
 */
public aspect SampleAspect {
	
	pointcut userInit() : execution(public void User.setName(String));
	
	before() : userInit() {
		System.out.println("Teste pointcut");
	}
	
	
}
