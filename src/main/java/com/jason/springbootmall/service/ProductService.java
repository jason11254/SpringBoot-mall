package com.jason.springbootmall.service;

import com.jason.springbootmall.constant.ProductCategory;
import com.jason.springbootmall.dto.ProductRequest;
import com.jason.springbootmall.model.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId,ProductRequest productRequest);
    void deleteProductById(Integer productId);
    List<Product> getProducts(ProductCategory category,String search);
}
