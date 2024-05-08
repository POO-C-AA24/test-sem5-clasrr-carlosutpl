public class Terreno{
    public double alto; 
    public double ancho;
    public double vmc;
    public double area;
    public double costoFinal;

    public Terreno(double alto, double ancho, double vmc, double area, double costoFinal) {
        this.alto = alto;
        this.ancho = ancho;
        this.vmc = vmc;
        this.area = area;
        this.costoFinal = costoFinal;
    }

    @Override
    public String toString() {
        return "Terreno{" + "alto=" + alto + ", ancho=" + ancho + ", vmc=" + vmc + ", area=" + area + ", costoFinal=" + costoFinal + '}';
    }
}