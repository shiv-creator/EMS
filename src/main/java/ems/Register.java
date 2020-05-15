package ems;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
@SuppressWarnings("serial")
public class Register extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String empname = request.getParameter("empname");
		String jobtitle = request.getParameter("jobtitle");
		String mgrname = request.getParameter("mgrname");
		String hiredate = request.getParameter("hiredate");
		String project = request.getParameter("project");
		Utils temp = new Utils();
		try {
			String ps = "insert into employee(ename,egrade,emgr,ehiredate,eprojectid) values('" + empname + "',"+ jobtitle + ",'" + mgrname + "','" + hiredate + "'," + project + ")";
			temp.execSQL(ps, out);
		} catch (Exception se) {
			out.println(se.toString());
		}
	}
}
