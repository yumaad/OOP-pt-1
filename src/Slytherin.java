class Slytherin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public Slytherin(String name, int magicPower, int transfigurationDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transfigurationDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти: " + thirstForPower);
    }

    public void compare(Slytherin other) {
        int thisSum = this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower;
        int otherSum = other.cunning + other.determination + other.ambition + other.resourcefulness + other.thirstForPower;

        if (thisSum > otherSum) {
            System.out.println(this.getName() + " лучше Слизеринец, чем " + other.getName());
        } else if (thisSum < otherSum) {
            System.out.println(other.getName() + " лучше Слизеринец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + other.getName() + " примерно одинаковые.");
        }
    }
}