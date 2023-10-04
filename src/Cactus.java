public class Cactus extends Plants{
    public Cactus(String name, double length, double amountOfLiquid) {
        super(name, length);
        this.setTypeOfLiquid(liquids.MINERALVATTEN.liquidType);
        this.setAmountOfLiquid(0.2); //cl
    }

    //Polymorfism, 2 metoder
    @Override
    public double howToWaterPlant(Plants plant) {
        return getAmountOfLiquid();
    }

    @Override
    public String printWaterInstruction(double amountOfWater, String typeOfLiquid, Plants plant) {
        return plant.getName() + " ska ha " + amountOfWater + " cl " +  typeOfLiquid;
    }
}
