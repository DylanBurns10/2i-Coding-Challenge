
import java.util.*;

public class Challenge {

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> newList = new ArrayList<T>();

        for (T element : list) {

            if (!newList.contains(element)) {

                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        ArrayList myList = new ArrayList<Integer>();
        System.out.println("Enter 10 numbers");

        for (int i = 0; i < 10; i = i + 1) {

            myList.add(input.nextInt());

        }

        ArrayList myList2 = removeDuplicates(myList);
        Collections.sort(myList2, Collections.reverseOrder());
        System.out.println(myList2);

    }

}
