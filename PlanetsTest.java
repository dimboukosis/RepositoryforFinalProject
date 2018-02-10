import java.util.Scanner;

public class PlanetsTest {
	public static void main(String args[]) {
		Scanner scanner = new Scanner (System.in);
		
	
		Planets hermis = new Planets("Hermis", false);
		Planets afrodite = new Planets("Afrodite", false);		
		Planets earth = new Planets("Earth", true);
		Planets ares = new Planets("Ares", true);
		Planets dias = new Planets("Dias", false);
		Planets kronos = new Planets("Kronos", true);
		Planets ouranos = new Planets("Ouranos", true);
		Planets poseidon = new Planets("Poseidon", false);
		
		new Characteristics("0,39 AU", hermis, "dark gray", 400.13);
		new Characteristics("0,72 AU", afrodite, "orange", 462.29);
		new Characteristics("1 AU",earth, "blue", 25.11);
		new Characteristics("1,52 AU", ares, "red", 12.56);
		new Characteristics("5,2 AU", dias, "beige", -145.37);
		new Characteristics("9,5 AU", kronos, "beige", -178.28);
		new Characteristics("19,2 AU", ouranos, "light blue", -153.98);
		new Characteristics("30 AU", poseidon, "deep blue", -214.36);
		
		while (true){
			System.out.println("------ Welcome! This is a presentation of our Planets ------");
			System.out.println("Menu:");
			System.out.println("Type 1 to display Planets list");
			System.out.println("Type 2 to display a planets' characteristics");
			System.out.println("Type 3 to create an object");
			System.out.println("Type 4 to display the planet with greater mass in our solar system");
			System.out.println("Type 5 to change a characteristic of a planet");
			int choice = scanner.nextInt();
			if (choice == 1){
				for (Planets kappa: Planets.planets){
					if (kappa != null)
						System.out.println(kappa.toString());
				}
			}
			else if (choice == 2 ){
				System.out.println("Please insert planet");
				String plan = scanner.next();
				for(Characteristics characts:Characteristics.chars) {
					if(characts != null)
						if(characts.getPlanets().getName().equalsIgnoreCase(plan))
							System.out.println(characts.toString());
						
					}
				
				}
			else if(choice==3) {
				System.out.println("Please insert a new Planet");
				String newPlanet = scanner.next();
				
				System.out.println("Please state whether the planet has been tested (answer with true or false)");
				boolean visited = scanner.nextBoolean();
				
				new Planets(newPlanet, visited);
			}
			else if (choice==4) {	
				double max = 0;
				for(Characteristics characts:Characteristics.chars) {
					if(characts != null) {
						if(characts.getTemperature()>=max)
							max = characts.getTemperature(); 
					}
				}
				for(Characteristics characts:Characteristics.chars) {
					if(characts != null) {
					if (characts.getTemperature()== max)
						System.out.println(characts.getPlanets().getName());
					}
				}
			}
			else if (choice == 5) {
				System.out.println("Please insert to which planet you want to change the temperature");
				int index = scanner.nextInt();
				for (Characteristics kappa: Characteristics.chars){
					if (kappa != null)
						if (kappa.getPlanets().getId() == index) {
							System.out.println("Please insert the new temperature");
							double newTemp = scanner.nextDouble();
							kappa.setTemperature(newTemp);
						}
				}
			}
		}
	}
}