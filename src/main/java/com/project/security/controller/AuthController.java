package com.project.security.controller;

import com.project.security.model.dto.request.LoginRequestDto;
import com.project.security.model.dto.request.SignUpRequestDto;
import com.project.security.model.dto.response.TokenResponseDto;
import com.project.security.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/")
@RequiredArgsConstructor
public class AuthController {

  private final AuthService authService;

  @PostMapping("sign-in")
  public ResponseEntity<TokenResponseDto> authenticateUser(
      @RequestBody LoginRequestDto loginRequest) {
    return ResponseEntity.ok(authService.signIn(loginRequest));
  }

  @PostMapping("sign-up")
  public ResponseEntity<?> registerUser(@RequestBody SignUpRequestDto signUpRequest) {
    return ResponseEntity.ok(authService.signUp(signUpRequest));
  }
}
