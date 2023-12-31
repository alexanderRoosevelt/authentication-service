package com.project.security.service;

import com.project.security.exceptions.UserNotFoundException;
import com.project.security.model.dto.request.UserRequestDto;
import com.project.security.model.dto.response.UserResponseDto;
import java.util.List;

public interface AdminService {

  UserResponseDto createUser(UserRequestDto userRequest);
  UserResponseDto updateUser(UserRequestDto userRequest, Long userId) throws UserNotFoundException;
  List<UserResponseDto> getAllUsers();
  UserResponseDto findById(Long userId) throws UserNotFoundException;
  void deleteUser(Long userId);
  void deleteAllUsers(List<Long> userIds);
}
