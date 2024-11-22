package com.org.java.junittest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.org.java.entity.Company;
import com.org.java.repository.CompanyRepository;
import com.org.java.serviceimpl.CompanyServiceImpl;

@SpringBootTest
public class CompanyTest {
	
	@InjectMocks
	CompanyServiceImpl companyServiceImpl;
	
	@Mock
	CompanyRepository companyRepository;
	
	@Test
	public void companysaveTest() {
		Company cmpny=new Company(101,"srinu","khammam");
		when(companyRepository.save(cmpny)).thenReturn(cmpny);
		assertEquals(cmpny, companyServiceImpl.saveCompanyDetails(cmpny));	
	}
	@Test
	public void companyfindAllTest() {
		when(companyRepository.findAll()).thenReturn(Stream.of(new Company(101,"srinu","delhi"),new Company(103,"naresh","punjab")).collect(Collectors.toList()));
		assertEquals(2,companyServiceImpl.findAllEmployeeDetails().size());
	}

}
