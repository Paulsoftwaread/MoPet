package tw.com.MoPet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class data {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "day")
	private String day;
	
	@Column(name = "time")
	private String time;
	
	@Column(name = "note")
	private String mote;
	
	@Column(name = "finish")
	private String finish;
	
	@Column(name = "cancel")
	private String cancel;
	

}
