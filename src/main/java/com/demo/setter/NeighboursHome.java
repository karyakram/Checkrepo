package com.demo.setter;

public class NeighboursHome implements UrbanClap {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	private Organiser organiser;

	
	public void setOrganiser(Organiser organiser) {
		this.organiser = organiser;
		System.out.println("setter method for dependency injection");
	}


	@Override
	public String Cleaning() {
		// TODO Auto-generated method stub
		return "Cleaning happening here";
	}


	@Override
	public String Decorating() {
		// TODO Auto-generated method stub
		return organiser.service1();
	}


	
	

	

}
