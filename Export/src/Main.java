import javax.swing.*;
import java.util.*;
import java.util.HashMap;
//1. Создать два списка LinkedList & ArrayList.
//
//Нужно создать два списка – LinkedList и ArrayList.
//2. Провести 10 тысяч вставок, удалений
//
//Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
//3. Измерить сколько времени занимает 10 тысяч вставок для каждого списка
//
//Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
//Метод getTimeMsOfInsert должен вернуть время его исполнения в миллисекундах.
//4. Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
//
//Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
//Метод getTimeMsOfGet должен вернуть время его исполнения в миллисекундах.
public class Main {


    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> listTwo = new LinkedList<>();
        Date oldDate = new Date();
        insert10000(list);
        get10000(list);
        set10000(list);
        Date between = new Date();
        long timeBetween = between.getTime() - oldDate.getTime();
        System.out.println(timeBetween);
        insert10000(listTwo);
        get10000(listTwo);
        set10000(listTwo);
        Date newDate = new Date();
        long time = newDate.getTime() - between.getTime();
        System.out.println(time);
        }
        public static void insert10000(List list){
        for (int i = 0;i<100_00;i++){
            list.add(i,i);
        }
        }
        static void get10000(List list){
        for (int j = 0;j<100_00;j++){
            list.get(j);
        }
        }
        static void set10000(List list){
        for ( int k = 0;k<100_00;k++){
            list.set (k,"niyaz");
        }
        }
        static void remove10000(ArrayList list){
        for (int o = 0;o<100_00;o++)
        list.remove(o);
        }


    }







