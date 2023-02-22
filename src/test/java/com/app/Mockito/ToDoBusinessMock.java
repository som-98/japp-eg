package com.app.Mockito;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ToDoBusinessMock {
	@Mock
	ToDoService service;
	// mock means creating a local copy of the code
	@Test
	public void testusing_Mocks() //TC
	{
		ToDoService doService = service;
		List<String> combinedlist = Arrays.asList("Core Java", "Spring Core", "Hibernate");
		//when is a boolean condition application
		Mockito.when(doService.getTodos("dummy")).thenReturn(combinedlist);
		ToDoBusiness business = new ToDoBusiness(doService);
		List<String> alltd = business.getTodosforSpring("dummy");
		System.out.println(alltd);
		assertEquals(1, alltd.size());
	}
}
