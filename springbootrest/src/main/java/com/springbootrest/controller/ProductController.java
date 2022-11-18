package com.springbootrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.entity.Product;
import com.springbootrest.service.ProductServiceInterface;

@RestController
public class ProductController {
	
	@Autowired
	private ProductServiceInterface ps;

	@GetMapping("viewAll")
	public List<Product> viewAllProduct() {
		List<Product> ll=ps.viewAllProductService();
		
		return ll;
	}
	
	@PostMapping("createProduct")
	public ResponseEntity<Product> createProduct(@RequestBody Product p) {
		Product p1=ps.createProductService(p);
		return new ResponseEntity<Product>(p1, HttpStatus.OK);
	}
	@PutMapping("updateProduct/{id}")
	public String editProduct(@PathVariable("id") String pid,@RequestBody Product p) {
		p.setP_id(pid);
		ps.editProductService(p);
		return "product edited";
	}
	@DeleteMapping("deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") String pid) {
		ps.deleteProductService(pid);
		return "product deleted";
	}
}
