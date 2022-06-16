package tw.com.MoPet.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tw.com.MoPet.model.Customer;
import tw.com.MoPet.service.CustomerService;

@Controller
public class CustomerController {
  @Autowired
  private CustomerService cuSer;
  
  @PostMapping({"postCustomer"})
  public String addCustomer(@ModelAttribute("customer") Customer customer, Model model) {
    cuSer.insertCustomer(customer);
    Customer newCus = new Customer();
    model.addAttribute("customer", newCus);
    return "addCustomer";
  }
  
  @GetMapping({"message/editMessage"})
  public String editMessage(@RequestParam("id") Long id, Model model) {
    Customer customer = cuSer.findById(id);
    model.addAttribute("customer", customer);
    return "editMessage";
  }
  
  @PostMapping({"message/editMessage"})
  public String postEditMessage(@ModelAttribute(name = "customer") Customer customer) {
    cuSer.insertCustomer(customer);
    return "redirect:/message/all";
  }
  
  @GetMapping({"message/delete"})
  public String deleteStaff(@RequestParam("id") Long id) {
    cuSer.deleteById(id);
    return "redirect:/message/all";
  }
}
