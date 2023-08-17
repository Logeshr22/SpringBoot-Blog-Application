package com.digit.springBoot.Entitiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Posts")
public class Posts {
	@Id
	@GeneratedValue(
			strategy = GenerationType.IDENTITY
	)
	Long id;
	@Column(name = "title", nullable = false)
	String title;
	@Column(name = "description", nullable = false)
	String description;
	@Column(name = "content",nullable = false)
	String content;
}
