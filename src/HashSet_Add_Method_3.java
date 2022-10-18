import java.util.HashSet;
public class HashSet_Add_Method_3 {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        set.add("Facebook");
        set.add("Twitter");
        set.add("Instagram");
        boolean flag = set.add("Google");
        System.out.println("Is the insertion successfull? "+flag);

        System.out.println(set);
        System.out.println("Elements of the HashSet");
        for(String str:set){
            System.out.println(str);
        }
    }
}
