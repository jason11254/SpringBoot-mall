package com.jason.springbootmall.mapper;

import com.jason.springbootmall.dto.ProductMyBatisParams;
import com.jason.springbootmall.dto.ProductQueryParams;
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
    //List<Product> getProducts(String category,String search, String orderByAndSort);
    List<Product> getProducts(ProductMyBatisParams productMyBatisParams);
    Integer countProducts(ProductMyBatisParams productMyBatisParams);
}
