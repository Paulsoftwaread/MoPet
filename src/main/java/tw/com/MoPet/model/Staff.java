package tw.com.MoPet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "staffname")
	private String staffname;
	
	@Column(name = "staffposition")
	private String staffposition;
	
	@Column(name = "positivefeedback")
	private String positivefeedback;
	
	@Column(name = "popular")
	private String popular;
	
	@Column(name = "fan")
	private String fan;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "qrcode")
	private String qrcode;
		
}
