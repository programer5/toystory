package project.toystory.sign.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import project.toystory.sign.domain.Member;

@Getter
@NoArgsConstructor
public class SignUpResponse {

    private Long id;
    private String email;
    private String nickname;

    public SignUpResponse(Member member) {
        this.id = member.getId();
        this.email = member.getEmail();
        this.nickname = member.getNickname();
    }
}
