package CRUD_MVC.daoRepo;

import CRUD_MVC.model.User;

import java.util.List;

public interface DaoRepo {
    List<User> getAllUsers();

    void createUser(User user);

    public void updateUser(User user);

    void deleteUser(long id);

    User getUser(long id);
}

