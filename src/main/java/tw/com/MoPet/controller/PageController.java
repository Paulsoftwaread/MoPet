package tw.com.MoPet.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tw.com.MoPet.model.Customer;
import tw.com.MoPet.service.CustomerService;

@Controller
public class PageController {
  @Autowired
  private CustomerService cusService;
  
  @GetMapping({"/"})
  public String welcomePage() {
    return "index";
  }
  
  @GetMapping({"customer/add"})
  public String addStaffPage(Model model) {
    Customer customer = new Customer();
    model.addAttribute("customer", customer);
    return "addCustomer";
  }
  
  @GetMapping({"message/all"})
  public ModelAndView viewStaff(ModelAndView mav, @RequestParam(name = "p", defaultValue = "1") Integer pageNumber) {
    Page<Customer> page = this.cusService.findByPage(pageNumber);
    mav.getModel().put("page", page);
    mav.setViewName("viewMessages");
    return mav;
  }
}
