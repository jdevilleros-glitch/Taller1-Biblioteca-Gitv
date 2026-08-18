/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author USUARIO
 */
import java.time.LocalDate;

public class Prestamo {
    private String idPrestamo;
    private Cliente cliente;
    private Libro libro;
    private LocalDate fecha;
    private String estado; // "ACTIVO" o "DEVUELTO"

    public Prestamo(String idPrestamo, Cliente cliente, Libro libro) {
        this.idPrestamo = idPrestamo;
        this.cliente = cliente;
        this.libro = libro;
        this.fecha = LocalDate.now();
        this.estado = "ACTIVO";
    }

    public String getIdPrestamo() {
        return idPrestamo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Libro getLibro() {
        return libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Prestamo #" + idPrestamo
                + " | Cliente: " + cliente.getNombre()
                + " | Libro: " + libro.getTitulo()
                + " | Fecha: " + fecha
                + " | Estado: " + estado;
    }
}
