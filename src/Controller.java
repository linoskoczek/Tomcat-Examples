import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/controller.servlet")
public class Controller extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //request.setAttribute("controller", "1");
        if(Utilities.Number.isNumeric(request.getParameter("number1"))
                && Utilities.Number.isNumeric(request.getParameter("number2"))) {

            Logic logic = new Logic(request.getParameter("number1"), request.getParameter("number2"));
            Model model = logic.getResult();

            request.setAttribute(Model.MODEL, model);
        }
        ServletContext context = getServletContext();
        RequestDispatcher requestDispatcher = context.getRequestDispatcher("/view.servlet");
        requestDispatcher.forward(request, resp);
    }
}
