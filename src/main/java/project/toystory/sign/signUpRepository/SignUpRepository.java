package project.toystory.sign.signUpRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.toystory.sign.domain.Member;

public interface SignUpRepository extends JpaRepository<Member, Long> {
}
