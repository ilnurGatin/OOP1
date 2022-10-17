public class Human {

    int yearOfBirth;
    String name;
    String city;
    String jobTitle;

    Human(String name, int yearOfBirth, String city, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.city = city;
        this.name = name;
        this.jobTitle = jobTitle;
    }

    void hello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }

}
