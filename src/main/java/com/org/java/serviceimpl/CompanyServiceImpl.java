package com.org.java.serviceimpl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.java.entity.Company;
import com.org.java.repository.CompanyRepository;
import com.org.java.service.CompanyService;

@Component
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public Company saveCompanyDetails(Company company) {
		// TODO Auto-generated method stub
		return companyRepository.save(company);
	}

	@Override
	public List<Company> findAllEmployeeDetails() {
		List<Company> cmny=companyRepository.findAll();
		return cmny;
	}

	@Override
	public List<String> mergeCompamyDetails() {
		
	        List<List<String>> listOfList=Arrays.asList(Arrays.asList("Test1","Test2","Test3","Test4","Test5"),
			Arrays.asList("Test6","Test7","Test8","Test9","Test10"));
	        List<String> result=listOfList.stream().flatMap(Collection::stream).collect(Collectors.toList());
			return result;
    
	}

}
