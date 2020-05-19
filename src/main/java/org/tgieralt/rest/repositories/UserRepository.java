package org.tgieralt.rest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.tgieralt.rest.models.User;

/**
 *
 * @author tgier
 */
public interface UserRepository extends CrudRepository<User, Integer>{
    
}
