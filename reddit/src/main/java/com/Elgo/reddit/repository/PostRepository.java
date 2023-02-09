package com.Elgo.reddit.repository;


import com.Elgo.reddit.model.Post;
import com.Elgo.reddit.model.Subreddit;
import com.Elgo.reddit.model.Usr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post>findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(Usr user);

}
