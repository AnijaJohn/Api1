package api1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api1.model.Users;
import api1.service.UserService;

@RestController
@RequestMapping("/api1")
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/users")
	public ResponseEntity<List<Users>> getAllUsers()
	{
		return new ResponseEntity<List<Users>>(service.getUsers(),HttpStatus.OK);
	}

}
