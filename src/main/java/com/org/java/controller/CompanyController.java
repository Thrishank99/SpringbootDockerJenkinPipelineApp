package com.org.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.java.entity.Company;
import com.org.java.service.CompanyService;

@RequestMapping("/company")
@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping("/welcome")
	public String welcomeTest() {
	
		return "WELCOME TO SPRING BOOT APPLICATION DEVELOPMENT MY THRISHANK APPlication DEPLOY ON KUBERNATES IT WILL WORK 100% CORRETLY";

	}
	
	@PostMapping("/save")
	public ResponseEntity<Company> saveCompany(@RequestBody Company company) {
		Company cmny = companyService.saveCompanyDetails(company);
		return new ResponseEntity("Sucessfully saved in to a Db", HttpStatus.CREATED);

	}
	@GetMapping("/findAll")
	public ResponseEntity<List<Company>> findAllCompanies() {
		List<Company> cmpnylist = companyService.findAllEmployeeDetails();
		return new ResponseEntity<List<Company>>(cmpnylist, HttpStatus.OK);

	}
	@GetMapping("/merge")
	public ResponseEntity<List<String>> findAllCompaniesDetails() {
		List<String> cmpnylist = companyService.mergeCompamyDetails();
		return new ResponseEntity<List<String>>(cmpnylist,HttpStatus.OK);

	}

}
