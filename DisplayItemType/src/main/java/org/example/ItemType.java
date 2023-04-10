package org.example;

import java.util.Scanner;

public class ItemType {
    private String name;
    private double costPerDay;
    private double deposit;

    public ItemType(String name, double costPerDay, double deposit){
        this.name = name;
        this.costPerDay = costPerDay;
        this.deposit = deposit;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getCostPerDay(){
        return costPerDay;
    }
    public void setCostPerDay(double costPerDay){
        this.costPerDay = costPerDay;
    }

    public double getDeposit(){
        return deposit;
    }
    public void setDeposit(double deposit){
        this.deposit = deposit;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("CostPerDay: " + costPerDay );
        System.out.println("Deposit: " + deposit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the item type name ");
        String name = sc.nextLine();

        System.out.println("Enter the cost per day ");
        double costPerDay = sc.nextDouble();

        System.out.println("Enter the deposit ");
        double deposit = sc.nextDouble();

        System.out.println();

        System.out.println("Item type details");

        ItemType item = new ItemType(name, costPerDay, deposit);
        item.display();
    }

}

