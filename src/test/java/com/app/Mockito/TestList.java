package com.app.Mockito;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;


public class TestList {
	//? : annotation any value
		@Mock
		List<?> list;
		
		@Test
		public void testList_Returns_MultipleValues() {
			
			Mockito.when(list.size()).thenReturn(1).thenReturn(2).thenReturn(3);
			Mockito.when(list.get(0)).thenReturn(null);
			
			assertEquals(1,list.size());
			//assertEquals(true,isEven(2));
			assertEquals(2,list.size());
			assertEquals(3,list.size());
			assertEquals(null,list.get(0));
			
			System.out.println(list.size());
			System.out.println(list);
		}
}
