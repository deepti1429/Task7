package com.sample.loginform.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.loginform.Entity.Admin;
@Repository
public interface AdminRepo extends JpaRepository<Admin,Long> {

}
