package com.Elgo.reddit.mapper;


import com.Elgo.reddit.dto.PostRequest;
import com.Elgo.reddit.dto.PostResponse;
import com.Elgo.reddit.model.Post;
import com.Elgo.reddit.model.Subreddit;
import com.Elgo.reddit.model.Usr;
import com.Elgo.reddit.model.vote.Vote;
import com.Elgo.reddit.model.vote.VoteType;
import com.Elgo.reddit.repository.CommentRepository;
import com.Elgo.reddit.repository.VoteRepository;
import com.github.marlonlom.utilities.timeago.TimeAgo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static com.Elgo.reddit.model.vote.VoteType.DOWNVOTE;
import static com.Elgo.reddit.model.vote.VoteType.UPVOTE;

@Mapper(componentModel = "spring")
public abstract  class PostMapper {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private VoteRepository voteRepository;



    @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())")
    @Mapping(target = "description", expression = "java(postRequest.getDescription())")
    @Mapping(target = "subreddit", expression = "java(getSubreddit(subreddit))")
    @Mapping(target = "voteCount", constant = "0")
    @Mapping(target = "user", expression = "java(postRequest.getUser())")
    public abstract Post map(PostRequest postRequest, Subreddit subreddit);
    /// HELPER FUNCTiONs


    Subreddit getSubreddit(Subreddit subreddit)
    {
        return subreddit;
    }


    @Mapping(target = "id", source = "postId")
    @Mapping(target = "subredditName", source = "subreddit.name")
    @Mapping(target = "userName", source = "user.username")
    @Mapping(target = "commentCount", expression = "java(commentCount(post))")
    @Mapping(target = "duration", expression = "java(getDuration(post))")
    @Mapping(target = "upVote", expression = "java(isPostUpVoted(post))")
    @Mapping(target = "downVote", expression = "java(isPostDownVoted(post))")
    public abstract PostResponse mapToDto(Post post);


    Integer commentCount(Post post) {
        return commentRepository.findByPost(post).size();
    }

    String getDuration(Post post) {
        return TimeAgo.using(post.getCreatedDate().toEpochMilli());
    }

    boolean isPostUpVoted(Post post) {
        return checkVoteType(post, UPVOTE);
    }

    boolean isPostDownVoted(Post post) {
        return checkVoteType(post, DOWNVOTE);
    }

    private boolean checkVoteType(Post post, VoteType voteType) {
       // It's Logical uncompleted
        return false;
    }


}

