package com.Elgo.reddit.mapper;

import com.Elgo.reddit.dto.CommentsDto;
import com.Elgo.reddit.model.Comment;
import com.Elgo.reddit.model.Post;
import com.Elgo.reddit.model.Usr;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.WARN)
public interface CommentMapper {
    @Mapping(target = "commentId", ignore = true)
    @Mapping(target = "text", expression = "java(getText(commentsDto))")
    @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())")
    @Mapping(target = "post", expression = "java(getPost(post))")
    @Mapping(target = "user", expression = "java(commentsDto.getUser())")
    Comment map(CommentsDto commentsDto, Post post);

    /// HELPER FUNCTION
    default String getText(CommentsDto commentsDto)
    {
        return commentsDto.getText();
    }
    default Post getPost(Post post)
    {
        return post;
    }
    default Usr getUser(Usr user)
    {
        return user;
    }

    @Mapping(target = "postId", expression = "java(comment.getPost().getPostId())")
    @Mapping(target = "userName", expression = "java(comment.getUser().getUsername())")
    CommentsDto mapToDto(Comment comment);
}
