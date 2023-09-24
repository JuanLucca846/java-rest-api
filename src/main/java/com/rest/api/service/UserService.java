package com.rest.api.service;

import com.rest.api.domain.model.User;

public interface UserService {
    User findById(Long id);

    User createUser(User userToCreate);
}
