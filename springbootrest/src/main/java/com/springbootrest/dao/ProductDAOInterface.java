package com.springbootrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springbootrest.entity.Product;

@Repository
public interface ProductDAOInterface extends JpaRepository<Product, String>{
@Query("")
public boolean login();
}
