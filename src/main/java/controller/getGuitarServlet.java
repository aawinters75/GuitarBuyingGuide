package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GuitarBuyingGuide;

/**
 * Servlet implementation class getGuitarServlet
 */
@WebServlet("/getGuitarServlet")
public class getGuitarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getGuitarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userBudget = request.getParameter("userBudget");
		
		GuitarBuyingGuide userGuitar = new GuitarBuyingGuide(Integer.parseInt(userBudget));
		
		request.setAttribute("userGuitarSelection", userBudget);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		//PrintWriter writer = response.getWriter();
		//writer.println(userGuitar.toString());
		//writer.close();
	}

}
