package com.digit.springBoot.SpringBootBlogApplication.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.digit.springBoot.SpringBootBlogApplication.Entity.Posts;
import com.digit.springBoot.SpringBootBlogApplication.Payload.PostDTO;
import com.digit.springBoot.SpringBootBlogApplication.Repository.PostRepository;
import com.digit.springBoot.SpringBootBlogApplication.Service.PostService;

@Service
public class PostServiceImpl implements PostService {
	private PostRepository postRepository;
	
	public PostServiceImpl(PostRepository postRepository) {
		super();
		this.postRepository = postRepository;
	}

	@Override
	public PostDTO createPost(PostDTO postDto) {
		//DTO got converted into Entity
		Posts post = new Posts();
		post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		Posts postDto1 = postRepository.save(post);
		
		//Convert Entity into DTO
		PostDTO postResponse = new PostDTO();
		postResponse.setId(postDto1.getId());
		postResponse.setTitle(postDto1.getTitle());
		postResponse.setDescription(postDto1.getDescription());
		postResponse.setContent(postDto1.getContent());
		return postResponse;
	}
}
