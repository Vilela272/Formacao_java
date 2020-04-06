package br.com.caelum;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//import org.springframework.web.util.Log4jConfigListener;

/**
 * Classe que representa a inicializacao
 * 
 * @author Guilherme Vilela
 * @version 1.0.0
 *
 */

public class Inicializador extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { Configurador.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		super.onStartup(servletContext);

//		servletContext.setInitParameter("log4jConfigLocation",
//				"/WEB-INF/log4j.xml");
//		servletContext.addListener(new Log4jConfigListener());

	}

}
