package com.codegym.demo.service.category;

import com.codegym.demo.model.Category;
import com.codegym.demo.repo.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService implements ICategorySevice {

    @Autowired
    private ICategoryRepository categorySevice;

    @Override
    public Iterable<Category> findAll() {
        return categorySevice.findAll();
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Category findById(Long id) {
        return categorySevice.findOne(id);
//        return categorySevice.findById(id);
    }
}
