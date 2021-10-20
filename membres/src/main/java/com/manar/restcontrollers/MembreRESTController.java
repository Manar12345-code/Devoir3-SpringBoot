package com.manar.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manar.entities.*;
import com.manar.repos.*;
import com.manar.service.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MembreRESTController {
@Autowired
MembreService MembreService;
@RequestMapping(method = RequestMethod.GET)
public List<Membre> getAllMembres() {
return MembreService.getAllMembres();
}


@RequestMapping(value="/{numM}",method = RequestMethod.GET)
public Membre getMembreById(@PathVariable("numM") Long numM) {
return MembreService.getMembre(numM);
 }

@RequestMapping(method = RequestMethod.POST)
public Membre createMembre(@RequestBody Membre Membre) {
return MembreService.saveMembre(Membre);
}

@RequestMapping(method = RequestMethod.PUT)
public Membre updateMembre(@RequestBody Membre Membre) {
return MembreService.updateMembre(Membre);
}

@RequestMapping(value="/{numM}",method = RequestMethod.DELETE)
public void Membre(@PathVariable("numM") Long numM)
{
	MembreService.deleteMembreById(numM);
}

@RequestMapping(value="/Membreprop/{numC}",method = RequestMethod.GET)
public List<Membre> getMembresByCatId(@PathVariable("numC") Long numC) {
return MembreService.findByConservatoireNumC(numC);
}


}
