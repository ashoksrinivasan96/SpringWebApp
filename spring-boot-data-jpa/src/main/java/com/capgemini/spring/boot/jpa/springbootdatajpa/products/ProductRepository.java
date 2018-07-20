package com.capgemini.spring.boot.jpa.springbootdatajpa.products;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {

}
