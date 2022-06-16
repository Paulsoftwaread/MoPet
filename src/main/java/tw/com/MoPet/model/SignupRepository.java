package tw.com.MoPet.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SignupRepository extends JpaRepository<SignUp, Long> {
  SignUp findByAccountphoneAndPassword(String paramString1, String paramString2);
}
