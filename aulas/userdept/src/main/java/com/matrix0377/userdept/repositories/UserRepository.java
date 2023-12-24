package com.matrix0377.userdept.repositories;

import com.matrix0377.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
