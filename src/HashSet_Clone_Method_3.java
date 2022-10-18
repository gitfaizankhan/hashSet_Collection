import java.util.HashSet;

public class HashSet_Clone_Method_3 {
    public static void main(String[] args){
        HashSet<String> hash = new HashSet<String>();

        hash.add("JTP");
        hash.add("SSSIT");
        hash.add("DFC");

        System.out.println("Elements of HashSet: ");
        for(String h : hash){
            System.out.println(h);
        }

        HashSet<String> set = new HashSet<String>();
        set = (HashSet)hash.clone();

        System.out.println("HashSet Elements After Clone: ");
        for(String s: set){
            System.out.println(s);
        }
    }
}
