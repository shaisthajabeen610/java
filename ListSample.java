import java.util.*;
public class ListSample {
    public static void main(String[] args) {
        List<String> a=new ArrayList<>();
        a.add("elements");
        a.add("obects");
        a.add("things");
        a.add("pieces");
        a.forEach(b->System.out.println(b));

    }

}
