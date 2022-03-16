package com.jason.springbootmall.dto;

import com.jason.springbootmall.model.Product;

public class ProductRequestMethod {
    public static Product matchIntoProduct(ProductRequest productRequest){
        Product product = new Product();
        product.setProductName(productRequest.getProductName());
        product.setCategory(productRequest.getCategory());
        product.setImageUrl(productRequest.getImageUrl());
        product.setPrice(productRequest.getPrice());
        product.setStock(productRequest.getStock());
        product.setDescription(productRequest.getDescription());
        return product;
    }
}
