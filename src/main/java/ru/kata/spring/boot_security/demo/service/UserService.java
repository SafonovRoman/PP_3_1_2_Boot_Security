package ru.kata.spring.boot_security.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void add(User user);
    User getUser(Long id);
    List<User> listUsers();
    void update(User user);
    void delete(Long id);
    void addRoles(User user, Long[] rolesIds);
}
