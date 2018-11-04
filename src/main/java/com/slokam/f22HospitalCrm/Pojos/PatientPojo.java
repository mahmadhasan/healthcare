package com.slokam.f22HospitalCrm.Pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class PatientPojo {
	@Id
	@GeneratedValue
	private Long id;
	private String pName;
	private String paddress;
	private Long pPhone;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getPaddress() {
		return paddress;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public Long getpPhone() {
		return pPhone;
	}
	public void setpPhone(Long pPhone) {
		this.pPhone = pPhone;
	}
	
	

}
