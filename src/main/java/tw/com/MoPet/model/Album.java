package tw.com.MoPet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "album")
public class Album {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "title")
	private String title;
	
	
	@Column(name = "like")
	private String like;
	
	
	@Column(name = "comment")
	private String comment;
	
	@Column(name = "setuptime")
	private String setuptime;
	
	@Column(name = "modification")
	private String modification;
}
