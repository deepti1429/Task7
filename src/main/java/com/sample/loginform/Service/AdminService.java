package com.sample.loginform.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.loginform.Entity.Admin;
import com.sample.loginform.Repository.AdminRepo;

@Service
public class AdminService {
	@Autowired
	private AdminRepo repo;
	public Admin saveDetails(Admin admin) {
		return repo.save(admin);
	}

}
