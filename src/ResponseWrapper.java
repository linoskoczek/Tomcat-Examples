import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class ResponseWrapper extends HttpServletResponseWrapper {

    private StringWriter stringWriter = null;

    ResponseWrapper(HttpServletResponse response) {
        super(response);
    }

    ResponseWrapper(ServletResponse response) {
        this((HttpServletResponse) response);
    }

    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        throw new IllegalStateException("getOutputStream() not allowed for StringResponseWrapper");
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        if(stringWriter == null)
            stringWriter = new StringWriter();
        return new PrintWriter(stringWriter);
    }

    StringWriter getStringWriter() {
        return stringWriter;
    }
}
