import java.util.HashSet;

public class HashSet_Clone_Method_2 {
    public static void main(String[] args){
        HashSet<Integer> hash = new HashSet<Integer>();

        hash.add(121);
        hash.add(111);
        hash.add(151);

        System.out.println("HashSet Elements "+hash);

        HashSet<Integer> set = new HashSet<Integer>();
        set = (HashSet)hash.clone();

        System.out.println("HashSet Elements After Clone: "+set);

    }
}
