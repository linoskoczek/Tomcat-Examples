import javax.servlet.http.HttpServlet;

public class Logic extends HttpServlet {

    private int num1, num2;

    public Logic(String num1, String num2) {
        this.num1 = Integer.parseInt(num1);
        this.num2 = Integer.parseInt(num2);
    }

    public Model getResult() {
        return new AdditionModel(num1, num2, num1 + num2);
    }
}
