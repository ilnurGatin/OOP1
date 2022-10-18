public class Flower {
    String name;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;


    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "White";
        }
    }

    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Russia";
        }
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    public Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {
        this.name = name;
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "White";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Russia";
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    void flowerInfo() {
        System.out.println("Flower{" +
                "name='" + name + '\'' +
                ", flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}');
    }
}
