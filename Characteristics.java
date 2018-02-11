
public class Characteristics {
	
	/* H klasi auth periexei ola ta xarakthristika twn planitwn pou epileksame
	 * Exoume thn apostasi apo ton Hlio kai to xrwma (typou String), thn thermokrasia
	 * tou kathenos (typou double) kathw kai ton pinaka planets (typou Planets). 
	 */
	private String distance;
	private double temperature;
	private String colour;
	private Planets planets;
	
	//Dhmiourgoume ton statiko pinaka chars[10] gia na apothikeusoume ta xarakthristika 
	static Characteristics chars[] = new Characteristics[10];
	static int count = 0;
	
	/*O Constructor pairnei ws orismata tis metavlites tou kathe antikeimenou kai tis 
	 * apothikeuei.
	 */
	public Characteristics(String distance,Planets planets,String colour, double temperature) {
		this.distance = distance;
		this.colour=colour;
		this.planets= planets;
		this.temperature = temperature;
		chars[count]=this;
		++count;
	}
	
	//Getters kai setters gia kathe metavliti stigmiotypou, kathws kai toString
	public String getDistance() {
		return distance;
	}
	
	public Planets getPlanets() {
		return planets;
	}
	
	public void setDistance(String distance) {
		this.distance = distance;
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	/*H methodos setTemperature elegxei gia to an einai egkyrh h thermokrasia 
	 * pou eisagei o xrhsths, dhladh an einai mikroterh tou apolytou mhden 
	 * (-273.14 Kelvin). An einai mikroterh, tote typwnei mhnuma sfalmatos
	 */
	public void setTemperature(double temperature) {
		if (temperature > -273.14) {
			this.temperature = temperature;
		}
		if (temperature<=-273.14)
			System.err.println("You didn't insert the right temperature, please try again, by pressing 5 in the menu");
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String toString() {
		return  planets + ", has a temperature of " + temperature + "\n" + "degrees of Celsius "
				+", it's colour is " + colour + "\n" + "and it's distance from the sun is "
				+ distance;
	}
	
}