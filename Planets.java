
public class Planets {
	
	/*Arxikopoish twn metavlitwn stigmiotypou gia thn klasi Planets.
	 * Exoume ena statiko pinaka typou Planets 10 thesewn, mia idiwtikh
	 * metavliti String, to onoma tou planiti, mia metavliti id, h opoia
	 * mas deixnei th seira pou exei o planitis apo ton hlio
	 * kai telos thn ifVisited, h opoia mas deixnei an exoume episkefthei
	 * me kapoio anthrwpino antikeimeno ton sygkekrimeno planiti.
	 */
	static Planets planets[] = new Planets[10];
	private String name;
	private int id;
	private boolean ifVisited;
	static int counter = 0;
	
	/*Constructor, o opoios pairnei ws orismata to onoma tou planiti kai 
	 * to an ton exoume episkefthei kai ftiaxnei to antikeimeno me to
	 * opoio tha anaferomaste ston planiti sth synexeia.
	 */
	public Planets(String name, boolean ifVisited) {
		this.name = name;
		planets[counter]= this;
		this.ifVisited = ifVisited;
		id = ++counter;	
	}
	
	/*Akolouthoun getters kai setters gia kathe metavliti stigmiotypou
	 * kathws kai h methodos toString, h opoia ektypwnei tis metavlites
	 * stigmiotypwn olwn twn antikeimenwn.
	 */
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id  = id;
	}
	
	public String toString() {
		return name + ", id = " + id + ", " + " \nand the state whether a man made object has visited them or not is " +ifVisited;
	}
}

