package com.example.CRUDDEMOONE.demoCRUDONE.repository;

import com.example.CRUDDEMOONE.demoCRUDONE.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<User, Integer> {
}
