/**
 * Created by las on 18/07/17.
 */
public class Application {

    public static void main(String[] args) {
        UserService userService = new InMemoryUserService();

        Long userId = 1L;

        User user = userService.findUserById(userId);

        System.out.println(user);
    }
}
