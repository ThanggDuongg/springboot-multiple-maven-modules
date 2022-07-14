package com.ddt.web.controllers;

import com.ddt.domain.dtos.common.ApiResponse;
import com.ddt.domain.dtos.user.CreateUserRequest;
import com.ddt.domain.dtos.user.UserResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Tag(name = "UserAccount", description = "APIs quản lý User")
@CrossOrigin(maxAge = 3600)
@RequestMapping(value = "api/v1/user")
public interface UserController {
    @PostMapping("/create")
    @Operation(summary = "Thêm mới user & account vào hệ thống")
    ResponseEntity<ApiResponse<UserResponse>> createNewUser(
            @Valid
            @RequestBody CreateUserRequest createUserRequest
    );

    @GetMapping("/")
    @Operation(summary = "Lấy tất cả users")
    ResponseEntity<ApiResponse<List<UserResponse>>> getAll();
}
