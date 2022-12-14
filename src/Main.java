public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим", 1987, "Минск", "бренд-менеджер");
        Human anna = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human kate = new Human("Катя", -1994, "Калининград", "продакт-менеджер");
        Human artem = new Human("Artem", 1995, "Buharest", "manager");

        maksim.hello();
        anna.hello();
        kate.hello();
        artem.hello();

        Flower rose = new Flower("Rose", null, "Holland", 35.59, 0);
        Flower chrysanthemum = new Flower("Chrysanthemum", null, null, 15, 5);
        Flower peony = new Flower("Peony", null, "England", 69.9, 1);
        Flower gypsophila = new Flower("Gypsophila", null, "Turkey", 10.5, 10);

        System.out.println(rose);

        Bouquet bouquet = new Bouquet(new Flower[]{rose, chrysanthemum, peony, gypsophila});
        System.out.println(bouquet.bouquetCost());
        System.out.println(bouquet.lifeSpanOfBouquet());
    }
}