import java.util.Optional;

/**
 * Created by las on 18/07/17.
 */
public class Application {

    public static void main(String[] args) {
        UserService userService = new InMemoryUserService();

        // Add new users

        User user = new User(null, null);

        userService.saveUser(user);

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
