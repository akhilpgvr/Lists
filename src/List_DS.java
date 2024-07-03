import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class List_DS {

    public void listOperations() {

        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        System.out.println(li);
        System.out.println("------------------------");
        li.add(1, 3);
        System.out.println(li); //[1, 2]
        System.out.println("------------------------");
        li.addAll(Arrays.asList(4,5,6));
        System.out.println(li); //[1, 3, 2, 4, 5, 6]
        System.out.println("------------------------");
        li.addFirst(0);
        li.addLast(9);
        System.out.println(li); //[0, 1, 3, 2, 4, 5, 6, 9]
        System.out.println("------------------------");
        System.out.println(li.equals(Arrays.asList(0, 1, 3, 2, 4, 5, 6, 9))); //true
        System.out.println("------------------------");
        System.out.println(li.contains(1)); //true
        System.out.println(li.containsAll(Arrays.asList(1,2,3,7))); //false
        System.out.println("------------------------");
        System.out.println(li.getFirst()+ li.getLast()); //9
    }
}
