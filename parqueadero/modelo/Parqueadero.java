package parqueadero.modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estuam
 */
import java.util.ArrayList;

public class Parqueadero {
    private final ArrayList<Puesto> puestos;
    
   
    private static int ingresosTotales = 0;

    public Parqueadero(String nombre, int cantidad) {
        this.puestos = new ArrayList<>();

        for (int i = 1; i <= cantidad; i++) {
            puestos.add(new Puesto(i));
        }
    }


    public static int getIngresosTotales() {
        return ingresosTotales;
    }

    
    private Puesto buscarPuestoConPlaca(String placa) {
        for (Puesto p : puestos) {
            
            if (!p.estaLibre() && p.getPlaca().equalsIgnoreCase(placa)) {
                return p;
            }
        }
        return null;
    }

    public void ingresar(String placa) {
       
        if (buscarPuestoConPlaca(placa) != null) {
            System.out.println(placa + " ya está adentro");
            return;
        }

    
        Puesto puestoLibre = null;
        for (Puesto p : puestos) {
            if (p.estaLibre()) {
                puestoLibre = p;
                break;
            }
        }

        
        if (puestoLibre != null) {
            puestoLibre.ocupar(placa);
            ingresosTotales++; 
            System.out.println(placa + " en puesto " + puestoLibre.getNumero());
        } else {
          
            System.out.println(placa + ": parqueadero lleno");
        }
    }

    public boolean salir(String placa) {
        Puesto puestoEncontrado = buscarPuestoConPlaca(placa);
        if (puestoEncontrado != null) {
            puestoEncontrado.liberar();
            return true; 
        }
        return false; 
    }

    public int puestosLibres() {
        int libres = 0;
        for (Puesto p : puestos) {
            if (p.estaLibre()) {
                libres++;
            }
        }
        return libres;
    }
}
