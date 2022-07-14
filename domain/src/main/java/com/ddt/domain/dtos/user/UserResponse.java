package com.ddt.domain.dtos.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Schema(hidden = true)
public class UserResponse {
//    @JsonProperty("user_id")
    private Long Id;
    private String Email;
    private String Name;
}
