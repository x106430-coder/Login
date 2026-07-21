package ysh.login.Controller; // 본인의 패키지 경로에 맞게 확인하세요

import org.springframework.web.bind.annotation.*;
import ysh.login.Dto.LoginRequestDto;
import ysh.login.Service.LoginService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    // 1. 회원가입 API
    @PostMapping("/signup")
    public String signup(@RequestBody LoginRequestDto requestDto) {
        loginService.signup(requestDto);
        return "회원가입 성공!";
    }

    // 2. 로그인 API (기존에 작성하셨던 로그인 메서드가 있다면 이 위치에 함께 유지하시면 됩니다)
    @PostMapping("/login")
    public String login(@RequestBody LoginRequestDto requestDto) {
        // 로그인 로직 처리 부분
        return "로그인 성공!";
    }
}