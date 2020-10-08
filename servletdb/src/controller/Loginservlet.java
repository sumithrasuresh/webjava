package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.login;
import dao.logindao;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Loginservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String un=request.getParameter("userName");
		String pw=request.getParameter("passWd");
		String str1 = request.getParameter("login");      
	    String str2 = request.getParameter("register");   
		logindao ldao=new logindao();
		login l=new login();
		
		l.setUname(un);
		l.setPwd(pw);
		if (str2!=null)
		{
		String userreg=ldao.register(l);
		if(userreg.equals("success"))   //On success, you can display a message to user on Home page
		 {
		 request.getRequestDispatcher("/Home.jsp").forward(request, response);
		 }
		 else   //On Failure, display a meaningful message to the User.
		 {
		 request.setAttribute("errMessage", userreg);
		 request.getRequestDispatcher("/Register.jsp").forward(request, response);
		 }
		}
		if (str1!=null)
		{
			String userreg=ldao.login(l);
			if(userreg.equals("Welcome"))   //On success, you can display a message to user on Home page
			 {
			 request.getRequestDispatcher("/Home1.jsp").forward(request, response);
			 }
			 else   //On Failure, display a meaningful message to the User.
			 {
			 request.setAttribute("errMessage", userreg);
			 request.getRequestDispatcher("/Register.jsp").forward(request, response);
			 }
		}	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
