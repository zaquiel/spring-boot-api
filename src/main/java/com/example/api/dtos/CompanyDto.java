package com.example.api.dtos;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

public class CompanyDto {

	private Long id;
	private String companyName;
	private String cnpj;
	
	public CompanyDto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@NotEmpty(message= "Company name can not be empty.")
	@Length(min=5, max=200, message="Company Name must contain between 5 and 200 characters.")
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@NotEmpty(message="Cnpj can not be empty.")
	@CNPJ(message="Invalid Cnpj.")
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "CompanyDto [id=" + id + ", companyName=" + companyName + ", cnpj=" + cnpj + "]";
	}
	
}
