public class DatosEstadisticos {
    private float tiempo;

    public DatosEstadisticos() {
        this.tiempo=0;
    }
    
    public void añadeTiempo(float tiempo){
        this.tiempo+=tiempo;
    }
    public void estableceTiempo(float tiempo){
        this.tiempo=tiempo;
    }
    public float dameTiempo(){
        return this.tiempo;
    }
}