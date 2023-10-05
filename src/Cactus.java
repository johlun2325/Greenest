public class Cactus extends Plants{
    public Cactus(String name, double length) {
        super(name, length);
        this.setTypeOfLiquid(liquids.MINERALVATTEN.liquidType);
        this.setAmountOfLiquid(0.02);
    }

    //Polymorfism, 2 metoder
    @Override
    public double calculateAmountOfWater(Plants plant) {
        return getAmountOfLiquid();
    }

    @Override
    public String printWaterInstruction(double amountOfLiquid, String typeOfLiquid, Plants plant) {
        return plant.getName() + " ska ha " + amountOfLiquid + " liter (2 cl) " +  typeOfLiquid;
    }
}
