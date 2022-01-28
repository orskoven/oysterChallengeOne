import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.swap;

public class Main {


    static void rotateMethode(ArrayList<Integer> inputList, int numberOfRotations){
        for (int k = 0; k < numberOfRotations ; k++) {
            for (int i = 0, j = inputList.size() - 1; i < inputList.size(); i++) {
                Collections.swap(inputList, i, j);
            }
        }

        System.out.println(inputList);
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println(arrayList);
        rotateMethode(arrayList,2);
    }
}
