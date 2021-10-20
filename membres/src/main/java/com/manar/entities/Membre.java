package com.manar.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Membre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numM;
	private String nomM;
	private String telM;
	private Date dateNais;
	@ManyToOne
	private Conservatoire Conservatoire;
	
	
	public Membre(String nomM, String telM, Date dateNais) {
		super();
		this.nomM = nomM;
		this.telM = telM;
		this.dateNais = dateNais;
	}
	public Membre() {
		super();
		
	}
	public Long getnumM() {
		return numM;
	}
	public void setnumM(Long numM) {
		this.numM = numM;
	}
	public String getnomM() {
		return nomM;
	}
	public void setnomM(String nomM) {
		this.nomM = nomM;
	}
	public String gettelM() {
		return telM;
	}
	public void settelM(String telM) {
		this.telM = telM;
	}
	public Date getDateNais() {
		return dateNais;
	}
	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}
	
	
	public Conservatoire getConservatoire() {
		return Conservatoire;
	}
	public void setConservatoire(Conservatoire Conservatoire) {
		this.Conservatoire = Conservatoire;
	}
	@Override
	public String toString() {
		return "Membre [numM=" + numM + ", nomM=" + nomM + ", telM=" + telM + ", dateNais=" + dateNais + "]";
	}
	
	

}
