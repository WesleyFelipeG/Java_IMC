public class Dados {

    private double peso, altura, imc;
    public void setPeso(double peso) { this.peso = peso; }
    public void setAltura(double altura) { this.altura = altura; }
    public double getPeso() {return peso; }
    public double getAltura() { return altura; }
    public void calcularImc() {
        imc = peso / (altura * altura);
        System.out.println("O IMC é:" + imc);
    }
}
