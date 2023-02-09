package com.Elgo.reddit.repository;

import com.Elgo.reddit.model.Comment;
import com.Elgo.reddit.model.Post;
import com.Elgo.reddit.model.Usr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(Usr user);
}
