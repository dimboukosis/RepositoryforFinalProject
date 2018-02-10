public class Planets {
	static Planets planets[] = new Planets[10];
	private String name;
	private int id;
	private boolean ifVisited;
	static int counter = 0;
	
	public Planets(String name, boolean ifVisited) {
		this.name = name;
		planets[counter]= this;
		this.ifVisited = ifVisited;
		id = ++counter;	
		
		}