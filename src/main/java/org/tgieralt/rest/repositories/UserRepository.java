package org.tgieralt.rest.repositories;

import java.util.Optional;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.tgieralt.rest.models.User;

/**
 *
 * @author tgier
 */
@CrossOrigin
public interface UserRepository extends PagingAndSortingRepository<User, Integer>{
    public Optional<User> findByUsername(String username);
}
