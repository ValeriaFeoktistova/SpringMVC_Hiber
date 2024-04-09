package CRUD_MVC.service;

import CRUD_MVC.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void createOreUpdateUser(User user);

    User getUser(long id);

    User deleteUser(long id);

}
