<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Reports</title>
</head>
<body>
	<form method="get" action="View">

		<h2>Select the Option to view the report</h2>
		<br /> <select name="reports">
			<option value="-1">----Select the Report Type----</option>
			<option value="EmployeesReport">Employees Report</option>
			<option value="Employees_Report___Grade_Wise">Employee Report - Grade Wise</option>
			<option value="Employees_Report___Project_Wise">Employee Report - Project Wise</option>
			<option value="Job_Grade_Report">Job Grade Report</option>
			<option value="Projects_Report">Project Report</option>
		</select> <input type="submit" value="View" />
	</form>
</body>
