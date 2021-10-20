package com.manar.entities;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Conservatoire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numC;
	private String nomC;
	private int telf;
	
	@JsonIgnore
	@OneToMany(mappedBy = "proprietaire")
	private List<Membre> Membres;

	//public Proprietaire() {}

	public Conservatoire(String nomC, int telf, List<Membre> Membres) {
		super();
		this.nomC = nomC;
		this.telf = telf;
		this.Membres = Membres;
	}

	public Conservatoire() {
		// TODO Auto-generated constructor stub
	}

	public Long getnumC() {
		return numC;
	}

	public void setnumC(Long numC) {
		this.numC = numC;
	}

	public String getnomC() {
		return nomC;
	}

	public void setnomC(String nomC) {
		this.nomC = nomC;
	}

	public int getTelf() {
		return telf;
	}

	public void setTelf(int telf) {
		this.telf = telf;
	}

	public List<Membre> getMembres() {
		return Membres;
	}

	public void setMembres(List<Membre> Membres) {
		this.Membres = Membres;
	}
	
	
	

}
