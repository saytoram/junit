package com.ramsoft.business;

import java.util.ArrayList;
import java.util.List;

import com.ramsoft.data.api.TodoService;

public class TodoBusinessImpl {

	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user){
		
		List<String> filterTodos = new ArrayList<String>();
		List<String> todos = todoService.retriveTodos(user);
		
		for(String todo:todos) {
			if(todo.contains("Spring")){
			filterTodos.add(todo);
		}
		}
		
		return filterTodos;
	}
	
	
}
