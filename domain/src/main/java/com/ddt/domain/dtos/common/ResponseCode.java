package com.ddt.domain.dtos.common;

import lombok.Getter;

@Getter
public enum ResponseCode {
    SUCCESS(true, 2000000, "success", "success", "Request thành công "),
    SUCCESS_CREATE_USER(true, 2010001, "create_user_success", "User created", "Tạo user mới thành công"),
    SUCCESS_DELETE_USER(true, 2000002, "delete_user_success", "User deleted", "xóa user thành công"),
    SUCCESS_SIGN_IN(true, 2000001, "log_in_success", "Log in successful", "Đăng nhập thành công "),
    SUCCESS_RESET_PASSWORD(true, 2000005, "reset_password_success", "Password is change success", "Đổi mật khẩu thành công"),
    SUCCESS_UPDATE_PROFILE(true, 2000003, "update_profile_success", "Update user profile", "Cập nhật thông tin thành công "),
    SUCCESS_LOG_OUT(true, 2000006, "log_out_success", "Log out success", "Đăng xuất thành công "),

    ERROR_USERNAME_NOT_AVAILABLE(false, 4000001, "username_not_available", "user name not available", "tên đăng nhập không có sẵn"),
    ERROR_CREATE_USER(false, 4000002, "create_user_false", "error create user", "Tạo tài khoản mới thất bại"),
    ERROR_PASSWORD_NOT_VALID(false, 4000003, "password_not_valid", "password not valid", "mật khẩu không chính xác"),
    ERROR_NOT_FOUND_USER(false, 4040002, "not_found_user", "user not found", "user không tồn tại"),
    BAD_REQUEST(false, 4000000, "bad_request", "bad request", "request lỗi "),
    ERROR_USER_IS_EXIST(false, 4000005, "use_is_exist", "User is exist", "user đã tồn tại "),
    ERROR_REFRESH_TOKEN_INVALID(false, 4000009, "refresh_token_is_invalid", "refresh token is invalid", "refresh token is invalid "),

    UNAUTHORIZED(false, 4010001, "unauthorized", "unauthorized", "Chưa đăng nhập"),

    FORBIDDEN(false, 4030000, "forbidden", "forbidden", "Không đủ quyền"),

    ERROR_INTERNAL_SERVER_ERROR(false, 5000000, "internal_server_error", "internal sever error", "lỗi code"),
    ERROR_CONNECT_KEYCLOAK(false, 5000001, "can't connect keycloak", "can't connect keycloak", "không thể kết nối keycloak"),

    SUCCESS_CREATE_ACCOUNT(true, 2010002, "create_account_success", "Account created", "Tạo account mới thành công"),
    SUCCESS_UPDATE_ACCOUNT(true, 2010004, "update_account_success", "Account updated", "Update account thành công"),
    SUCCESS_ACTIVATE_ACCOUNT(true, 2010006, "activate_account_success", "Account activated", "Activated account thành công"),
    SUCCESS_CREATE_PROJECT(true, 2010008, "create_project_success", "Project created", "Tạo project mới thành công"),
    SUCCESS_UPDATE_PROJECT(true, 2010009, "update_project_success", "Project updated", "Update project thành công"),
    SUCCESS_ACTIVATE_PROJECT(true, 2010010, "activate_project_success", "Project activated", "Activated project thành công"),
    SUCCESS_CREATE_USERACCOUNT(true, 2010011, "create_UserAccount_success", "UserAccount created", "Tạo UserAccount mới thành công"),
    ERROR_CREATE_PROJECT(false, 4000010, "create_account_error", "Project not created", "Tạo project fail"),
    ERROR_UPDATE_PROJECT(false, 4000011, "update_project_error", "Project not updated", "Update project fail"),
    ERROR_ACTIVATE_PROJECT(false, 4000012, "activate_project_error", "Project not activated", "Activated project fail"),
    ERROR_CREATE_USERACCOUNT(false, 4000013, "create_userAccount_error", "UserAccount not created", "Tạo userAccount fail"),
    ERROR_CREATE_ACCOUNT(false, 4000014, "create_account_error", "Account not created", "Tạo account fail"),
    ERROR_UPDATE_ACCOUNT(false, 4000015, "update_account_error", "Account not updated", "Update account fail"),
    ERROR_ACTIVATE_ACCOUNT(false, 4000016, "update_account_error", "Account not activate", "Activated account fail"),

    ERROR_USER_NOT_FOUND(false, 4040001, "user_not_found", "UserCommand not found", "Không tìm thấy người dùng"),
    ERROR_NOT_FOUND_PROJECT(false, 4040002, "activate_account_error", "Account activated", "Activated account fail"),
    ERROR_NOT_FOUND_USERACCOUNT(false, 4040003, "activate_account_error", "Account activated", "Activated account fail"),
    ERROR_NOT_FOUND_ACCOUNT(false, 4040004, "activate_account_error", "Account activated", "Activated account fail"),

    ERROR_INTERNAL_SERVER(false, 5000000, "internal_server_error", "internal sever error", "lỗi code");

    final boolean success;
    final int value;
    final String code;
    final String message;
    final String description;

    ResponseCode(final boolean success, final int value, final String code, final String message, final String description) {
        this.success = success;
        this.value = value;
        this.code = code;
        this.message = message;
        this.description = description;
    }
}
