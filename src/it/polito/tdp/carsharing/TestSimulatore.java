package it.polito.tdp.carsharing;

public class TestSimulatore {

	public static void main(String[] args) {
		
		Simulatore s = new Simulatore();
		
		s.setNC(15);
		s.setT_IN(5);
		s.init(480);
		s.run();
		
		System.out.format("Arrivati %d clienti, insoddisfatti %d\n", s.getClientiArrivati(), s.getClientiInsoddisfatti());

	}

}
