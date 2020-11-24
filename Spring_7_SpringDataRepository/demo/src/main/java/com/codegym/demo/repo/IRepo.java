package com.codegym.demo.repo;

import com.codegym.demo.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepo extends CrudRepository<Product,Long> {
}
