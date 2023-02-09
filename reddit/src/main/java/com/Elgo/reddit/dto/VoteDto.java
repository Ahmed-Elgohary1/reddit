package com.Elgo.reddit.dto;

import com.Elgo.reddit.model.Usr;
import com.Elgo.reddit.model.vote.VoteType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoteDto {
    private VoteType voteType;
    private Long postId;
    private Usr user;
}
