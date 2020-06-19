package pl.gda.wsb.human;

public class Student extends Person{


    private int yearOfStudy;
    private int group;
    private int indexNumber;

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }


/*    public Student(String name, String surname, String dateOfBirth) {
        super(name, surname, dateOfBirth);
    }*/

    public Student(String name, String surname, String dateOfBirth, int yearOfStudy, int group, int indexNumber) {
        super(name, surname, dateOfBirth);
        this.yearOfStudy = yearOfStudy;
        this.group = group;
        this.indexNumber = indexNumber;
    }

    public String toString(){
        return "Name and surname: " + this.getName() +" " + this.getSurname() + " , date of birth: " + this.getDateOfBirth()+ "." +
                "\nStudent index number: " + indexNumber +" , year of study: " + yearOfStudy +" , group: " +group +".";
    }

}
