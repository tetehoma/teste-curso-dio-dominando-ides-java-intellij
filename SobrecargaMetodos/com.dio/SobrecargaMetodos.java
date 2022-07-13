public class SobrecargaMetodos {
    public static void main(String[] args) {
        SobrecargaMetodos.area(3);
        SobrecargaMetodos.area(2.3d, 4.3d);
        SobrecargaMetodos.area(2f, 3f);
        SobrecargaMetodos.area(2, 3, 4);
    }


}
    public static void area (double lado) {
        System.out.println("A area do quadrado é: "+ lado * lado);
    }
    public static void area (double lado1, double lado2) {
        System.out.println("A area do retangulo é: "+ lado1 * lado2);
    }
    public static void area (float d1, float d2) {
        System.out.println("A area do losango é: "+ ((d1 * d2)/2);
    }
    public static void area (double baseMaior, double baseMenor, double altura) {
        System.out.println("A area do trapézio é: "+ ((baseMaior + baseMenor) * altura);
    }

