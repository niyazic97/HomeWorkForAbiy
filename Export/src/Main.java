import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("работа");
        list.add("возможность");
        list.add("контроль");
        list.add("успех");
        list.add("состояние");
        fix(list);

    }

    static void fix(ArrayList<String> word) {
        for (int i = 0; i < word.size(); i++) {
            if (word.get(i).contains("р") && !word.get(i).contains("л")) {
                word.remove(i);
            } else if (!word.get(i).contains("р") && word.get(i).contains("л")) {
                word.add(i, word.get(i));

            }
        }
        System.out.println(word);
    }
}





