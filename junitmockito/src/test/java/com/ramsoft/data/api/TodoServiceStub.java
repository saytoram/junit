package com.ramsoft.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

	public List<String> retriveTodos(String user) {
	
			return	Arrays.asList("Spring Boot Course","Spring Security Course",
						"Dance Baby Dance");
	}

}
