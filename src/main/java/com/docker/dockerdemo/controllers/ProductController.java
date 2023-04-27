package com.docker.dockerdemo.controllers;

import com.docker.dockerdemo.dtos.ProductDto;
import com.docker.dockerdemo.entities.Products;
import com.docker.dockerdemo.repositories.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository  productRepository;
    @PostMapping("/products")
    public ResponseEntity<Object> saveProducts(@RequestBody ProductDto productDto) {
        Products products = new Products();
        BeanUtils.copyProperties(productDto, products);
        return new ResponseEntity<>(productRepository.save(products), HttpStatus.OK);
    }
}
