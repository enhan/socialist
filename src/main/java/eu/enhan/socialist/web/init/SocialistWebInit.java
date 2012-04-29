/**
 * 
 */
package eu.enhan.socialist.web.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import eu.enhan.socialist.model.config.ModelConfig;
import eu.enhan.socialist.web.config.WebConfig;

/**
 * @author Emmanuel Nhan
 *
 */
public class SocialistWebInit implements WebApplicationInitializer {

	/* (non-Javadoc)
	 * @see org.springframework.web.WebApplicationInitializer#onStartup(javax.servlet.ServletContext)
	 */
	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		AnnotationConfigWebApplicationContext rootCtx = new AnnotationConfigWebApplicationContext();
		rootCtx.register(ModelConfig.class);
		servletContext.addListener(new ContextLoaderListener(rootCtx));
		AnnotationConfigWebApplicationContext webAppCtx = new AnnotationConfigWebApplicationContext();
		webAppCtx.setParent(rootCtx);
		webAppCtx.register(WebConfig.class);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(webAppCtx));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
	}

}
