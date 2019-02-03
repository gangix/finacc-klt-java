/**
 * 
 */
package de.c24.finacc.klt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import de.c24.finacc.klt.model.User;

@RestResource(exported = false)
public interface UserRepository extends CrudRepository<User, Long> {

}
