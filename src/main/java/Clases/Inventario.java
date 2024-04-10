package Clases;

import java.util.ArrayList;


public class Inventario {
    
    private static ArrayList<Inventario> instance ;
    
    String Nom_producto;
    String tipo_producto;
    int num_unidades;
    int valor_unitario;

    public Inventario() {
    }

    public Inventario(String Nom_producto, String tipo_producto, int num_unidades, int valor_unitario) {
        this.Nom_producto = Nom_producto;
        this.tipo_producto = tipo_producto;
        this.num_unidades = num_unidades;
        this.valor_unitario = valor_unitario;
    }

    public String getNom_producto() {
        return Nom_producto;
    }

    public void setNom_producto(String Nom_producto) {
        this.Nom_producto = Nom_producto;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public int getNum_unidades() {
        return num_unidades;
    }

    public void setNum_unidades(int num_unidades) {
        this.num_unidades = num_unidades;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(int valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    @Override
    public String toString() {
        return "Inventario{" + "Nom_producto=" + Nom_producto + ", tipo_producto=" + tipo_producto + ", num_unidades=" + num_unidades + ", valor_unitario=" + valor_unitario + '}';
    }
    
    public static ArrayList<Inventario> getinstance_Inventario(){
        if(instance == null){
            instance = new ArrayList<Inventario>();
        }
        return instance;
    }
    
}
