package ysh.login.Repository;

import ysh.login.Entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {

    // 로그인을 할 때 아이디(username)로 회원 정보를 찾아오는 기능
    Optional<LoginEntity> findByUsername(String username);
}
