package com.example.homework2;

public class Orderitem {
    private String itemname;
    private int itemprice;
    private int ordernumber;
    private int imageID;
    public Orderitem(String itemname, int itemprice, int ordernumber, int imageID){

        this.itemname = itemname;
        this.itemprice= itemprice;
        this.ordernumber = ordernumber;
        this.imageID = imageID;
    }

    public String getItemname() {
        return itemname;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public int getItemprice() {
        return itemprice;
    }

    public int getOrdernumber() {
        return ordernumber;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public void setItemprice(int itemprice) {
        this.itemprice = itemprice;
    }

    public void setOrdernumber(int ordernumber) {
        this.ordernumber = ordernumber;
    }
}
