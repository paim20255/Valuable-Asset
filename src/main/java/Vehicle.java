public abstract class Vehicle implements Valuable {
    private String makeModel;
    private double initialCost;
    private int initialMileage;
    private int currentMileage;

    public final static double DEPRECIATION_PER_MILE = 0;

    public Vehicle(String makeModel, double initialCost, int initialMileage, int currentMileage) {
        this.makeModel = makeModel;
        this.initialCost = initialCost;
        this.initialMileage = initialMileage;
        this.currentMileage = currentMileage;
    }

    public void drive(int miles){
        this.currentMileage += miles;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
