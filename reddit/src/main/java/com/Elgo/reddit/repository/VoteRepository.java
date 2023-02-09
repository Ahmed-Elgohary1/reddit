package com.Elgo.reddit.repository;

import com.Elgo.reddit.model.Post;
import com.Elgo.reddit.model.Usr;
import com.Elgo.reddit.model.vote.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote,Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, Usr currentUser);
}
