package tw.com.MoPet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "signup")
public class SignUp {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "gender")
  private String gender;
  
  @Column(name = "birtday")
  private String birthday;
  
  @Column(name = "address")
  private String address;
  
  @Column(name = "accountphone")
  private String accountphone;
  
  @Column(name = "password")
  private String password;
  
  @Column(name = "email")
  private String email;
  
  @Column(name = "note")
  private String note;
  
  public Long getId() {
    return this.id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getAccountphone() {
    return this.accountphone;
  }
  
  public void setAccountphone(String accountphone) {
    this.accountphone = accountphone;
  }
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public String getEmail() {
    return this.email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("SignUp [id=");
    builder.append(this.id);
    builder.append(", name=");
    builder.append(this.name);
    builder.append(", accountphone=");
    builder.append(this.accountphone);
    builder.append(", password=");
    builder.append(this.password);
    builder.append(", email=");
    builder.append(this.email);
    builder.append("]");
    return builder.toString();
  }
}