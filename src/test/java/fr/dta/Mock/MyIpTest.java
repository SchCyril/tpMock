package fr.dta.Mock;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.google.gson.Gson;

public class MyIpTest {

	private HttpDataService httpDataServiceMock;

	@Before
	public void before() {
		httpDataServiceMock = Mockito.mock(HttpDataService.class);
		Mockito.when(httpDataServiceMock.getJsonIp()).thenReturn("{\"ip\":\"92.154.66.22\",\"about\":\"/about\",\"Pro!\":\"http://getjsonip.com\",\"reject-fascism\":\"Support immigrants\"}");
		

	}
	
	@Test
	public void testIP() {
		Gson gson = new Gson();
		String jsonip = httpDataServiceMock.getJsonIp();
		Map <String, String> map = gson.<Map<String, String>>fromJson(jsonip, Map.class);
		assertEquals("92.154.66.22", map.get("ip").split(",")[0]);
		
		
		
	}
}
