package com.slokam.f22HospitalCrm.Pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medication")
public class MedicationPojo {
	@Id
	@GeneratedValue
	private Long id;
	private String howToUse;
	private Integer quantity;
	private Integer duration;
	@ManyToOne
	private ComplaintPojo cp;
	public ComplaintPojo getCp() {
		return cp;
	}
	public void setCp(ComplaintPojo cp) {
		this.cp = cp;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHowToUse() {
		return howToUse;
	}
	public void setHowToUse(String howToUse) {
		this.howToUse = howToUse;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	

}
