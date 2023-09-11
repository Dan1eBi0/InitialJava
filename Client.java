public class Client {
    private double income; //attribute
    private char gender;
    private int yearOfBirth;

    double getIncome() {
        return income;
    }

    void setIncome(double income) { //parameter
        if (income >= 0)
            this.income = income;
        else System.out.println("The income should be greater than zero");
    }

    char getGender() {
        return gender;
    }

    void setGender(char gender) {
        if (gender == 'F' || gender == 'M')
            this.gender = gender;
        else System.out.println("The gender should be only F or M");
    }

    int getYearOfBirth() {
        return yearOfBirth;
    }

    void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 1900)
            this.yearOfBirth = yearOfBirth;
        else System.out.println("The year of birth should be greater than 1900");
    }
}
