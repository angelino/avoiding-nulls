import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by las on 18/07/17.
 */
public class InMemoryUserService implements UserService {

    private static Map<Long, User> usersById = new HashMap<>();

    @Override
    public Optional<User> findUserById(Long id) {
        Long lookupId = Objects.requireNonNull(id, "id is required for lookup");
        User user = usersById.get(lookupId);
        return Optional.ofNullable(user);
    }

    @Override
    public Iterable<User> findAllUsers() {
        // By default, HashMap#values() return an empty collection if the map is empty
        return usersById.values();
    }

    @Override
    public void saveUser(User newUser) {
        usersById.put(newUser.getId(), newUser);
    }
}
