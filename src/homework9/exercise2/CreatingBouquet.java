package homework9.exercise2;

public class CreatingBouquet {
    public static void main(String[] args) {
        Bouquet myBouquet = new Bouquet();
        System.out.println(myBouquet);

        myBouquet.addFlower("rose");
        myBouquet.addFlower("rose");
        myBouquet.addFlower("daisy");
        myBouquet.addFlower("lily");
        System.out.println(myBouquet);

        myBouquet.removeFlower("rose");
        System.out.println(myBouquet);

        System.out.println("My bouquet has: " + myBouquet.getAllFlowers());
    }
}
