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

    @Override
    public void createOreUpdateUser(User user) {
        daoRepo.createUser(user);
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
