import java.util.Optional;

/**
 * Created by las on 18/07/17.
 */
public class Application {

    public static void main(String[] args) {
        UserService userService = new InMemoryUserService();

        Long userId = 3L;

        Optional<User> result = userService.findUserById(userId);

        if (result.isPresent()) {
            User user = result.get();
            System.out.println(user.getName());
        }
    }
}
