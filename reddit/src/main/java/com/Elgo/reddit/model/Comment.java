package com.Elgo.reddit.model;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

import static jakarta.persistence.FetchType.LAZY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Comment {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long commentId;

    @Lob
    @NotEmpty
    private String text;

    private Instant commentCreationDate;

    @ManyToOne(fetch = LAZY )
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "userId"
    )
    private Usr user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(
            name = "post_id",
            referencedColumnName = "postId"
    )
    private Post post;

    private Instant createdDate;
}
