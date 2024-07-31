package com.lucassoares.mongodbspringboot.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lucassoares.mongodbspringboot.domain.User;
import com.lucassoares.mongodbspringboot.dto.UserDTO;
import com.lucassoares.mongodbspringboot.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<UserDTO>> findAll() {		
		List<User> list = service.findAll();
		List<UserDTO> listDto = list
				.stream()
				.map(x -> new UserDTO(x))
				.toList();
		return ResponseEntity.ok(listDto);
	}

}
