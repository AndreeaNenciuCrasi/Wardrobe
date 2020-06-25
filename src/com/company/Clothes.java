package com.company;

public class Clothes {
    private int id;
    private static int countId=0;
    private String brandName;
    private ClothesType type;

    public Clothes(String brandName, ClothesType type) {
        countId++;
        this.id = countId;
        this.brandName = brandName;
        this.type = type;
        System.out.println("Creates piece of clothing");
    }

    public int getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public ClothesType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                ", type=" + type +
                '}';
    }
}
