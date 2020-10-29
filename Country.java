//javabean java bean class
//holds data regarding an object so I can use it in the rest of my code
public class Country {
	//fields
	public String name; 
	public int population;
	//constructor
		public Country(String name, int population) {
			super();
			this.name = name;
			this.population = population;
		}
	//getter
	public String getName() {
		return name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public int getPopulation() {
		return population;
	}
	//setter
	public void setPopulation(int population) {
		this.population = population;
	}
	//toString
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}
}
