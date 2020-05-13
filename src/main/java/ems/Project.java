package ems;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
@SuppressWarnings("serial")
public class Project extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String projectname = request.getParameter("name");
		String projectlocation = request.getParameter("location");
		Utils temp = new Utils();
		try {
			String ps = "insert into project (projname, projloc) values('" + projectname + "','" + projectlocation + "')";
			temp.execSQL(ps,out);
		} catch (Exception se) {
			out.println(se.toString());
		}
	}
}
