import java.util.HashSet;

public class HashSet_Contains_Method_1 {
    public static void main(String[] args){
        HashSet<Integer> hash = new HashSet<Integer>();

        hash.add(11);
        hash.add(21);
        hash.add(15);
        hash.add(110);
        hash.add(151);

        System.out.println("HashSet Elements: "+hash);

        System.out.println("Does the set contains '110'?:- "+hash.contains(110));
        System.out.println("Does the set contains '555'?:- "+hash.contains(555));
    }
}
