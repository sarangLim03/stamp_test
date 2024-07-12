package service;

import service.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // 추가적인 데이터베이스 작업이 필요하면 여기에 메소드를 추가할 수 있습니다.
}
