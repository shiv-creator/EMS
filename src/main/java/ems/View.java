package ems;
import java.io.*;
import java.util.Properties;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class View extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		InputStream inputStream = null;
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		try {
			String reportID = req.getParameter("reports");
			Properties prop = new Properties();
			inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file not found in the classpath");
			}
			String jasperServerUrl = prop.getProperty("JasperServerURL");
			jasperServerUrl = jasperServerUrl.concat(reportID);
			res.sendRedirect(jasperServerUrl);
			out.println("Successfully Redirected");
		} catch (Exception se) {
			out.println(se.toString());
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			
		}
	}
}
