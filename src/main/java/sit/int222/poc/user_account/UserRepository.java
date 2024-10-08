package sit.int222.poc.user_account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);

    Optional<User> findByOid(String ownerId);

    Optional<User> findByName(String username);
}