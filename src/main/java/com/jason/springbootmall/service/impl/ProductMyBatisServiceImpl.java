package com.jason.springbootmall.service.impl;

import com.jason.springbootmall.constant.ProductCategory;
import com.jason.springbootmall.mapper.ProductMapper;
import com.jason.springbootmall.dto.ProductQueryParams;
import com.jason.springbootmall.dto.ProductRequest;
import com.jason.springbootmall.dto.ProductRequestMethod;
import com.jason.springbootmall.model.Product;
import com.jason.springbootmall.service.ProductMyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;

@Component
public class ProductMyBatisServiceImpl implements ProductMyBatisService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public Product getProductById(Integer productId) {
        return productMapper.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        Product product = ProductRequestMethod.matchIntoProduct(productRequest);
        Date now = new Date();
        product.setCreatedDate(now);
        product.setLastModifiedDate(now);

        productMapper.createProduct(product);

        return product.getProductId();
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        Product product = ProductRequestMethod.matchIntoProduct(productRequest);
        product.setProductId(productId);
        Date now = new Date();
        product.setLastModifiedDate(now);
        productMapper.updateProduct(product);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productMapper.deleteProductById(productId);
    }

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        ProductCategory productCategory = productQueryParams.getCategory();
        String category = null;
        String search = productQueryParams.getSearch();
        if (productCategory != null)
            category = productCategory.name();
        if (search != null)
            search = "%"+search+"%";
        String orderByAndSort = productQueryParams.getOrderBy()+" "+productQueryParams.getSort();
        return productMapper.getProducts(category, search, orderByAndSort);
    }

}
