<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form method="post" action="Register">

		<h2>Register New Employee</h2>
		<br />
		<table>
			<tbody>
				<tr>
					<td>Employee Name:</td>
					<td><input type="text" name="empname" /></td>
				</tr>
				<tr>
					<td>Employee Job Title:</td>
					<td><select name="jobtitle">
							<option value="-1">----Select the Job Title----</option>
							<%
								try {
									Class.forName("com.mysql.jdbc.Driver");

									// creating connection Using Postgres Change it to other
									Connection conn = DriverManager.getConnection("jdbc:mysql://ptcntttst001:3306/jasperserver", "jasperdb",
											"jasperdb");

									Statement statement = conn.createStatement();

									ResultSet rs = statement.executeQuery("select * from jobgrade;");

									while (rs.next()) {
							%>
							<option value="<%=rs.getString("grade")%>"><%=rs.getString("jobtitle")%></option>
							<%
								}
								} catch (Exception ex) {
									ex.printStackTrace();
									out.println("Error " + ex.getMessage());

								}
							%>
					</select></td>

				</tr>
				<tr>
					<td>Reporting Manager:</td>
					<td><input type="text" name="mgrname" /></td>
				</tr>
				<tr>
					<td>Hire Date:</td>
					<td><input type="text" name="hiredate" /></td>
				</tr>
				<tr>
					<td>Project Name:</td>
					<td><select name="project">
							<option value="-1">----Select the Project----</option>
							<%
								try {
									Class.forName("com.mysql.jdbc.Driver");

									// creating connection Using Postgres Change it to other
									Connection conn = DriverManager.getConnection("jdbc:mysql://ptcntttst001:3306/jasperserver", "jasperdb",
											"jasperdb");

									Statement statement = conn.createStatement();

									ResultSet rs = statement.executeQuery("select * from project;");

									while (rs.next()) {
							%>
							<option value="<%=rs.getString("projid")%>"><%=rs.getString("projname")%></option>
							<%
								}
								} catch (Exception ex) {
									ex.printStackTrace();
									out.println("Error " + ex.getMessage());

								}
							%>
					</select></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Register" /></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>