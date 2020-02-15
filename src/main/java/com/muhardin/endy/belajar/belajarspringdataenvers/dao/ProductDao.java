package com.muhardin.endy.belajar.belajarspringdataenvers.dao;

import com.muhardin.endy.belajar.belajarspringdataenvers.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.history.RevisionRepository;

public interface ProductDao extends PagingAndSortingRepository<Product, String>, RevisionRepository<Product, String, Integer> {
}
