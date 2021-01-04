package com.john3.socialMediaApi2.repository;

import org.springframework.data.repository.CrudRepository;

import com.john3.socialMediaApi2.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long>{

}
