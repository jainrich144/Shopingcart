package twAssignments;


import java.util.*;

public class Fruits {
    private String Fruits;
    private int Price;
    Map<String, Integer> hm = new HashMap<String, Integer>();
    public int getPrice(String item){
        return hm.get(item);
    }
    Fruits()
    {
        hm.put("Apple",100);
        hm.put("Banana",30);
        hm.put("Orange",80);
        hm.put("Kiwi",120);
    }

}

