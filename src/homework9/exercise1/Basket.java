package homework9.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Basket {
    private ArrayList<String> fruitsInBasket;

    public Basket() {
        this.fruitsInBasket = new ArrayList<>();
    }

    public boolean findFruit(String searchedFruit) {
        return fruitsInBasket.contains(searchedFruit);
    }

    public boolean removeFruit(String fruit) {
        if (fruitsInBasket.contains(fruit)) {
            fruitsInBasket.remove(fruit);
            return true;
        } else {
            return false;
        }
    }

    public int fruitPosition(String fruit) {
        return fruitsInBasket.indexOf(fruit);
    }

    public Collection<String> distinctFruits() {
        Set<String> distinctFruits = new HashSet<>();
        for (String fruit : fruitsInBasket) {
            distinctFruits.add(fruit);
        }
        return distinctFruits;
//        return fruitsInBasket.stream().distinct().collect(Collectors.toList());
    }

    public void addFruit(String fruit) {
        fruitsInBasket.add(fruit);
    }

    public int countFruits() {
        return fruitsInBasket.size();
    }

    public int customCountFruits() {
        int numberOfFruits = 0;
        for (String fruit : fruitsInBasket) {
            numberOfFruits++;
        }
        return numberOfFruits;
    }

    @Override
    public String toString() {
        return "In my basket I have: " + fruitsInBasket;
    }
}
