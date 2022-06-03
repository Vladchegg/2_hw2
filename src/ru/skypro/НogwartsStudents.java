package ru.skypro;

public class НogwartsStudents {
    private String fullName;
    private int power;
    private int transgression;

    public НogwartsStudents(String fullName, int power, int transgression) {
        this.fullName = fullName;
        this.power = power;
        this.transgression = transgression;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return  "Студент - " + this.fullName  +
                ", Сила - " + this.power +
                ", Трансгрессия - " + this.transgression;
    }

    public int skillsНogwarts() {
        return power + transgression;
    }

    public void compared(НogwartsStudents hogwartsStudents) {
        int skills1 = skillsНogwarts();
        int skills2 = hogwartsStudents.skillsНogwarts();
        if (skills1 > skills2) {
            System.out.println(getFullName() + " лучший студент Хогвартс, чем " + hogwartsStudents.getFullName());
        } else if (skills1 < skills2) {
            System.out.println(hogwartsStudents.getFullName() + " лучший студент Хогвартс, чем " + getFullName());
        } else {
            System.out.println(hogwartsStudents.getFullName() + " и " + getFullName() + " одинаково хороши");
        }
    }
}
