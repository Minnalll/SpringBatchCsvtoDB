package com.spring.batch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@Column(name="eid")
	private Integer eId;
	@Column(name="ename")
	private String eName;
	@Column(name="ctc")
	private long ctc;
	@Column(name="basic")
	private double basic;
	@Column(name="da")
	private double da;
	@Column(name="hra")
	private double hra;
	@Column(name="lta")
	private double lta;
	@Column(name="otherallowance")
	private double otherallowance;

}
