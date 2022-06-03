package ru.skypro;

public class SlytheriStudents extends НogwartsStudents {
    private int cunning;
    private int determined;
    private int ambitious;
    private int resourceful;
    private int powerHungry;

    public SlytheriStudents(String fullName, int power, int transgression, int cunning, int determined, int ambitious, int resourceful, int powerHungry) {
        super(fullName, power, transgression);
        this.cunning = cunning;
        this.determined = determined;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.powerHungry = powerHungry;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermined() {
        return determined;
    }

    public void setDetermined(int determined) {
        this.determined = determined;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public void setResourceful(int resourceful) {
        this.resourceful = resourceful;
    }

    public int getPowerHungry() {
        return powerHungry;
    }

    public void setPowerHungry(int powerHungry) {
        this.powerHungry = powerHungry;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Хитрость - " + this.cunning +
                ", Решительность - " + this.determined +
                ", Амбициозность - " + this.ambitious +
                ", Находчивость - " + this.resourceful +
                ", Жажда власти - " + this.powerHungry;
    }

    public int skills() {
        return cunning + determined + ambitious + resourceful + powerHungry;
    }

    public void compared(SlytheriStudents slytheriStudents) {
        int skills1 = skills();
        int skills2 = slytheriStudents.skills();
        if (skills1 > skills2) {
            System.out.println(getFullName() + " лучший студент Слизерина, чем " + slytheriStudents.getFullName());
        } else if (skills1 < skills2) {
            System.out.println(slytheriStudents.getFullName() + " лучший студент Слизерина, чем " + getFullName());
        } else {
            System.out.println(slytheriStudents.getFullName() + " и " + getFullName() + " одинаково хороши");
        }
    }
}
