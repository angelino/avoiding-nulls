import java.util.Optional;

/**
 * Created by las on 18/07/17.
 */
public class Application {

    public static void main(String[] args) {
        UserService userService = new InMemoryUserService();

        // Add new users

        User huguinho = new User(1L, "Huguinho");
        User zezinho = new User(2L, "Zezinho");
        User luizinho = new User(3L, "Luizinho");

        userService.saveUser(huguinho);
        userService.saveUser(zezinho);
        userService.saveUser(luizinho);

        // Find user by id

        Long userId = 2L;

        Optional<User> result = userService.findUserById(userId);

        result.ifPresent(u -> System.out.println(u.getName()));

        // Show all users

        Iterable<User> allUsers = userService.findAllUsers();

        for (User u : allUsers) {
            System.out.println(u);
        }
    }
}
