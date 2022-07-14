package com.ddt.web.controllers.impl;

import com.ddt.domain.dtos.common.ApiResponse;
import com.ddt.domain.dtos.common.ResponseCode;
import com.ddt.domain.dtos.user.CreateUserRequest;
import com.ddt.domain.dtos.user.UserResponse;
import com.ddt.persistence.services.UserService;
import com.ddt.web.controllers.UserController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestControllerAdvice
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {
    private final UserService _userService;

    @Override
    public ResponseEntity<ApiResponse<UserResponse>> createNewUser(CreateUserRequest createUserRequest) {
        return new ResponseEntity<>(
                new ApiResponse<UserResponse>().responseEntity(
                        this._userService.createNewUser(createUserRequest),
                        ResponseCode.SUCCESS_CREATE_USER),
                        HttpStatus.CREATED
                );
    }

    @Override
    public ResponseEntity<ApiResponse<List<UserResponse>>> getAll() {
        return new ResponseEntity<>(
            new ApiResponse<List<UserResponse>>().responseEntity(
                    this._userService.getAllUser(),
                    ResponseCode.SUCCESS_CREATE_USER),
                    HttpStatus.OK
        );
    }
}
