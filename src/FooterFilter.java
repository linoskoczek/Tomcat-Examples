import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "footerFilter", urlPatterns = { "*.servlet" }, dispatcherTypes = { DispatcherType.REQUEST })
public class FooterFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        ResponseWrapper responseWrapper = new ResponseWrapper(servletResponse);
        filterChain.doFilter(servletRequest, responseWrapper);

        copyOriginalResponse(servletResponse, responseWrapper);
        addFooter(servletResponse);
        servletResponse.getWriter().close();
    }

    private void addFooter(ServletResponse servletResponse) throws IOException {
        servletResponse.getWriter().print(HTMLConstants.FOOTER);
    }

    private void copyOriginalResponse(ServletResponse servletResponse, ResponseWrapper responseWrapper) throws IOException {
        String response = responseWrapper.getStringWriter().toString();
        PrintWriter servletResponseWriter = servletResponse.getWriter();
        servletResponseWriter.print(response);
    }


}
