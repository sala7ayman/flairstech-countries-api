package com.flairstech.countriesapi.model;

import javax.persistence.Entity;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="country")
public class Country {
		
		@Id
	    @NotNull
	    @JsonIgnore
		@Column(name="code")
	    private String code;
		
	    @NotNull
		@Column(name="name")
		private String name;
	    
	    @NotNull
		@Column(name="continent")
		private String continent;
		
	    @NotNull
	    @Column(name="population")
		private Long population;
		
		
	    @Column(name="life_expectancy")
		private float lifeExpectancy;
		 

		@OneToMany(mappedBy = "countryCode")
		private List<CountryLanguage> countryLanguage;
		
		
	    public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getContinent() {
			return continent;
		}
		public void setContinent(String continent) {
			this.continent = continent;
		}
		public Long getPopulation() {
			return population;
		}
		public void setPopulation(Long population) {
			this.population = population;
		}
		public float getLifeExpectancy() {
			return lifeExpectancy;
		}
		public void setLifeExpectancy(float lifeExpectancy) {
			this.lifeExpectancy = lifeExpectancy;
		}
		

		
		

}
