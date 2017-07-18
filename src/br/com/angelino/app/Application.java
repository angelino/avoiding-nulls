package br.com.angelino.app;

import br.com.angelino.app.model.User;
import br.com.angelino.app.service.InMemoryUserService;
import br.com.angelino.app.service.UserService;

import java.util.Optional;

/**
 * Created by las on 18/07/17.
 */
public class Application {

    public static void main(String[] args) {
        UserService userService = new InMemoryUserService();

        // Add new users
        userService.saveUser(new User(1L, "Huguinho"));
        userService.saveUser(new User(2L, "Zezinho"));
        userService.saveUser(new User(3L, "Luizinho"));

        // Find user by id
        Optional<User> result = userService.findUserById(2L);
        result.ifPresent(u -> System.out.println(u.getName()));

        // Show all users
        Iterable<User> allUsers = userService.findAllUsers();
        allUsers.forEach(System.out::println);
    }
}
