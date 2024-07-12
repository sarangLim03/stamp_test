package service;

import service.User;
import service.UserService;
import service.UserRequest;
import service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // POST 요청을 처리하는 메소드
    @PostMapping
    public void addUser(@RequestBody UserRequest userRequest) {
        User newUser = new User();  // 새로운 User 객체 생성
        newUser.setUserid(userRequest.getUserid());  // User 객체에 userid 설정
        newUser.setNickname(userRequest.getNickname());  // User 객체에 nickname 설정

        userRepository.save(newUser);  // userRepository를 통해 User 객체를 저장
    }
}