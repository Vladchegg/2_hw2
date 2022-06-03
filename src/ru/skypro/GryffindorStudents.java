package ru.skypro;

public class GryffindorStudents extends НogwartsStudents {
    private int nobility;
    private int honor;
    private int courage;

    public GryffindorStudents(String fullName, int power, int transgression, int nobility, int honor, int courage) {
        super(fullName, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Благородство - " + this.nobility +
                ", Честь - " + this.honor +
                ", Храбрость - " + this.courage;
    }

    public int skills() {
        return nobility + honor + courage;
    }

    public void compared(GryffindorStudents gryffindorStudents) {
        int skills1 = skills();
        int skills2 = gryffindorStudents.skills();
        if (skills1 > skills2) {
            System.out.println(getFullName() + " лучший Гриффиндорец, чем " + gryffindorStudents.getFullName());
        } else if (skills1 < skills2) {
            System.out.println(gryffindorStudents.getFullName() + " лучший Гриффиндорец, чем " + getFullName());
        } else {
            System.out.println(gryffindorStudents.getFullName() + " и " + getFullName() + "одинаково хороши");
        }
    }
}
