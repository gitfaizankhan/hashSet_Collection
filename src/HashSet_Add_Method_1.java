import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Add_Method_1 {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<String>();
        set.add("Ram");
        set.add("Ajay");
        set.add("ram");
        set.add("vijay");
        set.add("Ram");

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
