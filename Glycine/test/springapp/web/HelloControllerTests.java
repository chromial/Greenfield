package springapp.web;

import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

import springapp.web.HelloController;

import junit.framework.TestCase;

public class HelloControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception{
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("WEB-INF/jsp/hello.jsp", modelAndView.getViewName());
        Map<String, Object> model = modelAndView.getModel();
		assertNotNull(model);
        String nowValue = (String) model.get("now");
        assertNotNull(nowValue);
    }
}
