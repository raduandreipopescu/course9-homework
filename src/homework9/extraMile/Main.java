package homework9.extraMile;

public class Main {
    public static void main(String[] args) {
        ArrayLikeASet myArrayLikeASet = new ArrayLikeASet();
        myArrayLikeASet.addToList(20);
        myArrayLikeASet.addToList(25);
        myArrayLikeASet.addToList(25);
        myArrayLikeASet.addToList(1);
        myArrayLikeASet.addToList(3);
        myArrayLikeASet.addToList(2);

        System.out.println("My array contains: " + myArrayLikeASet);

        System.out.println("An element is: " + myArrayLikeASet.getElement(3));

        myArrayLikeASet.removeFromList(3);
        myArrayLikeASet.removeFromList(1);
        myArrayLikeASet.removeFromList(10);
        System.out.println("After removing, my array contains: " + myArrayLikeASet);


    }
}
