public class Palm extends Plants {
    public Palm(String name, double length) {
        super(name, length);
        this.setTypeOfLiquid(liquids.KRANVATTEN.liquidType);
    }

    //Polymorfism, 2 metoder
    @Override
    public double calculateAmountOfWater(Plants plant) {
        return 0.5 * plant.getLength();
    }

    @Override
    public String printWaterInstruction(double amountOfLiquid, String typeOfLiquid, Plants plant) {
        return plant.getName() + " ska ha " + amountOfLiquid + " liter " +  typeOfLiquid;
    }
}
