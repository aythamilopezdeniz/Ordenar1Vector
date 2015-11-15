public class CalculadorEstadisticas {
    public static DatosEstadisticos[] estadisticaOrdenaVector(OrdenarVector m, int tam_vector) {
        DatosEstadisticos[] datosEstadisticos=new DatosEstadisticos[2];
        datosEstadisticos[0]=estadisticaOrdenaVectorInverso(m, tam_vector);
        datosEstadisticos[1]=calculaEstadisticaOrdena10VectoresAleatorios(m, tam_vector);
        return datosEstadisticos;
    }

    private static DatosEstadisticos estadisticaOrdenaVectorInverso(OrdenarVector m, int tam_vector) {
        int[] vectorInverso=GeneraCaso.generaVector(tam_vector, false);
        DatosEstadisticos datosEstadisticosVectorInverso=new DatosEstadisticos();
        m.ordena(vectorInverso, datosEstadisticosVectorInverso);
        CompruebaCaso.compruebaVector(vectorInverso, tam_vector);
        return datosEstadisticosVectorInverso;
    }

    private static DatosEstadisticos calculaEstadisticaOrdena10VectoresAleatorios(OrdenarVector m, int tam_vector) {
        DatosEstadisticos datosEstadisticos=new DatosEstadisticos();
        datosEstadisticos.estableceTiempo(estadisticaOrdena10VectoresAleatorios(m, tam_vector));
        return datosEstadisticos;
    }

    private static float estadisticaOrdena10VectoresAleatorios(OrdenarVector m, int tam_vector) {
        float sumaEstadisticos=0;
        for(int i=0;i<10;i++) 
            sumaEstadisticos+=estadisticaOrdenaVectorAleatorio(m, tam_vector);
        return sumaEstadisticos/10f;
    }

    private static float estadisticaOrdenaVectorAleatorio(OrdenarVector m, int tam_vector) {
        int[] vectorAleatorio=GeneraCaso.generaVector(tam_vector, true);
        DatosEstadisticos estadisticos=new DatosEstadisticos();
        m.ordena(vectorAleatorio, estadisticos);
        CompruebaCaso.compruebaVector(vectorAleatorio, tam_vector);
        return estadisticos.dameTiempo();
    }

    public static DatosEstadisticos[][] estadisticasOrdenaVectores(OrdenarVector m, int[] tam_vectores) {
        DatosEstadisticos[][] datosEstadisticos=new DatosEstadisticos[tam_vectores.length][2];
        for(int i=0;i<datosEstadisticos.length;i++)
            datosEstadisticos[i]=estadisticaOrdenaVector(m, tam_vectores[i]);
        return datosEstadisticos;
    }
}