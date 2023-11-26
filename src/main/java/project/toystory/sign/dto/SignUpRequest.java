package project.toystory.sign.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.toystory.sign.domain.Member;

@Getter
@NoArgsConstructor
public class SignUpRequest {

    private String email;
    private String password;
    private String nickname;

    public Member saveMember() {
        return Member.builder()
                .email(this.email)
                .password(this.password)
                .nickname(this.nickname)
                .build();
    }

    @Builder
    public SignUpRequest(String email, String password, String nickname) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }
}
