package com.codegym.demo.service.product;

import com.codegym.demo.model.Product;
import com.codegym.demo.repo.IRepo;
import com.codegym.demo.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService implements IProductService {
    @Autowired
    private IRepo productRepo;

    @Override
    public Iterable<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepo.save(product);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Product findById(Long id) {
        return null;
    }
}
