package ru.skypro;

public class Main {

    public static void main(String[] args) {

        GryffindorStudents harry = new GryffindorStudents("Гарри Поттер", 87, 89, 91, 83, 95);
        GryffindorStudents hermione = new GryffindorStudents("Гермиона Грейнджер", 84, 85, 89, 79, 75);
        GryffindorStudents ron = new GryffindorStudents("Рон Уизли", 80, 74, 80, 81, 70);

        HufflepuffStudents zacharias = new HufflepuffStudents("Захария Смит", 69, 68, 55, 81, 90);
        HufflepuffStudents cedric = new HufflepuffStudents("Седрик Диггори", 87, 86, 90, 66, 79);
        HufflepuffStudents justin = new HufflepuffStudents("Джастин Финч-Флетчли", 58, 42, 61, 77, 55);

        RavenclawStudents zhou = new RavenclawStudents("Чжоу Чанг", 63, 57, 80, 45, 32, 74);
        RavenclawStudents padma = new RavenclawStudents("Падма Патил", 49, 27, 35, 41, 58, 84);
        RavenclawStudents marcus = new RavenclawStudents("Маркус Белби", 24, 24, 52, 41, 65, 74);

        SlytheriStudents draco = new SlytheriStudents("Драко Малфой", 85, 81, 73, 62, 95, 53, 97);
        SlytheriStudents graham = new SlytheriStudents("Грэхэм Монтегю", 36, 29, 45, 78, 21, 5, 69);
        SlytheriStudents gregory = new SlytheriStudents("Грегори Гойл", 55, 54, 53, 45, 23, 41, 17);

        System.out.println(harry);
        System.out.println(zacharias);
        System.out.println(zhou);
        System.out.println(draco);

        harry.compared(hermione);
        justin.compared(cedric);
        marcus.compared(padma);
        draco.compared(gregory);

        harry.compared(draco);

    }
}
