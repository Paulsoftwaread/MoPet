package tw.com.MoPet.service;


import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import tw.com.MoPet.model.Customer;
import tw.com.MoPet.model.CustomerRepository;

@Service
@Transactional
public class CustomerService {
  @Autowired
  private CustomerRepository customerDao;
  
  public void insertCustomer(Customer customer) {
    this.customerDao.save(customer);
  }
  
  public Page<Customer> findByPage(Integer pageNumber) {
    PageRequest pageRequest = PageRequest.of(pageNumber.intValue() - 1, 3, Sort.Direction.DESC, new String[] { "id" });
    Page<Customer> page = this.customerDao.findAll((Pageable)pageRequest);
    return page;
  }
  
  public Customer findById(Long id) {
    Optional<Customer> optional = this.customerDao.findById(null);
    if (optional.isPresent())
      return optional.get(); 
    return null;
  }
  
  public void deleteById(Long id) {
    this.customerDao.findById(null);
  }
}