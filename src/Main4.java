//Kolejki - queue

import java.util.ArrayDeque;
import java.util.Queue;

public class Main4 {
    public static void main(String[] args) {
        ArrayDeque<String> queue1 = new ArrayDeque<>();  //zaimplementowana kolejka FIFO wyswietla elementy po kolei jak zostałe wpisane
        queue1.add("Oskar");
        queue1.add("Cześć");
        queue1.add("AkademiaKodu");


        //queue1.remove() ;  //usuwa Oskar
        //System.out.println(queue1.poll()); //wyswietla "czesc"
        //System.out.println(queue1.poll()); //wyswietla "AkademiaKodu"
        //System.out.println(queue1.poll()); //wyswietla null gdy remove aktywny
        System.out.println(queue1.pollLast()); //wyswietla ostatni
        System.out.println(queue1.pollFirst()); //wyswietla pierwszy
        System.out.println(queue1.poll());

    }


}
