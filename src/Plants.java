import java.util.ArrayList;

public abstract class Plants implements waterForPlants{

    private String name;
    private double length;
    private String typeOfLiquid;
    private double amountOfLiquid;

    public Plants(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getTypeOfLiquid() {
        return typeOfLiquid;
    }

    public double getAmountOfLiquid() {
        return amountOfLiquid;
    }

    public void setLength(double length) { //växter växer även om det inte behövs setter just nu
        this.length = length;
    }

    public void setTypeOfLiquid(String typeOfLiquid) {
        this.typeOfLiquid = typeOfLiquid;
    }

    public void setAmountOfLiquid(double amountOfLiquid) {
        this.amountOfLiquid = amountOfLiquid;
    }
}
