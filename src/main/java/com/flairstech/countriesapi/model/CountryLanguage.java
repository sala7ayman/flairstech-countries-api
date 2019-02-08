package com.flairstech.countriesapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="country_language")
public class CountryLanguage {

	@NotNull
	@Column(name="country_code")
	private String countryCode;
	
	@NotNull
	@Column(name="language")
	private String language;
	
	@NotNull
	@Column(name="is_official")
	private boolean isOfficial;
	
	@NotNull
	@Column(name="percentage")
	private float  percentage;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_code", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Country country;
}
