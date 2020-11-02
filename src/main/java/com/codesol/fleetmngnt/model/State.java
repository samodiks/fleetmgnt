package com.codesol.fleetmngnt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //creates this table automatically in the database
@Data //
@NoArgsConstructor //automatically generates constructors with no arguments
@AllArgsConstructor//automatically creates all constructors with  arguments
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class State {
	
	@Id //identifies primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//automatically inserts the primary key value  when new data is added into the table
	private Integer id;	
	private String name;
	private String capital;
    private String code;

	@ManyToOne
	//@JoinColumn(name="countryid")
	private Country country;
	
	private Integer countryid;
	
	private String details;
	
}
