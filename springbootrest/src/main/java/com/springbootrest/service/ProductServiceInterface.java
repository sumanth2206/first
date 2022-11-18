package com.springbootrest.service;

import java.util.List;

import com.springbootrest.entity.Product;

public interface ProductServiceInterface {

	Product createProductService(Product p);

	List<Product> viewAllProductService();

	void editProductService(Product p);

	void deleteProductService(String pid);

}
