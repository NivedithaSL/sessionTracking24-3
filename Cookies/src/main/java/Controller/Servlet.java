package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/demo1")
public class Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String s1=req.getParameter("name");
		req.getSession().setAttribute("name", s1);
		resp.getWriter().print("<a href="+"Servlet"+">click here</a>");
		Cookie cookie=new Cookie("user", s1);
		resp.addCookie(cookie);
		resp.getWriter().print(s1);
	}
}
