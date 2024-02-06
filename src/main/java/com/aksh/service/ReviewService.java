package com.aksh.service;

import java.util.List;

import com.aksh.exception.ProductException;
import com.aksh.modal.Review;
import com.aksh.modal.User;
import com.aksh.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
