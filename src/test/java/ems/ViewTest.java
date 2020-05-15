package ems;

import static org.junit.Assert.*;

import java.io.*;

import javax.servlet.*;

import org.junit.Test;
import org.springframework.mock.web.*;

public class ViewTest {

	@Test
	public void testDoGetHttpServletRequestHttpServletResponse() throws ServletException, IOException {
		MockHttpServletRequest req = new MockHttpServletRequest();
		MockHttpServletResponse res = new MockHttpServletResponse();
		req.addParameter("reports", "EmployeesReport");
		new View().doGet(req, res);		
		assertTrue(res.getContentAsString().contains("Successfully Redirected"));

	}

}

