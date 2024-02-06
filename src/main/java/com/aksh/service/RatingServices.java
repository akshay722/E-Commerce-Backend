package com.aksh.service;

import java.util.List;

import com.aksh.exception.ProductException;
import com.aksh.modal.Rating;
import com.aksh.modal.User;
import com.aksh.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
