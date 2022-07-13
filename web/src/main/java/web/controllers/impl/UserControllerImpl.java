package web.controllers.impl;

import com.ddt.domain.dtos.common.ApiResponse;
import com.ddt.domain.dtos.common.ResponseCode;
import com.ddt.domain.dtos.user.CreateUserRequest;
import com.ddt.domain.dtos.user.UserResponse;
import com.ddt.persistence.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import web.controllers.UserController;

import java.util.List;

@RestController
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
