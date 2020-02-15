package com.muhardin.endy.belajar.belajarspringdataenvers.dao;

import com.muhardin.endy.belajar.belajarspringdataenvers.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductDao extends PagingAndSortingRepository<Product, String> {
}
