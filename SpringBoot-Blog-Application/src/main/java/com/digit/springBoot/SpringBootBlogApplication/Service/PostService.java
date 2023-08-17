package com.digit.springBoot.SpringBootBlogApplication.Service;

import java.util.List;

import com.digit.springBoot.SpringBootBlogApplication.Payload.PostDTO;

public interface PostService {
	PostDTO createPost(PostDTO postDto); //abstract method //DTO - Data Transfer Object
	List<PostDTO> getAllPosts();
}
