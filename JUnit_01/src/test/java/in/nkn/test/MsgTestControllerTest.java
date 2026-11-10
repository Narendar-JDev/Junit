package in.nkn.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import in.nkn.service.MsgService;

@SpringBootTest
@AutoConfigureMockMvc
public class MsgTestControllerTest  {

	@MockitoBean
	private MsgService msgservice;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testWeclome() throws Exception{
		
		when(msgservice.getWelcomeMsg()).thenReturn("Welcome");
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
		
		MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = mvcResult.getResponse();
	
		int actual = response.getStatus();
	
	    int expected = 200;
	    
	    assertEquals(expected, actual);
	
	}
}
