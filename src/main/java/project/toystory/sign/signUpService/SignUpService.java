package project.toystory.sign.signUpService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.toystory.sign.dto.SignUpRequest;
import project.toystory.sign.dto.SignUpResponse;
import project.toystory.sign.signUpRepository.SignUpRepository;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class SignUpService {

    private final SignUpRepository signUpRepository;

    public SignUpResponse signUp(SignUpRequest request) {
        return new SignUpResponse(signUpRepository.save(request.saveMember()));
    }
}
