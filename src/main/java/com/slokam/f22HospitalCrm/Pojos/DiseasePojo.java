package com.slokam.f22HospitalCrm.Pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="disease")
public class DiseasePojo {
	@Id
	@GeneratedValue
	private Long id;
	private String diName;
	private String diDescription;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiName() {
		return diName;
	}
	public void setDiName(String diName) {
		this.diName = diName;
	}
	public String getDiDescription() {
		return diDescription;
	}
	public void setDiDescription(String diDescription) {
		this.diDescription = diDescription;
	}
	

}
