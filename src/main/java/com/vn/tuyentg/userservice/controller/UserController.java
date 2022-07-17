package com.vn.tuyentg.userservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vn.tuyentg.userservice.vm.RegisterUserVM;
import com.vn.tuyentg.userservice.vm.UserVM;



@RestController
@RequestMapping("user-service/api/")
public class UserController {

	private List<UserVM> users = new ArrayList<>();;

	@GetMapping("/users")
	public Object getAll() {
		return users;
	}

	@GetMapping("/users/{id}")
	//@ApiOperation("Get all department information")
	public Object getById(@PathVariable int id) {
		return "user service" + id;
	}

	@PostMapping(value = "/user/add", consumes = "application/json")
	public Object addUser(@RequestBody RegisterUserVM user) {
		return user;
	}

	@PostMapping(value = "/user/update", consumes = "application/json")
	public Object updateUser(@RequestBody UserVM user) {
		Optional<UserVM> u = users.stream().filter(x -> x.getPhone().equals(user.getPhone())).findFirst();
		if (!u.isPresent()) {
			return null;
		}
		return user.toString();
	}
}
