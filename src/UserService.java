import java.util.Optional;

/**
 * Created by las on 18/07/17.
 */
public interface UserService {

    Optional<User> findUserById(Long id);
}
