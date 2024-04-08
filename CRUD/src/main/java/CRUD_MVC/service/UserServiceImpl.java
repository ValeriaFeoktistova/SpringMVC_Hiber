package CRUD_MVC.service;

import CRUD_MVC.daoRepo.DaoRepo;
import CRUD_MVC.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final DaoRepo daoRepo;

    public UserServiceImpl(DaoRepo daoRepo) {
        this.daoRepo = daoRepo;
    }

    @Override
    public List<User> getAllUsers() {
        return daoRepo.getAllUsers();
    }


    public void createUser(User user) {
        daoRepo.createUser(user);
    }

    public void updateUser(User user) {
        daoRepo.updateUser(user);
    }

    @Override
    public void createOreUpdateUser(User user) {
        if (0 == user.getId()) {
            createUser(user);
        } else {
            updateUser(user);
        }
    }

    @Override
    public User getUser(long id) {
        return daoRepo.getUser(id);
    }

    @Override
    public User deleteUser(long id) {
        daoRepo.deleteUser(id);
        return new User();
    }


}
