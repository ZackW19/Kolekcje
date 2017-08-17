

//Sety - brak indeksu, nie wyswietal powtórzen, tzw. worek z danymi
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main3 {
    public static void main(String[] args) {
        Set<String> names   = new TreeSet<>();  //TreeSet<> - sortuje i wyswietla elementy, HashSet wyswietla
        names.add("Oskar");
        names.add("121212");
        names.add("Oskar");
        names.add("Oskar2");
        names.add("Oskar1");

        for (String name: names){
            System.out.println(name);
        }

    }
}
