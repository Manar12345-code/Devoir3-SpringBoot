package com.manar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manar.entities.*;
import com.manar.repos.*;
import com.manar.service.*;

@Service
public class MembreServiceImpl implements MembreService {
	
	@Autowired
	private MembreRepository MembreRepository;

	@Override
	public Membre saveMembre(Membre p) {
		return MembreRepository.save(p);
	}

	@Override
	public Membre updateMembre(Membre p) {
		return MembreRepository.save(p);
	}

	@Override
	public void deleteMembre(Membre p) {
		 MembreRepository.delete(p);
		
	}

	@Override
	public void deleteMembreById(Long id) {
		MembreRepository.deleteById(id);

		
	}

	@Override
	public Membre getMembre(Long id) {
		return MembreRepository.findById(id).get();

	}

	@Override
	public List<Membre> getAllMembres() {
		return MembreRepository.findAll();

	}

	@Override
	public List<Membre> findByNomM(String nom) {
		return MembreRepository.findByNomM(nom);
		}

	@Override
	public List<Membre> findByNomMContains(String nom) {
		
		return MembreRepository.findByNomMContains(nom);
	}

	@Override
	public List<Membre> findByNomtelM(String nom, String telM) {
		return MembreRepository.findByNomtelM(nom, telM);
	}

	@Override
	public List<Membre> findByConservatoire(Conservatoire Conservatoire) {
		return MembreRepository.findByConservatoire(Conservatoire);
	}

	@Override
	public List<Membre> findByConservatoireNumC(Long id) {
		return MembreRepository.findByConservatoireNumC(id);
	}

	@Override
	public List<Membre> findByOrderByNomMAsc() {
		return MembreRepository.findByOrderByNomMAsc();
	}
	

}
