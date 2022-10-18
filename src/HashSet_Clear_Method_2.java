import java.util.HashSet;

public class HashSet_Clear_Method_2 {
    public static void main(String[] args){
        HashSet<Integer> hash = new HashSet<Integer>();
        hash.add(12);
        hash.add(23);
        hash.add(34);
        hash.add(45);

        System.out.println("HashSet Elements Before Clear "+hash);

        hash.clear();

        System.out.println("HashSet Elements After Clear "+hash);
    }
}
