package com.webapp.studmark.repository;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.webapp.studmark.model.User;
public interface UserRepository extends JpaRepository<User,Integer> {
	
	@Query(value="SELECT *FROM user WHERE username=?1 and password=?2", nativeQuery = true)
	public User findByUsernameAndPassword(String username,String password);
}
