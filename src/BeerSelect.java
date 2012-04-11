

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BeerSelect
 */
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeerSelect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Beer Selection Advice <BR>");
		String c= request.getParameter("color"); //html 에서 request의 파라미터가 넘어온다.
		
		
		
		//out.println("<BR> Got Beer Color "+ c);
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		
		
//		Iterator it = result.iterator();
//		while(it.hasNext()){
//			out.println("<BR> try: " + it.next());
//		}
		
		//response헤더에 값을 설정 추가 p167
		response.addHeader("foo", "bar");
		response.setIntHeader("foo1",44);
		
		
		
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request,response);
		
		
	}

}
