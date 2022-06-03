package ru.skypro;

public class RavenclawStudents extends НogwartsStudents {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public RavenclawStudents(String fullName, int power, int transgression, int smart, int wise, int witty, int creative) {
        super(fullName, power, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Ум - " + this.smart +
                ", Мудрость - " + this.wise +
                ", Остроумие - " + this.witty +
                ", Креативность - " + this.creative;
    }

    public int skills() {
        return smart + wise + witty + creative;
    }

    public void compared(RavenclawStudents ravenclawStudents) {
        int skills1 = skills();
        int skills2 = ravenclawStudents.skills();
        if (skills1 > skills2) {
            System.out.println(getFullName() + " лучший студент Когтеврана, чем " + ravenclawStudents.getFullName());
        } else if (skills1 < skills2) {
            System.out.println(ravenclawStudents.getFullName() + " лучший студент Когтеврана, чем " + getFullName());
        } else {
            System.out.println(ravenclawStudents.getFullName() + " и " + getFullName() + " одинаково хороши");
        }
    }

}