package sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class CookieServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		Cookie cookie = new Cookie("name","value with spaces");
		cookie.setVersion(1);
		httpServletResponse.addCookie(cookie);

		httpServletResponse.getWriter().write("It works!");
	}

	private static final long serialVersionUID = -1199859446130516520L;
}
