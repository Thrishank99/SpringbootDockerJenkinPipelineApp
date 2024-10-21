package com.org.java.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.java.entity.Company;

@Service
public interface CompanyService {

	Company saveCompanyDetails(Company company);

	List<Company> findAllEmployeeDetails();
	
	List<String> mergeCompamyDetails();

}
