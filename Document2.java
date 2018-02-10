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
		return name + ",id = " + id + ", " + ifVisited;
	}
}

