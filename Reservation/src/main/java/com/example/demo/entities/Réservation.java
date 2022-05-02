package com.example.demo.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@RequiredArgsConstructor
public class Réservation {
	@Id
	private String codeRes;
	@NonNull
	private Date dateReservation;
	@NonNull
	private Date heureReservation;
	private boolean disponibilite;
	@ManyToMany(mappedBy="réservations")
	private Collection<Locale> locales;
	

}
