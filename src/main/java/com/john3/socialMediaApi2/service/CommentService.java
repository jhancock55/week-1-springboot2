package com.john3.socialMediaApi2.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.john3.socialMediaApi2.entity.Comment;
import com.john3.socialMediaApi2.entity.Post;
import com.john3.socialMediaApi2.entity.User;
import com.john3.socialMediaApi2.repository.CommentRepository;
import com.john3.socialMediaApi2.repository.PostRepository;
import com.john3.socialMediaApi2.repository.UserRepository;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository repo;
	
	@Autowired
	private PostRepository postRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	public Comment createComment(Comment comment, Long userId, Long postId) throws Exception{
		User user = userRepo.findOne(userId);
		Post post = postRepo.findOne(postId);
		if (user == null || post == null) {
			throw new Exception("User or Post does not exist.");
		}
		comment.setDate(new Date());
		comment.setUser(user);
		comment.setPost(post);
		return repo.save(comment);
	}
	
	public void deleteComment(Long commentId) {
		repo.delete(commentId);
	}

}
