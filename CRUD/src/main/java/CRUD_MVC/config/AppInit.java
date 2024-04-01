package CRUD_MVC.config;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;


public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() { return new Class[]{AppConfig.class};}

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
   /* @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);

        // Создаем и регистрируем CharacterEncodingFilter
        //обеспечивает корректную обработку символов на всех уровнях
        CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
        encodingFilter.setEncoding("UTF-8");
        encodingFilter.setForceEncoding(true);
        encodingFilter.setForceRequestEncoding(true);

        FilterRegistration.Dynamic encodingFilterRegistration = servletContext.addFilter("encodingFilter", encodingFilter);
        encodingFilterRegistration.addMappingForUrlPatterns(null, false, "/*");
    }*/

}

