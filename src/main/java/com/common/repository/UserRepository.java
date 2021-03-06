package com.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.common.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{
	
	Users findByUserIdAndPassword(String user_id, String password);
	
}
