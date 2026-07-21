package ysh.login.Service;

import ysh.login.Dto.LoginRequestDto;
import ysh.login.Entity.LoginEntity;
import ysh.login.Repository.LoginRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Transactional
    public void signup(LoginRequestDto requestDto) {
        LoginEntity entity = new LoginEntity();
        entity.setUsername(requestDto.getUsername());
        entity.setPassword(requestDto.getPassword());

        loginRepository.save(entity);
    }
}
