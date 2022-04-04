package com.jason.springbootmall.mapper;

import com.jason.springbootmall.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component
public interface ProductMapper {
    Product getProductById(Integer productId);
    Integer createProduct(Product product);
    Integer updateProduct(Product product);
    Integer deleteProductById(Integer productId);
    List<Product> getProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsBySearch(String search);
    List<Product> getProductsByCategoryAndSearch(String category,String search);
}
