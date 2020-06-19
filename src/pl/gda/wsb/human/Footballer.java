package pl.gda.wsb.human;

public class Footballer extends Person {
    private String club;
    private Position position;
    private int numberOfGoals;

    public Footballer(String name, String surname, String dateOfBirth, String club, Position position) {
        super(name, surname, dateOfBirth);
        this.club = club;
        this.position = position;
    }

    public void scoreAGoal() {
        this.numberOfGoals++;
        System.out.println(this.getName() + " " + club + " scores a goal! Goals: " + numberOfGoals);
    }

    public String toString() {
        return "Name and surname: " + this.getName() + " " + this.getSurname() + " , date of birth: " + this.getDateOfBirth() + "," +
                "\nClub: " + club + ", position: " + position + ", liczba goli: " + numberOfGoals;
    }

}
