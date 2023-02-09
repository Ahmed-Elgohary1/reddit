package com.Elgo.reddit.dto;

import com.Elgo.reddit.model.Usr;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PostRequest {

    private Long postId;
    private String subredditName;
    private String postName;
    private String url;
    private String description;
    private Usr user;
}
