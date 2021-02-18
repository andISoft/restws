package com.retoback.restws;

import com.retoback.restws.bo.PlaceHolder;
import com.retoback.restws.service.CallWebService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestwsApplicationTests.class)
public class RestwsApplicationTests {

	private CallWebService callWebService;

	@Before
	public void initial(){
		callWebService = Mockito.mock(CallWebService.class);
		PlaceHolder placeHolder = new PlaceHolder();
		List<PlaceHolder> placeHolderList = new ArrayList<PlaceHolder>();
		placeHolder.setId(5);
		placeHolder.setPostId(1);
		placeHolder.setEmail("mockito@prueba.com");
		placeHolder.setName("Esto es una prueba del servicio");
		placeHolderList.add(placeHolder);

		Mockito.when(callWebService.getPlaceHolderById(10)).thenReturn(placeHolder);
		Mockito.when(callWebService.getPlaceHolderList()).thenReturn(placeHolderList);
	}

	@Test
	public void testService1() {
		Assert.assertEquals(callWebService.getPlaceHolderById(10).getEmail(),"mockito@prueba.com");
	}

	@Test
	public void testService2() {
		Assert.assertNotNull(callWebService.getPlaceHolderList());
		Assert.assertTrue(callWebService.getPlaceHolderList().size() > 0);
	}

}
