package com.mouritech.springbootsecuritywithroles.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff")
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer staffId;
	private String staffName;
	private String staffEmail;
	private boolean isActive;
	private String staffRole;
	private String staffCommission;
	private Long staffSalary;
	private Long staffMobno;
	
	public Staff() {
		
	}

	public Staff(Integer staffId, String staffName, String staffEmail, boolean isActive, String staffRole,
			String staffCommission, Long staffSalary, Long staffMobno) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffEmail = staffEmail;
		this.isActive = isActive;
		this.staffRole = staffRole;
		this.staffCommission = staffCommission;
		this.staffSalary = staffSalary;
		this.staffMobno = staffMobno;
	}

	public Staff(String staffName, String staffEmail, boolean isActive, String staffRole, String staffCommission,
			Long staffSalary, Long staffMobno) {
		super();
		this.staffName = staffName;
		this.staffEmail = staffEmail;
		this.isActive = isActive;
		this.staffRole = staffRole;
		this.staffCommission = staffCommission;
		this.staffSalary = staffSalary;
		this.staffMobno = staffMobno;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getStaffRole() {
		return staffRole;
	}

	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole;
	}

	public String getStaffCommission() {
		return staffCommission;
	}

	public void setStaffCommission(String staffCommission) {
		this.staffCommission = staffCommission;
	}

	public Long getStaffSalary() {
		return staffSalary;
	}

	public void setStaffSalary(Long staffSalary) {
		this.staffSalary = staffSalary;
	}

	public Long getStaffMobno() {
		return staffMobno;
	}

	public void setStaffMobno(Long staffMobno) {
		this.staffMobno = staffMobno;
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", staffEmail=" + staffEmail + ", isActive="
				+ isActive + ", staffRole=" + staffRole + ", staffCommission=" + staffCommission + ", staffSalary="
				+ staffSalary + ", staffMobno=" + staffMobno + "]";
	}
	
	
}
