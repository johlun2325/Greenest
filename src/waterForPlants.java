public interface waterForPlants {

    public enum liquids {
        KRANVATTEN("kranvatten"),
        MINERALVATTEN("mineralvatten"),
        PROTEINDRYCK("proteindryck");
        public final String liquidType;

        liquids(String liquidType) {
            this.liquidType = liquidType;
        }
    }

    //Polymorfism, dessa två metoder implementeras olika i tre klasser
    public double howToWaterPlant(Plants plant);
    public String printWaterInstruction(double amountOfWater, String typeOfLiquid, Plants plant);
}
