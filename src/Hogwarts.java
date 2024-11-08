public class Hogwarts {
    private String name;
    private int magicPower;
    private int transfigurationDistance;

    public Hogwarts(String name, int magicPower, int transfigurationDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transfigurationDistance = transfigurationDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransfigurationDistance() {
        return transfigurationDistance;
    }

    public String getName() {
        return name;
    }

    public void printDescription() {
        System.out.println("Имя: " + name);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + transfigurationDistance);
    }

    public void compare(Hogwarts other) {
        if (this.magicPower > other.magicPower) {
            System.out.println(this.name + "  имеет бОльшую мощь магии.");
        } else if (this.magicPower < other.magicPower) {
            System.out.println(other.name + " имеет бОльшую мощь магии.");
        } else {
            System.out.println(this.name + " и " + other.name + " одинаковая сила магии.");
        }

        if (this.transfigurationDistance > other.transfigurationDistance) {
            System.out.println(this.name + " может трансгрессировать на большее расстояние.");
        } else if (this.transfigurationDistance < other.transfigurationDistance) {
            System.out.println(other.name + " может трансгрессировать на большее расстояние.");
        } else {
            System.out.println(this.name + " и " + other.name + " одинаковое расстояние трансгрессии.");
        }
    }
}
