package sendi.esprit.com.shopapi.repository;

import sendi.esprit.com.shopapi.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By Mahmoud on 1/2/2019.
 */

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
