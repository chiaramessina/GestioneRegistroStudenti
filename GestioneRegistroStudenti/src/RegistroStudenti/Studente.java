package RegistroStudenti;

public class Studente {
	String nome;
	String cognome;
	String matricola;//univoca
	
	//costruttore
	public Studente(String nome, String cognome,String matricola) {
		this.nome=nome;
		this.cognome=cognome;
		this.matricola=matricola;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getMatricola() {
		return matricola;
	}
	//metodo che permette di stampare la lista in stringhe
	 public String toString() {
	        return "Studente{" + "Nome:" + nome + ", Cognome:" + cognome + ", Matricola:" + matricola +"}";
	    }
	}
	

