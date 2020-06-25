package com.company;

import java.util.List;

public abstract class Hanger {
    private int id;
    private static int countId=0;

    public Hanger() {
        countId++;
        this.id = countId;

    }

    public int getId() {
        return id;
    }

    public abstract boolean addPieceOfClothing(Clothes clothe);
    public abstract Clothes takeOffAPieceOfClothing(int id);
    public abstract List<Clothes>takeOffAllClothes();
    public abstract boolean isPlaceFor(Clothes clothe);
    public abstract boolean isPlaceFor(ClothesType type);
}
