public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public String getName() {
        return name;
    }

    public String getFlowerColor() {
        return this.flowerColor;
    }

    public String getCountry() {
        return this.country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name, "Default");
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = ValidationUtils.validOrDefault(flowerColor, "White");
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan > 0 ? lifeSpan : 3;
    }

    public void setCountry(String country) {
        this.country = ValidationUtils.validOrDefault(country, "Russia");
    }

    public void setCost(double cost) {
        this.cost = cost > 0.0 ? cost : 1;
    }

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        setFlowerColor(flowerColor);
        setName(name);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }


    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
