package com.ddt.persistence.mapper;

import com.ddt.domain.dtos.user.CreateUserRequest;
import com.ddt.domain.dtos.user.UserResponse;
import com.ddt.domain.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "email", target = "email")
//    @Mapping(source = "name", target = "name")
    UserResponse userEntityToUserResponse(UserEntity userEntity);

    @Mapping(source = "email", target = "Email")
    @Mapping(source = "name", target = "Name")
    @Mapping(source = "password", target = "Password")
    UserEntity createUserRequestToUserEntity(CreateUserRequest createUserRequest);

//    @Mapping(source = "Id", target = "id")
//    @Mapping(source = "Email", target = "email")
//    @Mapping(source = "Name", target = "name")
    List<UserResponse> listUserEntityToListUserResponse(List<UserEntity> userEntities);
}
