package com.muhardin.endy.belajar.belajarspringdataenvers.controller;

import com.muhardin.endy.belajar.belajarspringdataenvers.dao.ProductDao;
import com.muhardin.endy.belajar.belajarspringdataenvers.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.history.Revisions;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductHistoryController {
    @Autowired private ProductDao productDao;

    @GetMapping("/api/history/product/{id}")
    public ResponseEntity<Revisions<Integer, Product>> findRevisions(@PathVariable String id){
        Revisions<Integer, Product> hasil = productDao.findRevisions(id);
        if (hasil.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(hasil);
    }
}
