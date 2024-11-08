class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int magicPower, int transfigurationDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transfigurationDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }

    public void compare(Gryffindor other) {
        int thisSum = this.nobility + this.honor + this.bravery;
        int otherSum = other.nobility + other.honor + other.bravery;

        if (thisSum > otherSum) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + other.getName());
        } else if (thisSum < otherSum) {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + other.getName() + " примерно одинаковые.");
        }
    }
}