package com.sample.loginform.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.loginform.Entity.Admin;
import com.sample.loginform.Service.AdminService;

@RestController
public class AdminController {
@Autowired
private AdminService serv;

@PostMapping("/customer")
//public ResponseEntity<Admin> createUser(@RequestBody Admin user) {
//    Admin savedUser = serv.saveDetails(user);
//    return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
//}

public Admin postDetails(@RequestBody Admin admin) {
	return serv.saveDetails(admin);
}
}
