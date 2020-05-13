package ems;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Properties;
public class Utils {
	public void execSQL(String ps, PrintWriter out) throws SQLException, IOException {
		InputStream inputStream = null;
		try {
			Properties prop = new Properties();
			inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file not found in the classpath");
			}
			String dbURL = prop.getProperty("dbURL");
			String dbUser = prop.getProperty("dbUser");
			String dbPassword = prop.getProperty("dbPassword");
			try (Connection con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
					PreparedStatement p = con.prepareStatement(ps);) {
				int i = p.executeUpdate();
				if (i > 0) {
					out.println("New Record sucessfully registered");
				} else {
					out.println("Failed in  registration");
				}
			}
			out.println("<br /><br /><a href='index.html'>Go to Home Page</a>");
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
	}
}
