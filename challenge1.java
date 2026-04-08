package Lab6;
import java.util.*;

public class challenge1 {
public static void main(String[] args){
    Map<String,String>map = new HashMap<>();
    map.put("Smith","216-555-1234");
    map.put("Johnson","216-555-2345");
    map.put("Williams","216-555-3456");
    map.put("Brown","216-555-4567");
    map.put("Davis","216-555-5678");
    map.put("Smith","216-555-9999");
    System.out.println("Entries in map: "+map);
    System.out.println("The phone number for Williams is "+map.get("Williams"));
    System.out.println("Is Brown in the map? "+map.containsKey("Brown"));
    System.out.println("I 216-555-0000 in the map? "+map.containsValue("216-555-0000"));
    map.remove("Taylor");
    System.out.println("Entries in map: "+map);
    map.clear();
    System.out.println("Entries in map after clearing: "+map);
}
}
