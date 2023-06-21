package com.example.elasticsearchproject.repository;

import com.example.elasticsearchproject.entity.Product;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends ElasticsearchRepository<Product,String> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"category\": \"?0\"}}]}}")
    List<Product> findByCategory(String category);
}
