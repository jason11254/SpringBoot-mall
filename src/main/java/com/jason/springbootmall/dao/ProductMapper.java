package com.jason.springbootmall.dao;

import com.jason.springbootmall.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProductMapper {
    Product getProductById(Integer productId);
    Integer createProduct(Product product);
}
