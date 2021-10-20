package com.manar.service;

import java.util.List;

import com.manar.entities.*;

public interface MembreService {
	Membre saveMembre(Membre p);
	Membre updateMembre(Membre p);
	void deleteMembre(Membre p);
	void deleteMembreById(Long id);
	Membre getMembre(Long id);
	List<Membre> getAllMembres();

	List<Membre> findByNomM(String nom);
	List<Membre> findByNomMContains(String nom);
	List<Membre> findByNomtelM (String nom, String telM);
	List<Membre> findByConservatoire (Conservatoire Conservatoire);
	List<Membre> findByConservatoireNumC(Long id);
	List<Membre> findByOrderByNomMAsc();
	//List<Membre> trierProduitsNomsPrix();


}
