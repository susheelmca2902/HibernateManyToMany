package com.gontuseries;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Stud_TBL")
public class Student implements Serializable {

	@Id
	@GeneratedValue
	private int studId;
	
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL)
	Set<Certification> certification = new HashSet<Certification>();

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Certification> getCertification() {
		return certification;
	}

	public void setCertification(Set<Certification> certification) {
		this.certification = certification;
	}
}
