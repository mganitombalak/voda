package com.vodafone.productapi.service;

import com.vodafone.productapi.domain.Product;
import com.vodafone.productapi.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private IProductRepository repository;

    @Autowired
    public ProductService(IProductRepository repository) {
        this.repository = repository;
    }

    public Iterable<Product> getProduct(){
        return repository.findAll();
    }
}
