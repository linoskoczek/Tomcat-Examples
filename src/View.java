import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/view.servlet")
public class View extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println(HTMLConstants.PROLOG);

        Model model = (Model) request.getAttribute(Model.MODEL);
        //if(request.getAttribute("controller") != "1") sendFake404(request, response);
        if(model != null) {
            out.println("Result: " + model.getResult());

            out.close();
        }
    }

    private void sendFake404(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        response.sendError(HttpServletResponse.SC_NOT_FOUND, request.getServletPath());
    }
}
