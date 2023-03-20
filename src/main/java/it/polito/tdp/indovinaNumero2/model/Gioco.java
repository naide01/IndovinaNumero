package it.polito.tdp.indovinaNumero2.model;

public class Gioco {
	//CAPIRE COSA PRENDERE DAL CONTROLLER E SPOSTARE NELLA CLASSE GIOCO.
	
	public enum OutcomeGioco{
		//Classe che ha degli integer statici ai quali possiamo asociare questi nomi
		Vinto,
		Perso,
		TroppoAlto,
		TroppoBasso
		
	}
	//dati di funzionamento dell'applicazione
	private final int TMax = 8;
	private final int NMax = 100;
	private int NTentativiFatti;
	private int numeroSegreto;
	
	//NON SA NULLA DELL'INTERFACCIA GRAFICA
	public void iniziaGioco() {
    	this.NTentativiFatti = 0;
    	this.numeroSegreto = (int)(Math.random()*this.NMax) + 1;
	}

	public int getTMax() {
		return TMax;
	}

	public int getNMax() {
		return NMax;
	}

	public int getNTentativiFatti() {
		return NTentativiFatti;
	}

	public int getNumeroSegreto() {
		return numeroSegreto;
	}
	/**
	 * FUNZIONE CHE ESERGUE UN TENTATIVO DI INDOVINARE IL NUMERO SEGRETO
	 * @param tentativo: NUMERO CHE TIRIAMO PER INDOVINARE IL NUMERO SEGRETO
	 * @return un OutcomeGioco: vinto = INDOVINATO, perso = TROPPI TENTATIVI, TroppoAlto = NON ABBIAMO INDOVINATO MA ABBIAMO ANCORA TENT E IL NUM E' TROPPO ALTO
	 * TroppoBasso = NON ABBIAMO INDOVINATO MA ABBIAMO ANCORA TENT E IL NUM E' TROPPO BASSO
	 */
	public OutcomeGioco faiTentativo(int tentativo) {
		//incrementare numero tentativi fatti
    	this.NTentativiFatti++;
    	
    	//caso 0 = vittoria
    	if (tentativo == this.numeroSegreto) {
    		return OutcomeGioco.Vinto;
    	}
    	//caso 1 = sconfitta 
    	if (this.NTentativiFatti == this.TMax) {
    		return OutcomeGioco.Perso;
    	}
    	// casi 2/3= non abbiamo indovinato e il num è troppo basso e/o troppo alto
    	if(tentativo>this.numeroSegreto) {
    		return OutcomeGioco.TroppoAlto;
    	}else  {
    		return OutcomeGioco.TroppoBasso;
    		}
    	
    	
	}
	
	
}
