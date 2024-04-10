package Clases;

import java.util.ArrayList;

public class Empleado {
    //el atributo instance se utiliza para conservar los datos mientras se ejecuta el proyecto 
    // nos permite usar la informacion en todos los JFrameFrom 
    private static ArrayList<Empleado> instance;
    
    String Nombre_Empleado;
    int Numero_Identidad;
    int edad;
    String Jornada;
    int antiguedad;

    public Empleado() {
    }

    public Empleado(String Nombre_Empleado, int Numero_Identidad, int edad, String Jornada, int antiguedad) {
        this.Nombre_Empleado = Nombre_Empleado;
        this.Numero_Identidad = Numero_Identidad;
        this.edad = edad;
        this.Jornada = Jornada;
        this.antiguedad = antiguedad;
    }
    
    public String getNombre_Empleado() {
        return Nombre_Empleado;
    }

    public void setNombre_Empleado(String Nombre_Empleado) {
        this.Nombre_Empleado = Nombre_Empleado;
    }

    public int getNumero_Identidad() {
        return Numero_Identidad;
    }

    public void setNumero_Identidad(int Numero_Identidad) {
        this.Numero_Identidad = Numero_Identidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getJornada() {
        return Jornada;
    }

    public void setJornada(String Jornada) {
        this.Jornada = Jornada;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre_Empleado=" + Nombre_Empleado + ", Numero_Identidad=" + Numero_Identidad + ", edad=" + edad + ", Jornada=" + Jornada + ", antiguedad=" + antiguedad + '}';
    }
    
    public static ArrayList<Empleado> getinstance_Empleado(){
        if(instance == null){
            instance = new ArrayList<Empleado>();
        }
        return instance;
    }
}
