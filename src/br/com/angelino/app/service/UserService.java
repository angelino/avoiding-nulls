package br.com.angelino.app.service;

import br.com.angelino.app.model.User;

import java.util.Optional;

/**
 * Created by las on 18/07/17.
 */
public interface UserService {

    Optional<User> findUserById(Long id);

    Iterable<User> findAllUsers();

    void saveUser(User newUser);
}
