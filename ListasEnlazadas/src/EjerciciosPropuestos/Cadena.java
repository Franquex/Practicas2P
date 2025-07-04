public class Cadena {
    public static void main(String[] args) {
        String cadena = "FRANCO";
        String invertido = invertir(cadena);
        System.out.println("La cadena que invierte es: " +invertido);
    }

    public static String invertir(String cadena) {
        if (cadena.isEmpty()){
            return cadena;
        }
        return cadena.charAt(cadena.length()-1)+invertir(cadena.substring(0,cadena.length()-1));
    }
}
