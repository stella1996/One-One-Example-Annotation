package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "person",uniqueConstraints = {
		@UniqueConstraint(columnNames = "PERSON_NAME"),
		@UniqueConstraint(columnNames = "EMAIL"),
		})
public class Person {
	
	private int personId;
	private String personName;
	private String email;
	private Passport passport;
	
	@Id
	@Column(name = "PERSON_ID", unique = true, nullable = false)
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	
	@Column(name = "PERSON_NAME", unique = true, nullable = false, length = 10)
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	@Column(name = "EMAIL", unique = true, nullable = false, length = 50)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", email=" + email + "]";
	}
	

}
