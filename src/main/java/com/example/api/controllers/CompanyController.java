package com.example.api.controllers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.dtos.CompanyDto;
import com.example.api.responses.Response;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {
	@PostMapping
	public ResponseEntity<Response<CompanyDto>> register(@Valid @RequestBody CompanyDto companyDto, BindingResult result) {
		Response<CompanyDto> response = new Response<CompanyDto>();
		
		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		
		companyDto.setId(1L);
		response.setData(companyDto);
		return ResponseEntity.ok(response);
	}

}
