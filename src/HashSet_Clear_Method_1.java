import java.util.HashSet;

public class HashSet_Clear_Method_1 {
    public static void main(String[] args){
        HashSet<String> hash = new HashSet<String>();

        hash.add("JTP");
        hash.add("SSSIT");
        hash.add("DFC");

        System.out.println("Hash set Elements "+hash);

        hash.clear();

        System.out.println("HashSet Elements After clear "+hash);
    }
}
