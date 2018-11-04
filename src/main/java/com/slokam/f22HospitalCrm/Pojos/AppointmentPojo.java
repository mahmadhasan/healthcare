package com.slokam.f22HospitalCrm.Pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="appointment")
public class AppointmentPojo {
	@Id
	@GeneratedValue
	private Long id;
	private Date dateTime;
	private String primaryReason;
	@ManyToOne
	@JoinColumn(name="pid")
	private PatientPojo patient;
	public PatientPojo getPatient() {
		return patient;
	}
	public void setPatient(PatientPojo patient) {
		this.patient = patient;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getPrimaryReason() {
		return primaryReason;
	}
	public void setPrimaryReason(String primaryReason) {
		this.primaryReason = primaryReason;
	}
}