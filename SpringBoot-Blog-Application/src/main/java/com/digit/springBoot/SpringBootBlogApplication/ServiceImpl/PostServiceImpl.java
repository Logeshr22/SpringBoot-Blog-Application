package com.digit.springBoot.SpringBootBlogApplication.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

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
	
	private PostDTO mapFromDTO(Posts postDto) {
		PostDTO post  = new PostDTO();
		post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getContent());
		return post;
	}
	
	private PostDTO mapFromEntity(Posts post) {
		PostDTO postResponse = new PostDTO();
		postResponse.setId(post.getId());
		postResponse.setTitle(post.getTitle());
		postResponse.setDescription(post.getDescription());
		postResponse.setContent(post.getContent());
		return postResponse;
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
	
	public List<PostDTO> getAllPosts(){
		List<Posts> post = postRepository.findAll();
		return post.stream().map(p->mapFromEntity(p)).collect(Collectors.toList());
	}

}
