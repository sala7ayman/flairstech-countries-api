package com.flairstech.countriesapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.flairstech.countriesapi.model.Country;
import com.flairstech.countriesapi.repository.CountryRepository;



@RestController
public class CountryController {
	
	 
	 private CountryRepository countryRepository;
	
	 @Autowired
	 CountryController(CountryRepository contactRepository) {
	        this.countryRepository = contactRepository;
	  }
	 
	 @GetMapping(path = {"/{code}"}, produces = "application/json")
     public ResponseEntity<Country> findByCode(@PathVariable String code){
		 try {
			Country country = countryRepository.findOne(code);
			if (country != null)
				return ResponseEntity.ok().body(country);
			else
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		} catch (Exception e) {
			//in case database is down
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
}
}
