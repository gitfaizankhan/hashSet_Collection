import java.util.HashSet;

public class HashSet_Clone_method_1 {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        set.add("JavaTpoint");
        set.add("Google");
        set.add("Hindi100");
        set.add("Facebook");
        System.out.println("HashSet Elements Before Clone: "+set);

        HashSet<String> colneSet = new HashSet<String>();
        colneSet = (HashSet)set.clone();
        System.out.println("HashSet Elements After Clone: "+colneSet);
    }
}
