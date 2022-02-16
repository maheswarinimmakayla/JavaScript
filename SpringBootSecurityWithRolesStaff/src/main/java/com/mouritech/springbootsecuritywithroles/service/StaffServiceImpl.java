package com.mouritech.springbootsecuritywithroles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.springbootsecuritywithroles.entity.Staff;
import com.mouritech.springbootsecuritywithroles.exception.StaffNotFoundException;
import com.mouritech.springbootsecuritywithroles.repository.StaffRpository;

@Service
public class StaffServiceImpl implements StaffService{
		@Autowired
		private StaffRpository staffRepository;

		@Override
		public Staff insertStaff(Staff newStaff) {
		
		
			return staffRepository.save(newStaff);
		}
		
		
		

		@Override
		public Staff showStaffById(Long staffId) throws StaffNotFoundException {
			// TODO Auto-generated method stub
			return staffRepository.findById(staffId).orElseThrow(() -> new StaffNotFoundException("Staff not found with id " + staffId));
		}


		@Override
		public List<Staff> showAllStaffs() {
			// TODO Auto-generated method stub
			return staffRepository.findAll();
		}


		@Override
		public Staff updateStaffById(Long staffId,Staff Staff) throws StaffNotFoundException {
			Staff existingStaff = staffRepository.findById(staffId).orElseThrow(() -> new StaffNotFoundException("Staff not found with id " + staffId));
			existingStaff.setStaffMobno(Staff.getStaffMobno());
			existingStaff.setStaffEmail(Staff.getStaffEmail());
			
			return existingStaff;
		}

		@Override
		public Staff updateSalaryById(Long staffId,Staff Staff) throws StaffNotFoundException {
			Staff existingStaff = staffRepository.findById(staffId).orElseThrow(() -> new StaffNotFoundException("Staff not found with id " + staffId));
			existingStaff.setStaffSalary(Staff.getStaffSalary());
			
			
			return existingStaff;
		}


		@Override
		public void deleteStaffById(Long staffid) throws StaffNotFoundException {
			Staff existingStaff = staffRepository.findById(staffid).orElseThrow(() -> new StaffNotFoundException("Staff not found with id " + staffid));
			staffRepository.delete(existingStaff);
		}


}
