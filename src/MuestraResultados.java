public class MuestraResultados {
 
    public static void main(String[] args) {
        System.out.printf("       Tiempo del vector en orden inverso  Tiempo del vector en orden aleatorio\n");
        mostrarResultados(new int[]{1000, 2000, 4000, 8000, 16000, 32000});
    }

    private static void mostrarResultados(int[] tamaños) {
        for (int tamaño : tamaños) {
            DatosEstadisticos[] datosEstadisticos = CalculadorEstadisticas.estadisticaOrdenaVector(new Ordenar1Vector(), tamaño);
            if (tamaño < 10000) System.out.print(" ");
            System.out.printf("%d                              %.4f                                %.4f\n", tamaño, datosEstadisticos[0].dameTiempo(), datosEstadisticos[1].dameTiempo());
        }
    }
}