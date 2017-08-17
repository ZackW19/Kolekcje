import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        Set<Integer> integerSet = new TreeSet<>(); //TreeSet sortowanie od najmniejszej do największej

        Random random= new Random();
        while (integerSet.size()!=6){
            integerSet.add(random.nextInt(48)+1); //w przypadku 0 +1 =1, 48+1 =49

        }
        System.out.println("Twoje liczby to: ");

        for (Integer integer : integerSet) {
            System.out.println("Liczba: " + integer);
        }

    }
}