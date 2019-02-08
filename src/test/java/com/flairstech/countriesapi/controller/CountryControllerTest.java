package com.flairstech.countriesapi.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest
public class CountryControllerTest {
	 
	static final String BASE_URI="http://localhost:8080/";

	   @Autowired
	   private MockMvc mvc;

     @Test
	public void givenCountryCodeIsNotExist_then404IsReceived() throws Exception{

         this.mvc.perform(get(BASE_URI+"CODENOTFOUND"))
         .andExpect(status().isInternalServerError());

	    
	    
		   
	}
	
	
  
}
