package com.aksh.service;

import com.aksh.exception.ProductException;
import com.aksh.modal.Cart;
import com.aksh.modal.CartItem;
import com.aksh.modal.User;
import com.aksh.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
