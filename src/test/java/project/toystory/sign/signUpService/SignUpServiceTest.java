package project.toystory.sign.signUpService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import project.toystory.sign.dto.SignUpRequest;
import project.toystory.sign.dto.SignUpResponse;
import project.toystory.sign.signUpRepository.SignUpRepository;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SignUpServiceTest {

    @Autowired
    private SignUpService signUpService;

    @Autowired
    private SignUpRepository signUpRepository;

    @BeforeEach
    void clean() {
        signUpRepository.deleteAll();
    }

    @Test
    @DisplayName("회원 가입")
    void signUp() {
        SignUpRequest request = SignUpRequest.builder()
                .email("neverdie4757@gmail.com")
                .password("1234")
                .nickname("정민서")
                .build();

        SignUpResponse response = signUpService.signUp(request);

        Assertions.assertEquals(1L, response.getId());
    }

}