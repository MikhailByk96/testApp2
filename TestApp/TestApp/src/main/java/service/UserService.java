package service;

import testapp.model.UserModel;

public interface UserService {
    void save(UserModel user);
    UserModel findByLogin(String login);
}
