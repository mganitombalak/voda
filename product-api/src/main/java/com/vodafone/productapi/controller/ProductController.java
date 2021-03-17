package com.vodafone.productapi.controller;

import com.vodafone.productapi.domain.Product;
import com.vodafone.productapi.model.GenericResponse;
import com.vodafone.productapi.service.ProductService;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @SneakyThrows
    @GetMapping
    public GenericResponse<Iterable<Product>> get(){
        var result= new GenericResponse<Iterable<Product>>();
        result.setHostname(Inet4Address.getLocalHost().getHostName());
        result.setData(service.getProduct());
        return result;
    }
}
