package com.usermanagement.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="TBL_USER")
public class User implements Serializable {
	


	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty
	@Column(name="USERNAME", unique=true, nullable=false)
	private String username;
	
	@NotEmpty
	@Column(name="PASSWORD", nullable=false)
	private String password;
	
	@NotEmpty
	@Column(name="FIRST_NAME", nullable=false)
	private String first_name;
	
	@NotEmpty
	@Column(name="LAST_NAME", nullable=false)
	private String last_name;
	
	@NotEmpty
	@Column(name="EMAIL", nullable=false)
	private String email;
	
	@NotEmpty
	@Column(name="GENDER", nullable=true)
	private String gender;
	
	@NotEmpty
	@Column(name="STATUS", nullable=true)
	private String status;
	
	@NotEmpty
	@Column(name="RECOGONIZE", nullable=false)
	private String recogonize;
	
	
	@NotEmpty
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "TBL_USER_ROLE", 
             joinColumns = { @JoinColumn(name = "USER_ID") }, 
             inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") })
	private Set<Role> userRoles = new HashSet<Role>();
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}
	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}
	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the recogonize
	 */
	public String getRecogonize() {
		return recogonize;
	}
	/**
	 * @param recogonize the recogonize to set
	 */
	public void setRecogonize(String recogonize) {
		this.recogonize = recogonize;
	}
	/**
	 * @return the userRoles
	 */
	public Set<Role> getUserRoles() {
		return userRoles;
	}
	/**
	 * @param userRoles the userRoles to set
	 */
	public void setUserRoles(Set<Role> userRoles) {
		this.userRoles = userRoles;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", email=" + email + ", gender=" + gender + ", status=" + status
				+ ", recogonize=" + recogonize + ", userRoles=" + userRoles + "]";
	}
	
	
	
	

}
