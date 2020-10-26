package sendi.esprit.com.shopapi.service;

import sendi.esprit.com.shopapi.entity.ProductCategory;

import java.util.List;

/**
 * Created By Mahmoud on 06/10/2020.
 */
public interface CategoryService {

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
