
public class Carnivorous extends Plants{
    public Carnivorous(String name, double length) {
        super(name, length);
        this.setTypeOfLiquid(liquids.PROTEINDRYCK.liquidType);
    }


    // Polymorfism, 2 metoder
    @Override
    public double howToWaterPlant(Plants plant) {
        return 0.1 + (0.2 * plant.getLength());
    }
    @Override
    public String printWaterInstruction(double amountOfLiquid, String typeOfLiquid, Plants plant) {
        return plant.getName() + " ska ha " + amountOfLiquid + " liter " +  typeOfLiquid;
    }
}
