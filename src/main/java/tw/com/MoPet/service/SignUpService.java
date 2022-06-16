package tw.com.MoPet.service;


import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.com.MoPet.model.SignUp;
import tw.com.MoPet.model.SignupRepository;

@Service
@Transactional
public class SignUpService {
  @Autowired
  private SignupRepository signupDao;
  
  public void insertSignUp(SignUp signup) {
    this.signupDao.save(signup);
  }
  
  public SignUp FindAccoutphoneAndPsw(String accountphone, String password) {
    return this.signupDao.findByAccountphoneAndPassword(accountphone, password);
  }
}

