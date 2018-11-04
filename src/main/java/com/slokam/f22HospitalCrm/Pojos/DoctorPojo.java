package com.slokam.f22HospitalCrm.Pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class DoctorPojo {
	@Id
	@GeneratedValue
   private Long id;
   private String dName;
   private String dSpec;
 public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
public String getdSpec() {
	return dSpec;
}
public void setdSpec(String dSpec) {
	this.dSpec = dSpec;
}
   
}
