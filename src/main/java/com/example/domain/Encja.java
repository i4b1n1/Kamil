package com.example.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table(name="ENCJA")
public class Encja implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="ID")
	private Long id;
	
	
	@Column(name="IMIE")
	private String imie;
	
	@Column(name="GEJ")
	private String gej;

	public String getImie() {
		// TODO Auto-generated method stub
		return imie;
	}

	
}
