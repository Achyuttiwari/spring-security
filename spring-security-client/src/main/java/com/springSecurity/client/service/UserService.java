package com.springSecurity.client.service;

import com.springSecurity.client.entity.User;
import com.springSecurity.client.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);
}
