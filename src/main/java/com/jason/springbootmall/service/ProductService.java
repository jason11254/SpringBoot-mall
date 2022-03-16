package com.jason.springbootmall.service;

import com.jason.springbootmall.dto.ProductRequest;
import com.jason.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId,ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
