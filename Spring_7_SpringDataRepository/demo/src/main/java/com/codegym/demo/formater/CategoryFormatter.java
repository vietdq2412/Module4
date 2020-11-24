package com.codegym.demo.formater;

import com.codegym.demo.model.Category;
import com.codegym.demo.service.category.ICategorySevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class CategoryFormatter implements Formatter<Category> {
//    @Autowired
    private ICategorySevice categorySevice;

    @Autowired
    public CategoryFormatter(ICategorySevice categorySevice){
        this.categorySevice = categorySevice;
    }

    @Override
    public Category parse(String text, Locale locale) throws ParseException {
        return categorySevice.findById(Long.parseLong(text));
    }

    @Override
    public String print(Category object, Locale locale) {
        return null;
    }
}
