package com.mycompany.hibernate_inheritance_demo;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("manager")
public class Manager extends Employee {
	private String domain;
	private int experience;

	public Manager() {
	}

	public Manager(String name, int age, Date joiningDate, String domain, int experience) {
		super(name, age, joiningDate);
		this.domain = domain;
		this.experience = experience;
	}
}