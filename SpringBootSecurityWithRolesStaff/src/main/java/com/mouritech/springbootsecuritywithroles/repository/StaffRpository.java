package com.mouritech.springbootsecuritywithroles.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.springbootsecuritywithroles.entity.Staff;


@Repository
public interface StaffRpository extends JpaRepository<Staff, Long>{
	
//	Optional<Staff> findByStaffName(String staffName);
	
}


