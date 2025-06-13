public class Vecormax {
    public static void main(String[] args) {
        int[][][] matriz = {
                {
                        {1,2},
                        {3,4}
                },
                {
                        {5,6},
                        {7,8}
                }
        };
        int [][][] matriz2 = {
                {
                        {1,2},
                        {3,4}
                },
                {
                        {5,6},
                        {7,8}
                }
        };
        if (recursiveCompare(matriz,matriz2,0,0,0)){
            System.out.println("Son iguales:");
        }else{
            System.out.println("No son iguales:");
        }
    }
    public static boolean recursiveCompare(int [][][] matriz, int [][][] matriz2, int fila, int columna, int z){
        if (fila==matriz.length-1 && columna==matriz.length-1 && z== matriz.length-1) {
            return true;
        }
        if (columna==2){
            return recursiveCompare(matriz,matriz2,fila+1,0,0);
        }
        if (z==2){
            return  recursiveCompare(matriz,matriz2,fila,columna+1,0);
        }
        if (matriz[fila][columna][z] != matriz[fila][columna][z]){
            return false;
        }
        return recursiveCompare(matriz,matriz2,fila,columna,z+1);
    }
}
