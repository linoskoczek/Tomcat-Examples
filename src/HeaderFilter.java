import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "header", urlPatterns = { "*.servlet" }, dispatcherTypes = { DispatcherType.REQUEST, DispatcherType.FORWARD })
public class HeaderFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.write(HTMLConstants.HEADER);
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
