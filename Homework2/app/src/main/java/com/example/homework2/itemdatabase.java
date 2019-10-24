package com.example.homework2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class itemdatabase {

    public  static item getItemById(int itemID){
        return items.get(itemID);

    }
    public static ArrayList<item> getAllItems(){
        return new ArrayList<item>((List) Arrays.asList(items.values().toArray()));
    }

    private  static final HashMap<Integer, item> items = new HashMap<>();

    static {
        items.put(1,new item(
              1,
                "Pearl Milk Tea",
                7,
                "Assam milk tea with pearl topping",
                R.drawable.pearl,
                0
        ));
        items.put(2,new item(
                2,
                "Tiger Fresh Milk",
                8,
                "Brown sugar with fresh milk",
                R.drawable.tiger,
                0
        ));
        items.put(3,new item(
                3,
                "Cheese Green Tea",
                9,
                "Naturel green tea with cheese cream top",
                R.drawable.cheeseg,
                0
        ));
        items.put(4,new item(
                4,
                "Cheese Black Tea",
                9,
                "Naturel black tea with cheese cream top",
                R.drawable.cheeseblack,
                0
        ));
        items.put(5,new item(
                5,
                "Cheese Matcha",
                9,
                "Matcha milk tea with cheese cream top",
                R.drawable.cheesematcha,
                0

        ));
        items.put(6,new item(
                6,
                "Chocolate Milk Tea",
                9,
                "Milk tea with chocolate flavour",
                R.drawable.chocolate,
                0

        ));

        items.put(7,new item(
                7,
                "Lychee Green Tea",
                9,
                "Green tea with lychee flavour",
                R.drawable.lycheegt,
                0

        ));
        items.put(8,new item(
                8,
                "Peach Black Tea",
                9,
                "Black tea with peach flavour",
                R.drawable.peachblack,
                0
        ));
        items.put(9,new item(
                9,
                "Grapefruit Black Tea",
                6,
                "Black tea with grapefruit flavour",
                R.drawable.grapefruitblack,
                0
        ));
        items.put(10,new item(
                10,
                "Jasmine Green Milk Tea",
                7,
                "Green milk tea with jasmine flavour",
                R.drawable.jasmine,
                0
        ));
        items.put(11,new item(
                11,
                "Pudding Milk Tea",
                7,
                "Assam milk tea with pudding topping",
                R.drawable.pudding,
                0
        ));
        items.put(12,new item(
                12,
                "Lychee Jelly Milk Tea",
                7,
                "Assam milk tea with Lychee jelly topping",
                R.drawable.lycheejelly,
                0
        ));
        items.put(13,new item(
                13,
                "Taro Milk Tea",
                9,
                "Milk tea with taro flavour",
                R.drawable.taro,
                0
        ));
        items.put(14,new item(
                14,
                "Thai Milk Tea",
                9,
                "Milk tea with thai flavour",
                R.drawable.thai,
                0
        ));
        items.put(15,new item(
                15,
                "Kiwi Green Tea",
                14,
                "Green tea with fresh kiwi fruit",
                R.drawable.kiwi,
                0
        ));


    }
}
