package tw.com.MoPet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class Service {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "service")
	private String service;
	
	@Column(name = "time")
	private String time;
	
	@Column(name = "price")
	private String price;
	
	@Column(name = "sort")
	private String sort ;
	
}
