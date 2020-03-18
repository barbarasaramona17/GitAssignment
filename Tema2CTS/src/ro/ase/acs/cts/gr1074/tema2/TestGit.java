package ro.ase.acs.cts.gr1074.tema2;

public class TestGit {

	public static void main(String[] args) {
		System.out.println("Hello Git ! Denumirea proiectului de licenta este "
				+ "Aplicatie mobila pentru managementul comenzilor în cadrul unui restaurant");
		Restaurant restaurant = new Restaurant("Sky Bistro", "Strada Vaselor nr. 60, Bucuresti ", 70);
		restaurant.stabilesteRating();
		System.out.println(restaurant.getDenumire());
	}

}
