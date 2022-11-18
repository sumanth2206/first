package com.springbootrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springbootrest.dao.ProductDAOInterface;
import com.springbootrest.entity.Product;

@Service
@Transactional
public class ProductService implements ProductServiceInterface {
	
	@Autowired
	private ProductDAOInterface pd;

	@Override
	public Product createProductService(Product p) {
		pd.save(p);
		return p;
	}

	@Override
	public List<Product> viewAllProductService() {
		// TODO Auto-generated method stub
		return pd.findAll();
	}

	@Override
	public void editProductService(Product p) {
		// TODO Auto-generated method stub
		pd.saveAndFlush(p);
	}

	@Override
	public void deleteProductService(String pid) {
		// TODO Auto-generated method stub
		pd.deleteById(pid);
		
	}

}
