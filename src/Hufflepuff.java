class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magicPower, int transfigurationDistance, int diligence, int loyalty, int honesty) {
        super(name, magicPower, transfigurationDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("Трудолюбие: " + diligence);
        System.out.println("Верность: " + loyalty);
        System.out.println("Честность: " + honesty);
    }

    public void compare(Hufflepuff other) {
        int thisSum = this.diligence + this.loyalty + this.honesty;
        int otherSum = other.diligence + other.loyalty + other.honesty;

        if (thisSum > otherSum) {
            System.out.println(this.getName() + " лучше Пуффендуй, чем " + other.getName());
        } else if (thisSum < otherSum) {
            System.out.println(other.getName() + " лучше Пуффендуй, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + other.getName() + " примерно одинаковые.");
        }
    }
}
