package com.karthik.dao;

import org.springframework.stereotype.Component;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
//@Entity
//@Table(name="Player")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Player {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column
//	private Long id;
	
//	@Column
	private String name;
	
//	@Column
	private String position;
	
	
	private String country;

}
