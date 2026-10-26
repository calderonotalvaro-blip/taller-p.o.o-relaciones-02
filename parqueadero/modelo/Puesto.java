package parqueadero.modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estuam
 */
    public class Puesto {

        public Puesto(int numero) {
            this.numero = numero;
        }
        private final int numero;
        private String placa; 



        public int getNumero() {
            return numero;
        }

        public String getPlaca() {
            return placa;
        }

        public boolean estaLibre() {
            return placa == null;
        }

    void liberar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void ocupar(String placa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




}
    

