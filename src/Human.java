public class Human {

    private int yearOfBirth;
    String name;
    private String city;
    String jobTitle;

    Human(String name, int yearOfBirth, String city, String jobTitle) {
        setYearOfBirth(yearOfBirth);
        setCity(city);
        this.name = ValidationUtils.validOrDefault(name, "'Информация не указана'");
        this.jobTitle = ValidationUtils.validOrDefault(jobTitle, "'Информация не указана'");
    }


    void hello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth >= 0 ? yearOfBirth : 0;
    }
    public void setCity(String city) {
        this.city = ValidationUtils.validOrDefault(city, "'Информация не указана'");
        }
}


