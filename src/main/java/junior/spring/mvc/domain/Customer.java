package junior.spring.mvc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {
	
	@Id
	@Column(name = "cust_id")
	@GeneratedValue
	private Integer id;
	
	@Column(name = "cust_name")
	private String name;
	
	@Column(name = "cust_address")
	private String address;
	
	@Column(name = "cust_city")
	private String city;
	
	@Column(name = "cust_state")
	private String state;
	
	@Column(name = "cust_zip")
	private String zip;
	
	@Column(name = "cust_country")
	private String country;
	
	@Column(name = "cust_email")
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
