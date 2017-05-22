public class Feeder {
	private Animals Animals;

	public Animals getAnimals() {
		return Animals;
	}

	public void setAnimals(Animals animals) {
		Animals = animals;
	}
	public Feeder(Animals Animals){   
        this.Animals=Animals;   
    }

	public void feed() {
		Animals.feed();
	}

}