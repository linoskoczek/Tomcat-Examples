import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebListener
public class RequestListener implements ServletContextListener, ServletRequestListener {
    private final static Logger logger;

    static {
        logger = Logger.getLogger("ServerLogger");
        logger.setLevel(Level.FINE);
    }

    public void contextInitialized(ServletContextEvent p0) {
        logger.fine("Context created!");
    }

    public void contextDestroyed(ServletContextEvent p0) {
        logger.fine("Context destroyed!");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        logger.severe("Request destroyed!");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        logger.severe("Request initialised!");
    }
}