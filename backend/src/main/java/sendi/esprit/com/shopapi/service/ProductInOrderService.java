package sendi.esprit.com.shopapi.service;

import sendi.esprit.com.shopapi.entity.ProductInOrder;
import sendi.esprit.com.shopapi.entity.User;

/**
 * Created By Mahmoud on 1/06/2019.
 */
public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
