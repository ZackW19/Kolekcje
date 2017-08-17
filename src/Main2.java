import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String > listOfNames = new ArrayList() ;  //nie ma potrzeby w nawiasach <> podawać typu generycznego np String
        listOfNames.add("Oskar");
        listOfNames.add("Wojtek");

        listOfNames.size();

        if (listOfNames.contains("oskar")) {  //case sensitive wynik: nie istnieje
            System.out.println("Istnieje");
        }else{
            System.out.println("Nie istnieje");
        }

        System.out.println(listOfNames.indexOf("Wojtek")); //na 0 jest Oskar, indeks zawsze od 0 tak jak w tablicach

        }
    }


