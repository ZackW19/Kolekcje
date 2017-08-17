import java.lang.reflect.Array;
import java.util.*;

//program który odczytuje n liczb i zlicza wystąpienia danej liczby

public class Zadania {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Podaj liczby rozdzielone spacją: ");
        String integers = myScanner.nextLine();
        String[] arrayOfIntegers = integers.split(" ");  //split rozdziela liczby po podanym znaku - tutaj spacja
        Set<String> setOfIntegers = new HashSet<>(Arrays.asList(arrayOfIntegers)); //konwersja na set - unikamy powtórzeń1

        int counter = 0;
        for (String arrayOfInteger : setOfIntegers )
              {
                  for (String integer : arrayOfIntegers){
                      if(integer.equals(arrayOfInteger)){
                          counter ++;

                      }
                  }
                  System.out.println("Wystąpień liczby " + arrayOfInteger + ": " + counter);
                  counter = 0;

                }

    }




}