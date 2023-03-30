package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet")
public class Servlet2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String s2=(String) req.getSession().getAttribute("name");
		resp.getWriter().print(s2);
		Cookie[]cookies=req.getCookies();
		for(Cookie cookie:cookies) {
			String name=cookie.getValue();
			System.out.println(name);
			resp.getWriter().print(name);
		}
	}

}
