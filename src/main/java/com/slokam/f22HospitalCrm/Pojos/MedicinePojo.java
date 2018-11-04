package com.slokam.f22HospitalCrm.Pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicine")
public class MedicinePojo {
	@Id
	@GeneratedValue
   private Long id;
   private String meName;
   private String meDescription;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getMeName() {
	return meName;
}
public void setMeName(String meName) {
	this.meName = meName;
}
public String getMeDescription() {
	return meDescription;
}
public void setMeDescription(String meDescription) {
	this.meDescription = meDescription;
}
   
}
