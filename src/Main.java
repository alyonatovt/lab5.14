import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner name = new Scanner(System.in);
//        String sentence = "";
//        for (int i = 1; i <6; i++){
//            System.out.print("Введіть слово:");
//            if (name.hasNext());
//            String word = name.next();
//            sentence = sentence.concat(word + " ");
//        }
//        System.out.println(sentence.trim());
//    }
//}




//public class Main {
//    public static void main(String[] args) {
//        Scanner name = new Scanner(System.in);
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("Введіть слово " + i + ": ");
//            String word = name.next();
//            System.out.println("Перша літера слова " + i + ": " + word.substring(0, 1));
//        }
//    }
//}




//public class Main {
//    public static void main(String[] args) {
//        Scanner name = new Scanner(System.in);
//        double a, b, c;
//
//        System.out.println("Введіть три дробові числа:");
//
//        if (name.hasNextDouble()) {
//            a = name.nextDouble();
//        } else {
//            System.out.println("Ви ввели не дробове число! Спробуйте ще раз.");
//            return;
//        }
//
//
//        if (name.hasNextDouble()) {
//            b = name.nextDouble();
//        } else {
//            System.out.println("Ви ввели не дробове число! Спробуйте ще раз.");
//            return;
//        }
//
//        if (name.hasNextDouble()) {
//            c = name.nextDouble();
//        } else {
//            System.out.println("Ви ввели не дробове число! Спробуйте ще раз.");
//            return;
//        }
//
//        double max = Math.max(Math.max(a, b), c);
//        System.out.println("Найбільше дробове число із введених: " + max);
//
//
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//        Scanner name1 = new Scanner(System.in);
//
//        System.out.print("Введіть перше ім'я: ");
//        String firstName = name1.nextLine();
//
//        System.out.print("Введіть друге ім'я: ");
//        String secondName = name1.nextLine();
//
//        if (firstName.equalsIgnoreCase(secondName)) {
//            System.out.println("Імена однакові.");
//        } else {
//            System.out.println("Імена різні.");
//        }
//    }
//    }

public class Main {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);

        System.out.println("Введіть, будь ласка, перший рядок:");
        String firstSentence = line.nextLine();

        System.out.println("Введіть, будь ласка, другий рядок:");
        String secondSentence = line.nextLine();

        int a = firstSentence.length();
        int b = secondSentence.length();
        if (a>b){
            System.out.println("Перший рядок більший за другий");
        } else{
            System.out.println("Другий рядок більший за перший");
        }
        if (a==b){
            System.out.println("Кількість символів рядків однакова");
        }
    }
}




