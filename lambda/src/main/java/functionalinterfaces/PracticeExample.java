package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PracticeExample {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Arife", "Altin", 33));
        users.add(new User("Hasan", "Altin", 38));
        users.add(new User("Ihsan", "Altin", 8));
        users.add(new User("Ayse", "Altin", 5));
        users.add(new User("Emre", "Altin", 5));
        users.add(new User("Esin", "Altin", 8));

//
//        System.out.println(users.toString());
//
//        for (User u : users)
//            if (u.getFirstName().startsWith("E"))
//                System.out.println(u);

        Function<List<User>, String> fun = u -> u.toString();

        System.out.println(fun.apply(users));

//        Function<List<User>, String> startsWithE = x -> {
//            for (User e : x) {
//                if (e.getFirstName().startsWith("E")) e.toString();
//            }
//            return null;
//        };


    }

}
