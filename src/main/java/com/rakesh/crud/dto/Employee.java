package com.rakesh.crud.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "employees")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
    @GeneratedValue
    
	private int employee_id;
	private String employee_name;
}
