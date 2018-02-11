
//This is the Final Project for the Software Systems course

import java.util.Scanner;

//Start of main
public class PlanetsTest {
	public static void main(String args[]) {
		Scanner scanner = new Scanner (System.in);
		
		//Antikeimena gia ton kathe planiti me orismata to onoma kai to an exoun episkefthei
		//h oxi apo anthrwpino antikeimeno.
		Planets hermis = new Planets("Hermis", false);
		Planets afrodite = new Planets("Afrodite", false);		
		Planets earth = new Planets("Earth", true);
		Planets ares = new Planets("Ares", true);
		Planets dias = new Planets("Dias", false);
		Planets kronos = new Planets("Kronos", true);
		Planets ouranos = new Planets("Ouranos", true);
		Planets poseidon = new Planets("Poseidon", false);
		
		//Synedesi kathe object planiti me ta antistoixa xarakthristika tou
		new Characteristics("0,39 AU", hermis, "dark gray", 400.13);
		new Characteristics("0,72 AU", afrodite, "orange", 462.29);
		new Characteristics("1 AU",earth, "blue", 25.11);
		new Characteristics("1,52 AU", ares, "red", 12.56);
		new Characteristics("5,2 AU", dias, "beige", -145.37);
		new Characteristics("9,5 AU", kronos, "beige", -178.28);
		new Characteristics("19,2 AU", ouranos, "light blue", -153.98);
		new Characteristics("30 AU", poseidon, "deep blue", -214.36);
		
		while (true){
			//Emfanisi menu
			System.out.println("------ Welcome! This is a presentation of our Planets ------");
			System.out.println("Menu:");
			System.out.println("Type 1 to display Planets list");
			System.out.println("Type 2 to find a planet by it's colour");
			System.out.println("Type 3 to create an object");
			System.out.println("Type 4 to display the planet with greater temperature in our solar system");
			System.out.println("Type 5 to change a characteristic of a planet");
			
			//Diavazoume apo to xristi thn epilogh tou gia to menu
			int choice = scanner.nextInt(); 
			
			/*Sto prwto meros tou menu, plhktrologwntas 1, kaloume th methodo 
			 * toString, h opoia mas ektypwnei ola ta antikeimena ths klasis
			 * Planets.*/
			
			if (choice == 1){
				for (Planets pl: Planets.planets){
					if (pl != null)
						System.out.println(pl.toString() + "\n");
				}
				System.out.println("\n");
			}
			
			/*Sto menu, epilegontas to 2, mporei o xristis na balei to xrwma enos planiti, 
			 * kai tou epistrefetai posoi planites yparxoun me auto to onoma
			 * kathws kai to onoma tou/wn planiti/wn pou exoun to parapanw xrwma. 
			 * H metavliti colour, dinei to posoi planites exoun to dwthen xrwma
			 */
			else if (choice == 2 ){
				System.out.println("Please insert the colour of the planet: ");
				String plan = scanner.next();
				int colour=0;
				for(Characteristics characts:Characteristics.chars) {
					if(characts != null)
						if(characts.getColour().equals(plan))
							colour++;
					}
				System.out.println("We found "+colour+" planets with the colour "+plan + ",");
				for(Characteristics characts:Characteristics.chars) {
					if(characts != null)
						if(characts.getColour().equalsIgnoreCase(plan)) //H equalsIgnoreCase xalarwnei to case sensitiveness ths Java
							System.out.println("And this planet is " + characts.getPlanets().getName());
						
					}
				System.out.println("\n");
				}
			
			/*Sthn epilogh 3, dinetai dynatothta sto xrhsth na eisagei neo antikeimeno
			 * sto opoio prepei na eisagei to onoma tou neou planiti pou anakalyfthike
			 * (sth metavliti newPlanet) kathws kai to an exei episkefthei apo antrwpino
			 * antikeimeno h oxi (metavliti visited). Epeita dhmioyrgeitai to neo 
			 * antikeimeno.
			 */
			else if(choice==3) {
				System.out.println("Please insert the name of the new Planet");
				String newPlanet = scanner.next();
				
				System.out.println("Please state whether the planet has been visited by a man-made object (answer with true or false)");
				boolean visited = scanner.nextBoolean();
				
				new Planets(newPlanet, visited);
				System.out.println("\n");
			}
			
			/*Sthn epilogh 4, dhlwnetai mia metavliti max, sthn opoia tha ekxwrithei h
			 *megisth timh mias metavlitis stigmiotupoy (sto paradeigma mas h thermokrasia)
			 *kai sth synexeia diastaurwnetai poios apo tous planites exei gia thermokrasia 
			 *auth th max timh, h opoia typwnetai 
			 */
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
					if (characts.getTemperature() == max)
						System.out.println("The planet with the maximum temperature in our solar system is: "+characts.getPlanets().getName());
					}
				}
				System.out.println("\n");
			}
			
			/* Telos sthn epilogh 5, dinei th dynatothta na allaxthei h thermokrasia se
			 * ena apo ta antikeimena planites. Prepei omws h sygkekrimenh thermokrasia
			 * na einai entos plaisiwn (o elegxos ginetai sth setTemperature). Afou 
			 * diavasoume apo ton xrhsth, mesw tou id, se poion planiti thelei na kanei thn
			 * allagi, epeita diavazoume th thermokrasia kai thn ekxwroume, ean einai 
			 * egkyrh, sthn metavliti stigmiotypou temperature.
			 */
			else if (choice == 5) {
				System.out.println("Please insert to which planet you want to change the temperature: \n1 for Hermis\n2 for Afrodite\n3 for Earth\n"
						+ "4 for Ares\n5 for Dias\n6 for Kronos\n7 for Uranus\n8 for Poseidon");
				int index = scanner.nextInt();
				for (Characteristics pl: Characteristics.chars){
					if (pl != null)
						if (pl.getPlanets().getId() == index) {
							System.out.println("Please insert the new temperature");
							double newTemp = scanner.nextDouble();
							pl.setTemperature(newTemp);
						}
					}
				System.out.println("\n");
			}
			
			//Ean dwthei timh ektos range, dinei mhnyma error kai epistrefei sto menu
			else {
				System.err.println("You didn't enter the correct format (numbers between 1 and 5)");
			}
		}
	}
}