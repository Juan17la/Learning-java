package randomTries;

public class FundamentalExercises {

    public static String sayMyName(String name) {
        String concat_names = "Hello " + name + "!";
        System.out.println(concat_names);
        return concat_names;
    }

    public static Integer sayMyAge(Integer age){
        System.out.println("You age is " + age);
        return age;
    }

    public static long factorialNumbers(Integer num){
        if(num < 0 ){
            throw new IllegalArgumentException("No se puede sacar factorial de numeros negativos");
        }

        if (num == 1 || num == 0) {
            return 1;
        }

        Integer result = 1;

        for(Integer  i = 2; i <= num ; i++) {
            System.out.println(result *= i);
        }

        System.out.println("El resultado del factorial " + num + " es: " + result);
        return result;
    }

    public static long anotheFunction(Integer num){
        return 1;
    }

    public static void main(String[] args) {
        sayMyName("Jose");
        sayMyAge(18);
        factorialNumbers(3);
        anotheFunction(5)
    }

}
