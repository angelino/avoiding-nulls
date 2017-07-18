/**
 * Created by las on 18/07/17.
 */
public class Application {

    public static void main(String[] args) {
        UserService userService = new InMemoryUserService();

        Long userId = 3L;

        User user = userService.findUserById(userId);

        if (user != null) {
            System.out.println(user.getName());
        }
    }
}
