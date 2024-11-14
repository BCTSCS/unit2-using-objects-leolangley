public class MethodLab2 {
    public static void forLoop(int start, int stop, int increment){
        for (int i = start; i < stop; i = i + increment){
            System.out.print(i+" ");
        }
    }

    public static void whileLoop(int number){
        int count = 0;
        int sum = 0;
        
        while (number > 0){
            int last = number % 10;
            sum += last;
            number /= 10;
            count++;
        }

        System.out.println(count + " Digits Totaling " + sum);
    }

    public static void addHyphen(String phrase){
        System.out.println(phrase);
        phrase = phrase.toUpperCase();
        System.out.println(phrase);
        phrase = phrase.replace(" ","-");
        System.out.println(phrase);
    }

    public static void main(String[] args) {
        forLoop(2, 90, 5);
        forLoop(-10, 8, 2);
        forLoop(100, 150, 5);
        whileLoop(234);
        whileLoop(10000);
        whileLoop(123456789);
        whileLoop(222222);
        addHyphen("Hello World");
        addHyphen("Jim Bob");
        addHyphen("Computer Science");
        addHyphen("UTL TCEA");
        addHyphen("State Champions");
    }
}