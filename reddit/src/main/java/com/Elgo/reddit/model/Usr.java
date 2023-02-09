package com.Elgo.reddit.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Usr {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "userId"
    )
    private long userId;
    @NotBlank(message = "Username is required")
    private String username;
      @NotBlank(message = "Password is required")
    private String password;

      @Email
      @NotEmpty(message = "Email is required")
    private String email;
    private Instant created;
    private boolean enabled;

}
