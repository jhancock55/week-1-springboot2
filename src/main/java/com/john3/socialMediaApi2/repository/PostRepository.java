package com.john3.socialMediaApi2.repository;

import org.springframework.data.repository.CrudRepository;

import com.john3.socialMediaApi2.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

}
