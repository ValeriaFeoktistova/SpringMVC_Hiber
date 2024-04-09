package CRUD_MVC.service;

import CRUD_MVC.daoRepo.DaoRepo;
import CRUD_MVC.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final DaoRepo daoRepo;

    public UserServiceImpl(DaoRepo daoRepo) {
        this.daoRepo = daoRepo;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return daoRepo.getAllUsers();
    }

    @Transactional
    public void createUser(User user) {
        daoRepo.createUser(user);
    }

    @Transactional
    public void updateUser(User user) {
        daoRepo.updateUser(user);
    }

    @Override
    @Transactional
    public void createOreUpdateUser(User user) {
        if (0 == user.getId()) {
            createUser(user);
        } else {
            updateUser(user);
        }
    }

    @Override
    @Transactional
    public User getUser(long id) {
        return daoRepo.getUser(id);
    }

    @Override
    @Transactional
    public User deleteUser(long id) {
        daoRepo.deleteUser(id);
        return new User();
    }

}
