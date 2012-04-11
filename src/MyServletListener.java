import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class MyServletListener
 *
 */
public class MyServletListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyServletListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce) {
        // TODO Auto-generated method stub
    	ServletContext sc = sce.getServletContext();
    
    	String dogBreed = sc.getInitParameter("PASS");
    	
    	Dog d = new Dog (dogBreed);
    	sc.setAttribute("dog", d);
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
    }
	
}
