package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.List;

public class Parole {
	
	private List<String> dizionario = new ArrayList<>();
		
	public Parole() {
		//TODO
	}
	
	/**
	 * Inserisce una stringa nella struttura dati
	 * @param p stringa
	 */
	public void addParola(String p) {
		//TODO
		dizionario.add(p);
	}
	
	/**
	 * Ritorna l'elenco delle parole inserite in ordine alfabetico
	 * @return Elenco ordinato
	 */
	public List<String> getElenco() {
		//TODO
		dizionario.sort((p1, p2) -> p1.compareTo(p2));
		return dizionario;
	}
	
	/**
	 * Elimina una parola dalla collezione
	 * @param p Parola da eliminare
	 */
	public void deleteParola(String p) {
		dizionario.remove(p);
	}
	
	/**
	 * Svuota l'elenco dati
	 */
	public void reset() {
		// TODO
		dizionario.clear();
	}

}
