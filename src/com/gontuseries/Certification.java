package com.gontuseries;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;;
@Entity
@Table(name="Stud_Address")
public class Certification implements Serializable {
	@Id
	@GeneratedValue
	private int Id;
	
	private String CertificateName;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy="certification")
	Set<Student> student = new HashSet<Student>();
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCertificateName() {
		return CertificateName;
	}
	public void setCertificateName(String certificateName) {
		CertificateName = certificateName;
	}
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	
	
	}
