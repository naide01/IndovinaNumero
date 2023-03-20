package it.polito.tdp.indovinaNumero2.model;

public class Difficolta {
	
	public enum Livello{
		Facile,
		Medio,
		Difficile
	}
	private int TMax;
	private int NMax;
	private Livello livello;
	
	public Difficolta (Livello livello) {
		this.livello=livello;
		
		switch(livello) {
			case Facile:{
				this.NMax = 100;
				this.TMax = 15;
				break;
			}
			case Medio:{
				this.NMax=100;
				this.TMax=8;
				break;
			}
			case Difficile:{
				this.NMax=100;
				this.TMax=4;
				break;
			}
		}
	}
	
}
