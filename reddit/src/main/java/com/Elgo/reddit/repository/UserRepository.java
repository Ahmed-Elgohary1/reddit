package com.Elgo.reddit.repository;

import com.Elgo.reddit.model.Usr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Usr,Long> {

    Optional<Usr> findByUsername(String username);

}
