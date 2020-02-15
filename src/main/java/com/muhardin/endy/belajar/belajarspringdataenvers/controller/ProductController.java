package com.muhardin.endy.belajar.belajarspringdataenvers.controller;

import com.muhardin.endy.belajar.belajarspringdataenvers.dao.ProductDao;
import com.muhardin.endy.belajar.belajarspringdataenvers.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ProductController {
    @Autowired private ProductDao productDao;

    @GetMapping("/api/product")
    public Page<Product> findProducts(Pageable pageable) {
        return productDao.findAll(pageable);
    }

    @PostMapping("/api/product")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody @Valid Product product) {
        productDao.save(product);
    }

    @PutMapping("/api/product/{id}")
    public void updateProduct(@PathVariable("id") Product oldValue, @RequestBody @Valid Product newValue) {
        newValue.setId(oldValue.getId());
        newValue.setCreatedTime(oldValue.getCreatedTime());
        newValue.setCreatedBy(oldValue.getCreatedBy());
        productDao.save(newValue);
    }
}
