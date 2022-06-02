package com.sparta.homwork2.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignupRequestDto {
    private String username;
    private String password;
    private String email;
    private boolean admin = false;//admin이 트루면 일반 회원, 팔스면 관리자
    private String adminToken = "";
}