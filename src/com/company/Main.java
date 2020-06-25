package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Hanger> hangersList = new ArrayList<>();
        Clothes pieceOfClothing1 = new Clothes("xxx", ClothesType.SKIRT);
        Clothes pieceOfClothing2 = new Clothes("zara", ClothesType.BLOUSE);
        Clothes pieceOfClothing3 = new Clothes("h&m", ClothesType.TROUSERS);
        Clothes pieceOfClothing4 = new Clothes("max", ClothesType.SHIRT);
        Clothes pieceOfClothing5 = new Clothes("yyy", ClothesType.SKIRT);
        Clothes pieceOfClothing6 = new Clothes("eee", ClothesType.BLOUSE);
        Clothes pieceOfClothing7 = new Clothes("ddd", ClothesType.TROUSERS);
        Clothes pieceOfClothing8 = new Clothes("ert", ClothesType.SHIRT);
        Clothes pieceOfClothing9 = new Clothes("yyy", ClothesType.SKIRT);
        Clothes pieceOfClothing10 = new Clothes("eee", ClothesType.BLOUSE);
        Clothes pieceOfClothing11 = new Clothes("ddd", ClothesType.TROUSERS);
        Clothes pieceOfClothing12 = new Clothes("ert", ClothesType.SHIRT);

        SimpleHanger simpleHanger1 = new SimpleHanger();
        SimpleHanger simpleHanger2 = new SimpleHanger();
        SimpleHanger simpleHanger3 = new SimpleHanger();
        SimpleHanger simpleHanger4 = new SimpleHanger();

        DoubleHanger doubleHanger1 = new DoubleHanger();
        DoubleHanger doubleHanger2 = new DoubleHanger();
        DoubleHanger doubleHanger3 = new DoubleHanger();
        DoubleHanger doubleHanger4 = new DoubleHanger();

        Wardrobe wardrobe = Wardrobe.getInstance();

        simpleHanger1.addPieceOfClothing(pieceOfClothing1);
        simpleHanger2.addPieceOfClothing(pieceOfClothing2);
        simpleHanger3.addPieceOfClothing(pieceOfClothing3);

        doubleHanger1.addPieceOfClothing(pieceOfClothing9);
        doubleHanger1.addPieceOfClothing(pieceOfClothing10);
        System.out.println(doubleHanger1);
        doubleHanger2.addPieceOfClothing(pieceOfClothing11);
        doubleHanger2.addPieceOfClothing(pieceOfClothing12);
        System.out.println(doubleHanger2);


        hangersList.addAll(Arrays.asList(simpleHanger1, simpleHanger2, simpleHanger3, simpleHanger4, doubleHanger1, doubleHanger2, doubleHanger3, doubleHanger4, simpleHanger1, simpleHanger2, simpleHanger3));


        for (Hanger o : hangersList) {
            if (wardrobe.isPlaceFor(o)) {
                wardrobe.addHanger(o);
                System.out.println("ADDS HANGER");
            } else {
                System.out.println("NO ROOM FOR HANGERS");
            }
        }

        System.out.println();
        System.out.println("**************************************");
        System.out.println();
        System.out.println(wardrobe);
        System.out.println();

        System.out.println("Take off " + wardrobe.getPieceOfClothing(10));

        System.out.println();
        System.out.println("**************************************");
        System.out.println();
        System.out.println(wardrobe);
        System.out.println();

        System.out.println("Take off " + wardrobe.getPieceOfClothing(2));

        System.out.println();
        System.out.println("**************************************");
        System.out.println();
        System.out.println(wardrobe);
        System.out.println();

//        wardrobe.getPieceOfClothing(3);
//
//        System.out.println();
//        System.out.println("**************************************");
//        System.out.println();
//        System.out.println(wardrobe);
//        System.out.println();
//
//        wardrobe.getPieceOfClothing(4);
//
//        System.out.println();
//        System.out.println("**************************************");
//        System.out.println();
//        System.out.println(wardrobe);
//        System.out.println();


    }
}
