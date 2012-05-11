/**
 * 
 */
package eu.enhan.socialist.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Shortcut annotation to use on {@link Configuration} classes.
 * {@link Production} indicates that the class must be activated when the production profile is activated
 * 
 * @author Emmanuel Nhan
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Profile("production")
public @interface Production {

}
