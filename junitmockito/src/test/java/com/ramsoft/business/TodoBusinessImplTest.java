package com.ramsoft.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.ramsoft.data.api.TodoService;
import com.ramsoft.data.api.TodoServiceStub;

public class TodoBusinessImplTest {

	@Test
	public void test() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		
		List<String> filterTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		
		assertEquals(2, filterTodos.size());
	}

}
