package signupwebapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
    protected Class < ? > [] getRootConfigClasses() {
        return new Class[] {
            AppContext.class
        };
        //return null;
    }

	@Override
    protected Class < ? > [] getServletConfigClasses() {
        return new Class[] {
            WebMvc.class
        };
    }

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}