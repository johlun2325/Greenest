public class Palm extends Plants {
    public Palm(String name, double length) {
        super(name, length);
        this.setTypeOfLiquid(liquids.KRANVATTEN.liquidType);
    }

    //Polymorfism, 2 metoder
    @Override
    public double howToWaterPlant(Plants plant) {
        double amountOfLiquid = 0.5 * plant.getLength();
        return amountOfLiquid;
    }

    @Override
    public String printWaterInstruction(double amountOfWater, String typeOfLiquid, Plants plant) {
        return plant.getName() + " ska ha " + amountOfWater + " liter " +  typeOfLiquid;
    }
}
