package com.beauty.beautysalon.repositories;

import com.beauty.beautysalon.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
