import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Create a list
        List<String> myList = new ArrayList<>();

        //Insert: Items into the list
        myList.add("T");
        myList.add("A");
        myList.add("N");
        myList.add("D");
        myList.add("O");
        myList.add("H");
        System.out.println(myList);

        //is_empty: to check if my list is empty
        System.out.println("Is my list Empty? " + myList.isEmpty());

        //listSize: to get the size of my List
        System.out.println("The size of my List is " + myList.size());

        //get_index: get the index of an item in my list
        System.out.println("The item at index 1 is  " + myList.get(1));

        //indexOfX: get the index of an item in the list
        System.out.println("The index of 'D' is " + myList.indexOf("D"));

        //delete(index): delete an item using its index
        System.out.println("Removing item with index 0 ");
        myList.remove(0);
        System.out.println(myList);

        //Output: Display the list itself
        System.out.println("My list now looks like " +  myList);
        System.out.println("Is my list Empty? " + myList.isEmpty());
    }
}