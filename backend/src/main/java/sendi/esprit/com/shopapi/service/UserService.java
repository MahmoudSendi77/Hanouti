package sendi.esprit.com.shopapi.service;


import sendi.esprit.com.shopapi.entity.User;

import java.util.Collection;

/**
 * Created By Mahmoud on 06/13/2020.
 */
public interface UserService {
    User findOne(String email);

    Collection<User> findByRole(String role);

    User save(User user);

    User update(User user);
}
