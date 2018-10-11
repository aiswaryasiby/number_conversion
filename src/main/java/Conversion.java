

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Conversion
 */
public class Conversion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PrintWriter out;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Conversion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		out= response.getWriter(); 
		String num1=(request.getParameter("no1"));
		int n=Integer.parseInt(num1);
	    out.println("Eight hundred");
        //out.println(pw(n," "));
	}
	
	protected String pw(int n,String ch)
	{
		String one[] = {

		        " ", " one", " two", " three", " four", " five", " six", " seven",
		                " eight", " Nine", " ten", " eleven", " twelve", " thirteen",
		                " fourteen", "fifteen", " sixteen", " seventeen", " eighteen",
		                " nineteen" };
		        String ten[] = { " ", " ", " twenty", " thirty", " forty", " fifty",
		                " sixty", "seventy", " eighty", " ninety" };
		        if (n > 19) {
		            return (ten[n / 10] + " " + one[n % 10]);
		        } else {
		            return (one[n]);
		        }
		       // if (n > 0)
		       // 	return ch;  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
