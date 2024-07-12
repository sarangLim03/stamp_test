package service;

import service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(String userid) {
        User user = new User();
        user.setUserid(userid);
        return userRepository.save(user);
    }
}
