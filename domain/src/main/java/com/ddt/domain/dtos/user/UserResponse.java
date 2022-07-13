package com.ddt.domain.dtos.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserResponse {
    @JsonProperty("user_id")
    private Long id;
    private String email;
    private String name;
}
