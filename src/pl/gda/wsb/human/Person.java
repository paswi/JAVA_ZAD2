package pl.gda.wsb.human;

import org.w3c.dom.ls.LSOutput;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private String dateOfBirth;


    public Person(String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String toString(){
       return "Name and surname: " + name +" " + surname + " , date of birth: " + dateOfBirth+ ".";
    }

    public void howManyYears(){
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.parse(dateOfBirth);
        System.out.println(surname + " is " + (Duration.between(birthday.atStartOfDay(),today.atStartOfDay()).toDays()/365) + " years old.");
    }
}
