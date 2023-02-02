package homework9.exercise1;

public class UsingTheBasket {
    public static void main(String[] args) {
        Basket myBasket = new Basket();
        System.out.println(myBasket);

        myBasket.addFruit("apple");
        myBasket.addFruit("orange");
        myBasket.addFruit("orange");
        myBasket.addFruit("tomato");
        myBasket.addFruit("lemon");
        System.out.println(myBasket);

        System.out.printf("I found a %s in my basket and removed it. %s\n", "apple", myBasket.removeFruit("apple"));
        System.out.printf("I found a %s in my basket and removed it. %s\n", "clementine", myBasket.removeFruit("clementine"));
        System.out.println(myBasket);

        if (myBasket.fruitPosition("orange") >= 0) {
            System.out.printf("The position of the %s is %d.\n", "orange", myBasket.fruitPosition("orange"));
        } else {
            System.out.println("Fruit not found.");
        }

        if (myBasket.fruitPosition("pear") >= 0) {
            System.out.printf("The position of the %s is %d.\n", "pear", myBasket.fruitPosition("pear"));
        } else {
            System.out.printf("%s not found.\n", "pear");
        }

        System.out.printf("Do I have a %s in my basket? %s\n", "pear", myBasket.findFruit("pear"));

        System.out.println("Distinct fruits in the basket are: " + myBasket.distinctFruits());

        System.out.printf("We have %d fruits in the basket.\n", myBasket.countFruits());

        System.out.printf("We have %d fruits in the basket.\n", myBasket.customCountFruits());
    }
}
