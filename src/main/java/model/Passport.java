package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "passport")
public class Passport {

	private int personId;
	private String passportNumber;
	private int passportId;
	private Person person;
	
	
	@Column(name = "PASSPORT_ID")
	public int getPassportId() {
		return passportId;
	}


	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	@Column(name = "PASSPORT_NUMBER")
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "person", cascade = CascadeType.ALL)
	public String getPassportNumber() {
		return passportNumber;
	}


	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}


	@GenericGenerator(name = "generator", strategy = "foreign")
	@Id
	@Column(name = "PERSON_ID", unique = true, nullable = false)
	public int getPersonId() {
		return personId;
	}


	public void setPersonId(int personid) {
		this.personId = personid;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}

	
	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + ", personid=" + personId
				+ "]";
	}
	
	
	
	
}
