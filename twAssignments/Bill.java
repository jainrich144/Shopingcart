package twAssignments;
import java.util.*;
public class Bill {


    public static void main(String args[]) {
        float total= 0.0f;
        Fruits myFruits= new Fruits();

        List<ShopCart> list = new ArrayList<ShopCart>();
        ShopCart cart1 = new ShopCart("Apple" , 2.0f);
        ShopCart cart2 = new ShopCart("Orange" , 1.5f);
        ShopCart cart3 = new ShopCart("Banana" , 0.5f);
        ShopCart cart4 = new ShopCart("Kiwi" , 0.75f);

        list.add(cart1);
        list.add(cart2);
        list.add(cart3);
        list.add(cart4);

        for(ShopCart c:list){
            int price = myFruits.getPrice(c.item);
            total= c.qty* price+ total;
            System.out.println(c.item+" "+c.qty+"KG"+" " +c.qty*price);

        }
        System.out.println("Total bill amount is "+total);
    }
}