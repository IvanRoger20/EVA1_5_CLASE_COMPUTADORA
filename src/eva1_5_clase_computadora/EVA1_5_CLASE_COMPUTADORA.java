/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_clase_computadora;

/**
 *
 * @author IvanTron
 */
public class EVA1_5_CLASE_COMPUTADORA {

    public static void main(String[] args) {
        Computadora miCompu = new Computadora();
        miCompu.setProcesador("AMD RYZEN 5");
        miCompu.setSistemaOperativo("Windows 10");
        miCompu.setRam(16);
        miCompu.setEspacioDiscoDuro(2);
        miCompu.setTarjetaGrafica("NVIDIA 2080");
        miCompu.setPrecio(15000.00);
        miCompu.imprimirDatos();
    }

}

class Computadora {

    private String procesador;
    private String sistemaOperativo;
    private String tarjetaGrafica;
    private int ram;
    private int espacioDiscoDuro;
    private double precio;

    public void setProcesador(String valor) {
        procesador = valor;
    }

    public String GetProcesador() {
        return procesador;
    }

    public void setTarjetaGrafica(String valor) {
        tarjetaGrafica = valor;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }
    
    public void setSistemaOperativo(String valor) {
        sistemaOperativo = valor;
    }
    
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setRam(int valor) {
        ram = valor;
    }

    public int getRam() {
        return ram;
    }

    public void setEspacioDiscoDuro(int valor) {
        espacioDiscoDuro = valor;
    }

    public int getEspacioDiscoDuro() {
        return espacioDiscoDuro;
    }

    public void setPrecio(double valor) {
        precio = valor;
    }

    public double getPrecio() {
        return precio;
    }
    
    public double getIva() {
        double valor;
        valor = precio * 0.16;
        valor = valor + precio;
        return valor;
    }
    
    public void imprimirDatos() {
        System.out.println("Especificaciones de la computadora: ");
        System.out.println("Procesador: " + procesador);
        System.out.println("Sistema operativo: " + sistemaOperativo);
        System.out.println("Ram: " + ram + "GB");
        System.out.println("Espacio en disco duro: " + espacioDiscoDuro + "TB");
        System.out.println("Tarjeta de video: " + tarjetaGrafica);
        System.out.println("Precio sin iva: " + precio);
        System.out.println("Precio Total: " + getIva());
    }
}
