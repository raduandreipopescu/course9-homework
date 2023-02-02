package homework9.exercise2;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Bouquet {
    private HashSet<String> flowersInBouquet;

    public Bouquet() {
        this.flowersInBouquet = new HashSet<>();
    }

    public Collection<String> getAllFlowers() {
        return flowersInBouquet.stream().collect(Collectors.toList());
    }

    public void addFlower(String flower) {
        flowersInBouquet.add(flower);
    }

    public void removeFlower(String flower) {
        flowersInBouquet.remove(flower);
    }

    @Override
    public String toString() {
        return "What I have in my bouquet: " + flowersInBouquet;
    }
}