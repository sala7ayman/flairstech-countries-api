package com.flairstech.countriesapi.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flairstech.countriesapi.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
		 
}