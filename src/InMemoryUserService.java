import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by las on 18/07/17.
 */
public class InMemoryUserService implements UserService {

    private static Map<Long, User> usersById = new HashMap<>();

    public InMemoryUserService() {
        // initial population
//        usersById.put(1L, new User(1L, "Arthur"));
//        usersById.put(2L, new User(2L, "Maicon"));
    }

    @Override
    public Optional<User> findUserById(Long id) {
        Long lookupId = Objects.requireNonNull(id, "id is required for lookup");
        User user = usersById.get(lookupId);
        return Optional.ofNullable(user);
    }

    @Override
    public Iterable<User> findAllUsers() {
        if (usersById.isEmpty()) {
            return null;
        }
        return usersById.values();
    }
}
