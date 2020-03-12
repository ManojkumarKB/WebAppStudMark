package com.webapp.studmark.repository;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.studmark.model.User;
public interface UserRepository extends JpaRepository<User,Integer> {
	
	public User findByUsernameAndPassword(String username,String password);
}
