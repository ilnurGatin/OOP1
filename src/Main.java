public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим", 1987, "Минск", "бренд-менеджер");
        Human anna = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human kate = new Human("Катя", -1994, "Калининград", "продакт-менеджер");
        Human artem = new Human(1995);

        maksim.hello();
        anna.hello();
        kate.hello();
        artem.hello();
    }
}