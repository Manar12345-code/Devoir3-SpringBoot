package com.manar.entities;

import org.springframework.data.rest.core.config.Projection;

public interface MembreProjection {
	@Projection(name = "nomM", types = { Membre.class })
	public interface AniamlProjection {
	public String getNomM();


}
}
