public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 80, 10, 90, 80, 95);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 75, 15, 95, 90, 85);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 70, 12, 80, 85, 80);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 90, 20, 90, 85, 95, 80, 90);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 85, 18, 80, 80, 85, 75, 85);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 75, 15, 70, 75, 80, 70, 75);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 70, 10, 85, 80, 90);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 80, 15, 90, 95, 90);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 75, 12, 80, 85, 80);

        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 85, 18, 95, 90, 90, 95);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 80, 15, 90, 85, 85, 90);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 75, 12, 85, 80, 80, 85);

        hermioneGranger.printDescription();
        System.out.println();

        dracoMalfoy.printDescription();
        System.out.println();

        hermioneGranger.compare(ronWeasley);
        System.out.println();

        dracoMalfoy.compare(zachariasSmith);
    }
}