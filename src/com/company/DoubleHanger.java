package com.company;

import java.util.ArrayList;
import java.util.List;

public class DoubleHanger extends Hanger {
    private Clothes topClothes;
    private Clothes bottomClothes;

    public DoubleHanger() {
        System.out.println("Creates double hanger");
    }

    @Override
    public boolean addPieceOfClothing(Clothes pieceOfClothing) {
        if (topClothes == null && (pieceOfClothing.getType() == ClothesType.BLOUSE || pieceOfClothing.getType() == ClothesType.SHIRT)) {
            this.topClothes = pieceOfClothing;
            System.out.println("Place topClothes on double hanger");
            return true;
        }
        if (bottomClothes == null && (pieceOfClothing.getType() == ClothesType.SKIRT || pieceOfClothing.getType() == ClothesType.TROUSERS)) {
            this.bottomClothes = pieceOfClothing;
            System.out.println("Place bottomClothes");
            return true;
        }
        return false;
    }

    @Override
    public Clothes takeOffAPieceOfClothing(int id) {
        if(topClothes != null && topClothes.getId() == id){
            Clothes tempClothes = this.topClothes;
            this.topClothes = null;
            System.out.println("Take off topClothes");
            return tempClothes;
        }
        if(bottomClothes != null && bottomClothes.getId() == id){
            Clothes tempClothes = this.bottomClothes;
            this.bottomClothes = null;
            System.out.println("Take off bottomClothes");
            return tempClothes;
        }
        return null;
    }

    @Override
    public List<Clothes> takeOffAllClothes() {
        List<Clothes> clothes =new ArrayList<Clothes>();
        clothes.add(this.takeOffAPieceOfClothing(topClothes.getId()));
        System.out.println("Take off clothes: " + clothes);
        return clothes;
    }

    @Override
    public boolean isPlaceFor(Clothes clothe) {
        return isPlaceFor(clothe.getType());
    }

    @Override
    public boolean isPlaceFor(ClothesType type) {
        if(this.topClothes == null && (type == ClothesType.BLOUSE || type == ClothesType.SHIRT)){
            System.out.println("There is place");
            return true;
        }
        if(this.bottomClothes == null && (type == ClothesType.SKIRT || type == ClothesType.TROUSERS)){
            System.out.println("There is place");
            return true;
        }
        return false;
    }

    public Clothes getTopClothes() {
        return topClothes;
    }

    public Clothes getBottomClothes() {
        return bottomClothes;
    }

    @Override
    public String toString() {
        return "DoubleHanger{" +
                "topClothes=" + topClothes +
                ", bottomClothes=" + bottomClothes + "}\n";
    }
}
