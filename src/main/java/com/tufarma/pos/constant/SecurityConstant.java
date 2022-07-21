package com.tufarma.pos.constant;

public class SecurityConstant {
    public static final long EXPIRATION_TIME = 14400000; // 4h in miliseconds
    public static final String TOKEN_HEADER = "Bearer ";
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
    public static final String EDWIN_DEV_LLC = "Edwindev, LLC";
    public static final String EDWIN_DEV_ADMINISTRATION = "User MAnagement Portal";
    public static final String AUTHORITIES = "authorities";
    public static final String FORBIDDEN_MESSAGE = "You need to log in to acces this page";
    public static final String ACCESS_DENIED_MESSAGE = "You do not have permission to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    public static final String[] PUBLIC_URLS = {
            "/user/login",
            "/user/new",
            "/user/resetpassword/**",
            "/user/image/**"
    };
}
