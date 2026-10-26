package musica.modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estuam
 */
import java.util.ArrayList;

public class Playlist {
    public static final int MAX_CANCIONES = 3;
    private final String nombre;
    private final ArrayList<Cancion> canciones;

    public Playlist(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public boolean agregar(Cancion cancion) {
        if (cancion == null || canciones.size() >= MAX_CANCIONES || canciones.contains(cancion)) {
            return false;
        }
        canciones.add(cancion);
        return true;
    }

    public void mostrar() {
        System.out.println(nombre + ":");
        for (int i = 0; i < canciones.size(); i++) {
            Cancion c = canciones.get(i);
            System.out.println((i + 1) + ". " + c.getTitulo() + " - " + c.getArtista() + " (" + c.getDuracion() + " s)");
        }
    }

    public int duracionTotal() {
        int total = 0;
        for (Cancion c : canciones) {
            total += c.getDuracion();
        }
        return total;
    }

    public Cancion buscar(String titulo) {
        for (Cancion c : canciones) {
            if (c.getTitulo().equalsIgnoreCase(titulo)) {
                return c;
            }
        }
        return null;
    }

    public int eliminarArtista(String artista) {
        int eliminadas = 0;
     
        for (int i = canciones.size() - 1; i >= 0; i--) {
            if (canciones.get(i).getArtista().equalsIgnoreCase(artista)) {
                canciones.remove(i);
                eliminadas++;
            }
        }
        return eliminadas;
    }
}