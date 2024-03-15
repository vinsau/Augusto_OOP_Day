package lab_activity_2.pkg1;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isMinor;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = (age < 18);
    }

    public String getName() {
        return lastName + ", " + firstName;
    }

    public void increaseAge() {
        age++;
        isMinor = (age < 18);
    }

    @Override
    public String toString() {
        String status = isMinor ? "minor" : "adult";
        return lastName + ", " + firstName + " - " + age + " - " + status;
    }
}
