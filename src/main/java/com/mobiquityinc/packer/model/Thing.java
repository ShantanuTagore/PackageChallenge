package com.mobiquityinc.packer.model;

public class Thing {
    private int indexNumber;
    private float weight;
    private float cost;

    public Thing(int indexNumber, float weight, float cost) {
        this.indexNumber = indexNumber;
        this.weight = weight;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "indexNumber=" + indexNumber +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public float getWeight() {
        return weight;
    }

    public float getCost() {
        return cost;
    }
}
