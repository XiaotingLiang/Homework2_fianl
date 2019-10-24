package com.example.homework2;

public class item {

    private int itemID;
    private String itemname;
    private int itemprice;
    private String itemdetail;
    private int imageID;
    private  int ordernumber;

    public item (int itemID,String itemname, int itemprice, String itemdetail,int imageID,int ordernumber){
        this.itemID = itemID;
        this.itemname = itemname;
        this.itemdetail = itemdetail;
        this.itemprice = itemprice;
        this.imageID = imageID;
        this.ordernumber = ordernumber;
    }

    public int getItemID(){
        return itemID;
    }

    public void setItemID(int itemID){
        this.itemID = itemID;
    }

    public int getOrdernumber(){
        return ordernumber;
    }

    public void setOrdernumber(int ordernumber){
        this.ordernumber = ordernumber;
    }

    public int getItemprice(){
        return itemprice;
    }

    public void setItemprice(int itemprice){
        this.itemprice = itemprice;
    }
    public String getItemname(){
        return itemname;
    }
    public void setItemname(String itemname){

        this.itemname= itemname;
    }
    public String getItemdetail(){
        return itemdetail;
    }
    public void setItemdetail(String itemdetail){

        this.itemdetail= itemdetail;
    }
    public int getImageID(){
        return imageID;
    }

    public void setImageID(int imageID){
        this.imageID = imageID;
    }

}
