
import java.util.*;

public class App {

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) { // Remove duplicates function
        ArrayList<T> newList = new ArrayList<T>();

        for (T element : list) {

            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in); // Create variable for user input
        ArrayList<Integer> myList = new ArrayList<Integer>(); // Create array list
        System.out.println("Enter 10 numbers");

        for (int i = 0; i < 10; i = i + 1) {

            myList.add(input.nextInt());

        }

        ArrayList<Integer> myList2 = removeDuplicates(myList); // Remove duplicates from the array list
        Collections.sort(myList2, Collections.reverseOrder()); // Sort remaining numbers in the list in descending order
        System.out.println(myList2);

    }

}
