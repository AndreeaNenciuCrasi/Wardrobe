package com.company;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe {
    private int id;
    private static Wardrobe instance = null;
    private int numberOfHangers = 10;
    private List<Hanger> hangers;

    private Wardrobe() {
        this.hangers = new ArrayList<>();
    }

    public static Wardrobe getInstance() {
        if (instance == null) {
            instance = new Wardrobe();
            System.out.println("Creates wardrobe instance");
        }
        return instance;
    }

    public boolean isPlaceFor(Clothes pieceOfClothing) {
        for (int i = 0; i < hangers.size(); i++) {
            if(hangers.get(i).isPlaceFor(pieceOfClothing)){
                System.out.println("There is place for " + pieceOfClothing);
                return true;
            }
        }
        return false;
    }

    public boolean isPlaceFor(ClothesType type) {
        for (int i = 0; i < hangers.size(); i++) {
            if (hangers.get(i).isPlaceFor(type)) {
                System.out.println("There is place for " + type);
                return true;
            }
        }
        return false;
    }

    public boolean isPlaceFor(Hanger hanger) {
        if (hangers.size() < numberOfHangers) {
            System.out.println("There is place for " + hanger);
            return true;
        }
        return false;
    }

    public boolean addHanger(Hanger hanger) {
        if (isPlaceFor(hanger)) {
            hangers.add(hanger);
            System.out.println("Adds hanger");
            return true;
        }
        return false;
    }

    public Clothes getPieceOfClothing(int id) {
        for (int i = 0; i <hangers.size() ; i++) {
            Clothes pick = hangers.get(i).takeOffAPieceOfClothing(id);
            if(pick != null){
                return pick;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfHangers() {
        return numberOfHangers;
    }

    public List<Hanger> getHangers() {
        return hangers;
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "id=" + id +
                ", numberOfHangers=" + numberOfHangers +
                "\nhangers=" + hangers + "}";
    }
}
