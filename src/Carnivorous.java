
public class Carnivorous extends Plants{
    public Carnivorous(String name, double length) {
        super(name, length);
        this.setTypeOfLiquid(liquids.PROTEINDRYCK.liquidType);
    }


    // Polymorfism, 2 metoder
    @Override
    public double howToWaterPlant(Plants plant) {
        double waterForCarnivore = 0.1 + (0.2 * plant.getLength());
        return waterForCarnivore;
    }
    @Override
    public String printWaterInstruction(double amountOfWater, String typeOfLiquid, Plants plant) {
        return plant.getName() + " ska ha " + amountOfWater + " liter " +  typeOfLiquid;
    }

    /*Kött
0.1 + (0.2 * längd) proteindryck/dag*/
}
