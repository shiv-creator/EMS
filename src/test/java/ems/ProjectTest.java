package ems;
import org.junit.Assert;
import java.io.*;
import javax.servlet.ServletException;
import org.springframework.mock.web.*;
import org.junit.Test;
public class ProjectTest {
 @Test
 public void check() throws ServletException, IOException {
		MockHttpServletRequest req = new MockHttpServletRequest();
		MockHttpServletResponse res = new MockHttpServletResponse();
		req.addParameter("name", "EPDQ1");
		req.addParameter("location", "Nottingham");
		new Project().doPost(req, res);
                Assert.assertTrue(res.getContentAsString().contains("New Record sucessfully registered"));
	}
}
