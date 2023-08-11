package com.cg.placements;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Placement Entity for Placement Module.
@Entity
@Table(name="placement")
public class Placement {
	
	@Id
	// Properties
	private String id;
	private String name;
	private String college;
	private String date;
	private String qualification;
	private String year;
	
	// Constructors (Non-Parameterized)
	public Placement() {
		super();
	}

	// Constructors (Parameterized)
	public Placement(String id, String name, String college, String date, String qualification, String year) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.date = date;
		this.qualification = qualification;
		this.year = year;
	}

	// Getters Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	// toString
	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", college=" + college + ", date=" + date + ", qualification="
				+ qualification + ", year=" + year + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getCollege()=" + getCollege() + ", getDate()=" + getDate() + ", getQualification()="
				+ getQualification() + ", getYear()=" + getYear() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	}

