import java.util.HashMap;
import java.util.Map;

/**
 * Created by las on 18/07/17.
 */
public class InMemoryUserService implements UserService {

    private static Map<Long, User> usersById = new HashMap<>();

    public InMemoryUserService() {
        // initial population
        usersById.put(1L, new User(1L, "Arthur"));
        usersById.put(2L, new User(2L, "Maicon"));
    }

    @Override
    public User findUserById(Long id) {
        return usersById.get(id);
    }
}
