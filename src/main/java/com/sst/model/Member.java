package com.sst.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "member")
public class Member {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int id;
	@Column(name = "name")
	private String name;
	@Email
	@NotEmpty(message = "enter emailId")
	@Column(name = "email_id")
	private String email_id;
	@NotEmpty(message = "enter password")
	@Column(name = "password")
	private String password;
	@NotEmpty(message = "enter contact_no")
	@Column(name = "contact_no")
	private String contact_no;
	@NotEmpty(message = "enter city")
	@Column(name = "city")
	private String city;
	@NotEmpty(message = "enter state")
	@Column(name = "state")
	private String state;
	@NotEmpty(message = "enter country")
	@Column(name = "country")
	private String country;
	@NotEmpty(message = "enter role")
	@Column(name = "role")
	private String role;
	@Column(name = "status")
	private int status;
	@Column(name = "date")
	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email_id=" + email_id + ", password=" + password
				+ ", contact_no=" + contact_no + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", role=" + role + ", status=" + status + ", date=" + date + "]";
	}

}
