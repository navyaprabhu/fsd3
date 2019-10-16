package com.mycompany.hibernate_inheritance_demo;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("Hr")
public class Hr extends Manager {
	private String newfeatures;

	public Hr() {
		super();
	}

	public Hr(String name, int age, Date joiningDate,String domain, int experience, String features) {
		super(name, age, joiningDate,domain,experience);
		newfeatures = features;
	}
}
