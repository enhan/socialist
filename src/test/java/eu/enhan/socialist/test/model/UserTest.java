/**
 * 
 */
package eu.enhan.socialist.test.model;

import org.junit.Test;

import eu.enhan.socialist.model.User;

import static org.junit.Assert.*;

/**
 * @author Emmanuel Nhan
 *
 */
public class UserTest {
	
	@Test
	public void testEqualsDefault(){
		
		User u = new User();
		User u2 = new User();
		User u3 = new User("plop");
		
		assertTrue(u.equals(u2));
		assertTrue(u2.equals(u));
		assertFalse(u3.equals(u));
		
	}
	

}
