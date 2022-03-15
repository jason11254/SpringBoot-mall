package com.jason.springbootmall.service.impl;

import com.jason.springbootmall.dao.ProductMapper;
import com.jason.springbootmall.model.Product;
import com.jason.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public Product getProductById(Integer productId) {
        return productMapper.getProductById(productId);
    }
}
