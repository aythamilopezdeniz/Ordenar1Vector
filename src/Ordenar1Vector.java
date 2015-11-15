public class Ordenar1Vector implements OrdenarVector {
    private String nombreMetodo;

    @Override
    public String nombreMetodo() {
        return nombreMetodo;
    }

    @Override
    public void ordena(int[] v, DatosEstadisticos de) {
        long tiempoInicio=System.currentTimeMillis();
        for(int i=0;i<v.length-1;i++)buscaMenor(v, i);        
        de.estableceTiempo((float)(System.currentTimeMillis()-tiempoInicio)/1000f);
    }

    private static void buscaMenor(int[] v, int posicion) {
        for(int j=posicion+1;j<v.length;j++) {
            if(v[posicion]>v[j])reordena(v, posicion, j);          
        }
    }

    private static void reordena(int[] v, int posicionMayor, int posicionMenor) {
        int aux=v[posicionMayor];
        v[posicionMayor]=v[posicionMenor];
        v[posicionMenor]=aux;
    }
}