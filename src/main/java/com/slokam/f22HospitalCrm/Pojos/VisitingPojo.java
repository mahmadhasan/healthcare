package com.slokam.f22HospitalCrm.Pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="visiting")
public class VisitingPojo {
	@Id
	@GeneratedValue
	private Long id;
	private Date dateTime;
	@ManyToOne
	@JoinColumn(name="did")
	private DoctorPojo dp;
	public DoctorPojo getDp() {
		return dp;
	}
	public void setDp(DoctorPojo dp) {
		this.dp = dp;
	}
	@OneToOne
	@JoinColumn(name="apid")
	private AppointmentPojo app;
	public AppointmentPojo getApp() {
		return app;
	}
	public void setApp(AppointmentPojo app) {
		this.app = app;
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
	

}
