package com.digit.springBoot.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.digit.springBoot.Entitiy.*;
public interface PostRepository extends JpaRepository<Posts,Long>{
	
}
