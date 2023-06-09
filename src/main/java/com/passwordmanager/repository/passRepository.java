package com.passwordmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.passwordmanager.domain.User;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface passRepository extends JpaRepository<User, Integer> {
    List<User> findByNameContainingIgnoreCase(String keyword);
}
