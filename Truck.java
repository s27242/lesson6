public class Truck extends Vehicle{
    private double milesDriven;
    private double fuelConsumption;
    private double cargoWeight;

    public Truck (String make, String model, int year, int miles, double fuelConsumption, double weight) {
        super(make, model, year);
        this.milesDriven = miles;
        this.fuelConsumption = fuelConsumption;
        this.cargoWeight = weight;
    }

    public double calculateFuelEfficiency() {
        return this.milesDriven / (this.fuelConsumption + (this.cargoWeight * 0.5));
    }
}
