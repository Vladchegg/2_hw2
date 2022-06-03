package ru.skypro;

public class HufflepuffStudents extends НogwartsStudents {
    private int hardworking;
    private int loyalty;
    private int honesty;

    public HufflepuffStudents(String fullName, int power, int transgression, int hardworking, int loyalty, int honesty) {
        super(fullName, power, transgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Трудолюбие - " + this.hardworking +
                ", Верность - " + this.loyalty +
                ", Честность - " + this.honesty;
    }

    public int skills() {
        return hardworking + loyalty + honesty;
    }

    public void compared(HufflepuffStudents hufflepuffStudents) {
        int skills1 = skills();
        int skills2 = hufflepuffStudents.skills();
        if (skills1 > skills2) {
            System.out.println(getFullName() + " лучший студент Пуффендуя, чем " + hufflepuffStudents.getFullName());
        } else if (skills1 < skills2) {
            System.out.println(hufflepuffStudents.getFullName() + " лучший студент Пуффендуя, чем " + getFullName());
        } else {
            System.out.println(hufflepuffStudents.getFullName() + " и " + getFullName() + " одинаково хороши");
        }
    }
}
