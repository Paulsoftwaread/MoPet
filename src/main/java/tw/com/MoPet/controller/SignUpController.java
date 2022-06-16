package tw.com.MoPet.controller;


import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tw.com.MoPet.model.SignUp;
import tw.com.MoPet.service.SignUpService;

@Controller
public class SignUpController {
  @Autowired
  private SignUpService suservice;
  
  @RequestMapping(value = {"/signup_save"}, method = {RequestMethod.POST})
  public String saveSignUp(@ModelAttribute SignUp signup, Model model) {
    suservice.insertSignUp(signup);
    return "redirect:/index.html";
  }
  
  @RequestMapping(value = {"/register"}, method = {RequestMethod.POST})
  public String register(SignUp signup, Map<String, Object> map) {
    SignUp signup1 = suservice.FindAccoutphoneAndPsw(signup.getAccountphone(), signup.getPassword());
    if (signup1 == null) {
      map.put("msg", "登入失敗");
      return "redirect:/sign-up.html";
    } 
    map.put("msg", "登入成功");
    return "redirect:/success.html";
  }
}
