package com.codegym.demo.service;

public interface IService<T> {
    Iterable<T> findAll();
    T save(T t);
    void delete(Long id);
    T findById(Long id);
}
