package com.mycompany.hibernate_mapping.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity 
@Data
public class instructor implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name="firstname")
	private String fname;
	@Column(name="lastname")
	private String lname;
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	private instructor_detail details;

}
