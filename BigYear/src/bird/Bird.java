package bird;

public class Bird {
	private String name;
	private String LatinName;
	private int countObservation;

	public Bird(String name, String LatinName) {
		this.name = name;
		this.LatinName = LatinName;
		this.countObservation = 0;

	}

	public String getName() {
		return this.name;
	}

	public String getLatinName() {
		return this.LatinName;
	}

	public int getCountObservation() {
		return this.countObservation;
	}

	public void TotalObservation() {
		this.countObservation++;

	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", LatinName=" + LatinName + ", countObservation=" + countObservation + "]";
	}

}
