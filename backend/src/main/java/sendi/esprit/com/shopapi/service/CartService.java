package sendi.esprit.com.shopapi.service;

import sendi.esprit.com.shopapi.entity.Cart;
import sendi.esprit.com.shopapi.entity.ProductInOrder;
import sendi.esprit.com.shopapi.entity.User;

import java.util.Collection;

/**
 * Created By Mahmoud on 06/10/2020.
 */
public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
