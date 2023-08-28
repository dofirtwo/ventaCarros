package ventacarros;

/**
 *
 * @author USUARIO
 */
public class Carro {
      //atributos
    private String placa;
    private String marca;
    private String color;
    private int modelo;
    
    //constructores  

    public Carro(String placa, String marca, String color, int modelo) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

    public Carro() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}
