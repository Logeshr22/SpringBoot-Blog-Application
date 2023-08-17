package com.digit.springBoot.SpringBootBlogApplication.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digit.springBoot.SpringBootBlogApplication.Payload.PostDTO;
import com.digit.springBoot.SpringBootBlogApplication.Service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {
	private PostService postService;
	public PostController(PostService postService) {
		this.postService = postService;
	}
	@PostMapping
	public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO postDto){
		return new ResponseEntity<>(postService.createPost(postDto),HttpStatus.CREATED);
	}
}
