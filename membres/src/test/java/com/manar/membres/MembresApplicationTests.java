package com.manar.membres;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.manar.entities.Conservatoire;
import com.manar.entities.Membre;
import com.manar.repos.*;




@SpringBootTest
class MembresApplicationTests {

	@Autowired
	private MembreRepository MembreRepository;
	@Test
	public void testCreateMembre() {
	Membre anim = new Membre("manar","54171120",new Date());
	MembreRepository.save(anim);
	}
	
	 @Test
	 public void testFindProduit()
	 {
		 Membre p = MembreRepository.findById(1L).get(); 
	 System.out.println(p);
	 }
	 @Test
	 public void testUpdateProduit()
	 {
		 Membre p = MembreRepository.findById(1L).get();
	 p.settelM("54171120");
	 MembreRepository.save(p);
	 }
	 @Test
	 public void testDeleteProduit()
	 {
		 MembreRepository.deleteById(1L);;
	 }
	  
	 @Test
	 public void testListerTousProduits()
	 {
	 List<Membre> anim = MembreRepository.findAll();
	 for (Membre p : anim)
	 {
	 System.out.println(p);
	 }
	 }

	 @Test
	 public void testFindByNomA()
	 {
	 List<Membre> prods = MembreRepository.findByNomM("manar");
	 for (Membre p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testFindByNomAContains ()
	 {
	 List<Membre> prods=MembreRepository.findByNomMContains("manar");
	 for (Membre p : prods)
	 {
	 System.out.println(p);
	 } }
	 
	 @Test
	 public void testfindByNomtelM()
	 {
	 List<Membre> prods = MembreRepository.findByNomtelM("manar", "54171120");
	 for (Membre p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testfindByConservatoire()
	 {
	 Conservatoire cat = new Conservatoire();
	 cat.setnumC(1L);
	 List<Membre> prods = MembreRepository.findByConservatoire(cat);
	 for (Membre p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void findByConservatoirenumC()
	 {
	 List<Membre> prods = MembreRepository.findByConservatoireNumC(2L);
	 for (Membre p : prods)
	 {
	 System.out.println(p);
	 }
	  }
	 
	 @Test
	 public void testfindByOrderByNomAAsc()
	 {
	 List<Membre> prods = 
	 MembreRepository.findByOrderByNomMAsc();
	 for (Membre p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 
	 
}
