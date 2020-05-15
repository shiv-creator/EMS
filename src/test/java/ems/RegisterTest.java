package ems;

import static org.junit.Assert.*;

import java.io.*;
import javax.servlet.ServletException;

import org.springframework.mock.web.*;
import org.springframework.core.*;
import org.junit.Test;

public class RegisterTest {

	@Test
	public void testDoPostHttpServletRequestHttpServletResponse() throws ServletException, IOException {
		MockHttpServletRequest req = new MockHttpServletRequest();
		MockHttpServletResponse res = new MockHttpServletResponse();
		req.addParameter("empname", "Harpaul Mahal");
		req.addParameter("jobtitle", "9");
		req.addParameter("mgrname", "Himanshu Bhargava");
		req.addParameter("hiredate", "2011-01-03");
		req.addParameter("project", "1");

		new Register().doPost(req, res);
		assertTrue(res.getContentAsString().contains("New Record sucessfully registered"));
	}

}

