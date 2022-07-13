package com.ddt.persistence.services;

import com.ddt.domain.dtos.user.CreateUserRequest;
import com.ddt.domain.dtos.user.UserResponse;
import com.ddt.domain.entities.UserEntity;
import com.ddt.persistence.mapper.UserMapper;
import com.ddt.persistence.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository _userRepository;

    public UserResponse createNewUser(CreateUserRequest createUserRequest) {
        UserEntity userEntity = UserMapper.INSTANCE.createUserRequestToUserEntity(createUserRequest);
        return UserMapper.INSTANCE.userEntityToUserResponse(this._userRepository.save(userEntity));
    }

    public List<UserResponse> getAllUser() {
        return UserMapper.INSTANCE.listUserEntityToListUserResponse(
                this._userRepository.findAll()
        );
    }
}
