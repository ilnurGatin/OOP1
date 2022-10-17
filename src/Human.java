public class Human {

    int yearOfBirth;
    String name;
    String city;
    String jobTitle;

    Human(String name, int yearOfBirth, String city, String jobTitle) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        this.city = city;
        this.name = name;
        this.jobTitle = jobTitle;
    }

        Human(int yearOfBirth) {
        if (this.yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        this.city = "'Информация не указана'";
        this.name = "'Информация не указана'";
        this.jobTitle = "'Информация не указана'";
    }

    void hello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }

}
