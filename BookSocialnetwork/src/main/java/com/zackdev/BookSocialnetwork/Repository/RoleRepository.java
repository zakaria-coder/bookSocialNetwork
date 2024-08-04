package com.zackdev.BookSocialnetwork.Repository;

import com.zackdev.BookSocialnetwork.Entity.Role;
import com.zackdev.BookSocialnetwork.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(String role);
}
