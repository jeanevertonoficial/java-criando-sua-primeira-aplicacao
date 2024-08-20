public class Soma {
    public static void main(String[] strings) {
        soma();
        subtracao();
    }

    private static void soma() {
        int num1 = 10;
        int num2 = 5;
        System.out.println("A soma de " + num1 +"+"+ num2 + " = " + (num1 + num2));
    }

    private static void subtracao() {
        int num1 = 10;
        int num2 = 5;
        System.out.println("A subtração de " + num1 +"-"+ num2 + " = " + (num1 - num2));
    }
}
