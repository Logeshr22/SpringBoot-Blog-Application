package com.digit.springBoot.SpringBootBlogApplication.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.digit.springBoot.SpringBootBlogApplication.Entity.*;
public interface PostRepository extends JpaRepository<Posts,Long>{
	
}
