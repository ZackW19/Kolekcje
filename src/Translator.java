//zadanie słownik

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {

    public static void main(String[] args)
    {
        new Translator();
    }
        private Map<String, String> words;
        private Scanner scanner;

    public Translator()
        {
            words = new HashMap<>();
            scanner = new Scanner(System.in);
            init();
            readDataFromConsole();
        }

    private void init()
    {
        words.put("mama", "mother");
        words.put("tata", "father");
        words.put("kuzyn", "cousin");
        words.put("dziecko", "dziecko");

    }

    private void readDataFromConsole(){

        String response = scanner.nextLine();
        while (!response.equals("exit"))  //pętla działa dopóki ktoś nie wpisze exit  !response => negacja
        {
            if(words.containsKey(response)){
                System.out.println("Tłumaczenie: " + words.get(response));
            }else {
                System.out.println("Nie znam takiego słowa!");
            }
            response = scanner.nextLine();
        }


    }
}
