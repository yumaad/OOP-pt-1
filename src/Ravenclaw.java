class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transfigurationDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transfigurationDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("Интеллект: " + intelligence);
        System.out.println("Мудрость: " + wisdom);
        System.out.println("Остроумие: " + wit);
        System.out.println("Творчество: " + creativity);
    }

    public void compare(Ravenclaw other) {
        int thisSum = this.intelligence + this.wisdom + this.wit + this.creativity;
        int otherSum = other.intelligence + other.wisdom + other.wit + other.creativity;

        if (thisSum > otherSum) {
            System.out.println(this.getName() + " лучше Когтевранец, чем " + other.getName());
        } else if (thisSum < otherSum) {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + other.getName() + " примерно одинаковые.");
        }
    }
}
