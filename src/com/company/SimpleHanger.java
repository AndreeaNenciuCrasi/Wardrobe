package com.company;

import java.util.ArrayList;
import java.util.List;

public class SimpleHanger extends Hanger {
    private Clothes topClothes;

    public SimpleHanger() {
        System.out.println("Creates simple hanger");
    }

    @Override
    public boolean addPieceOfClothing(Clothes pieceOfClothing) {
        if (topClothes == null && (pieceOfClothing.getType() == ClothesType.SHIRT || pieceOfClothing.getType() == ClothesType.BLOUSE)) {
            this.topClothes = pieceOfClothing;
            System.out.println("Place topClothes on simple hanger");
            return true;
        }
        return false;
    }

    @Override
    public Clothes takeOffAPieceOfClothing(int id) {

        if(topClothes != null && topClothes.getId() == id){
            Clothes tempClothes = this.topClothes;
            this.topClothes = null;
            System.out.println("Take off a piece of clothing");
            return tempClothes;
        }
        return null;
    }

    @Override
    public List<Clothes> takeOffAllClothes() {
        List<Clothes> pieceOfClothing =new ArrayList<Clothes>();
        pieceOfClothing.add(this.takeOffAPieceOfClothing(topClothes.getId()));
        System.out.println("Take off clothes: " + pieceOfClothing);
        return pieceOfClothing;
    }

    @Override
    public boolean isPlaceFor(Clothes pieceOfClothing) {
        return isPlaceFor(pieceOfClothing.getType());
    }

    @Override
    public boolean isPlaceFor(ClothesType type) {
        if(this.topClothes == null && (type == ClothesType.BLOUSE || type == ClothesType.SHIRT)){
            System.out.println("There is place");
            return true;
        }
        return false;
    }

    public Clothes getTopClothes() {
        return topClothes;
    }

    @Override
    public String toString() {
        return "SimpleHanger{" +
                "topClothes=" + topClothes + "}\n";
    }
}
