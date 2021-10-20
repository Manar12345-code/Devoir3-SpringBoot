package com.manar.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.manar.entities.Conservatoire;
import com.manar.entities.Membre;



@RepositoryRestResource(path = "rest")
public interface MembreRepository extends JpaRepository<Membre, Long> {
	List<Membre> findByNomM(String nom);
	List<Membre> findByNomMContains(String nom); 
	
	/*@Query("select p from Membre p where p.nomA like %?1 and p.telM like %?2")
	List<Membre> findByNomtelM (String nom, String telM);*/
	
	@Query("select p from Membre p where p.nomA like %:nom and p.telM like %:telM")
	List<Membre> findByNomtelM (@Param("nom") String nom,@Param("telM") String telM);
	
	@Query("select p from Membre p where p.Conservatoire = ?1")
	List<Membre> findByConservatoire (Conservatoire Conservatoire);

	List<Membre> findByConservatoireNumC(Long num);
	
	List<Membre> findByOrderByNomMAsc();


}
