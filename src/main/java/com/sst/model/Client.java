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
@Table(name = "client")
public class Client {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int id;
	@Email
	@NotEmpty(message = "enter emailId")
	@Column(name = "email_id")
	private String email_id;
	@NotEmpty(message = "enter company_name")
	@Column(name = "company_name")
	private String company_name;
	@NotEmpty(message = "enter company_type")
	@Column(name = "company_type")
	private String company_type;
	@NotEmpty(message = "enter address")
	@Column(name = "address")
	private String address;
	@NotEmpty(message = "enter city")
	@Column(name = "city")
	private String city;
	@NotEmpty(message = "enter state")
	@Column(name = "state")
	private String state;
	@NotEmpty(message = "enter postal_code")
	@Column(name = "postal_code")
	private String postal_code;
	@NotEmpty(message = "enter country")
	@Column(name = "country")
	private String country;
	@NotEmpty(message = "enter comp_contact")
	@Column(name = "comp_contact")
	private String comp_contact;
	@NotEmpty(message = "enter comp_person_name")
	@Column(name = "comp_person_name")
	private String comp_person_name;
	@NotEmpty(message = "enter designation")
	@Column(name = "designation")
	private String designation;
	@NotEmpty(message = "enter employee_id")
	@Column(name = "employee_id")
	private String employee_id;
	@NotEmpty(message = "enter cpemail")
	@Column(name = "cp_email")
	private String cp_email;
	@NotEmpty(message = "enter contact_no")
	@Column(name = "contact_no")
	private String contact_no;
	// @NotEmpty(message = "enter status")
	@Column(name = "status")
	private int status;
	@NotEmpty(message = "enter role")
	@Column(name = "role")
	private String role;
	@NotEmpty(message = "enter password")
	@Column(name = "password")
	private String password;
	@Column(name = "date")
	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_type() {
		return company_type;
	}

	public void setCompany_type(String company_type) {
		this.company_type = company_type;
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

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getComp_contact() {
		return comp_contact;
	}

	public void setComp_contact(String comp_contact) {
		this.comp_contact = comp_contact;
	}

	public String getComp_person_name() {
		return comp_person_name;
	}

	public void setComp_person_name(String comp_person_name) {
		this.comp_person_name = comp_person_name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getCp_email() {
		return cp_email;
	}

	public void setCp_email(String cp_email) {
		this.cp_email = cp_email;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", email_id=" + email_id + ", company_name=" + company_name + ", company_type="
				+ company_type + ", address=" + address + ", city=" + city + ", state=" + state + ", postal_code="
				+ postal_code + ", country=" + country + ", comp_contact=" + comp_contact + ", comp_person_name="
				+ comp_person_name + ", designation=" + designation + ", employee_id=" + employee_id + ", cp_email="
				+ cp_email + ", contact_no=" + contact_no + ", status=" + status + ", role=" + role + ", password="
				+ password + ", date=" + date + "]";
	}

}
