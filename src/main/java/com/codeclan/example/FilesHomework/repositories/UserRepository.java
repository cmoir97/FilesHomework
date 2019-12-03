package com.codeclan.example.FilesHomework.repositories;

import com.codeclan.example.FilesHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
