public class RecPoten {
    public static void main(String[] args) {
        double numero = 2;
        int n= 4 ;
        double resultado = potencio(numero,n);
        System.out.println("El numero: " +numero+ " elevado a " +n+ " es: " +resultado);
    }
    public static double potencio(double numero, int n){
        if (n==0){
            return 1;
        }
        return numero * potencio(numero, n-1);
    }
}
