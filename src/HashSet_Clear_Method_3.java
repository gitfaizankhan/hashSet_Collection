import java.util.HashSet;

public class HashSet_Clear_Method_3 {
    public static void main(String[] args){
        HashSet<String> hash = new HashSet<String>();

        hash.add("Facebook");
        hash.add("Twitter");
        hash.add("Instagram");
        hash.add("Google");

        System.out.println("Size of the HashSet: "+hash.size());
        System.out.println("Elemets if the HashSet Before Clear");
        for(String e:hash){
            System.out.println(e);
        }
        hash.clear();
        System.out.println("Size of the HashSet: "+hash.size());
    }
}
