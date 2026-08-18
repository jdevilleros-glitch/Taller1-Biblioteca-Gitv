/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
static ArrayList<Libro> libros = new ArrayList<>();
static ArrayList<Cliente> clientes = new ArrayList<>();
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
    crearLibro();
    listarLibros();
// Aquí irá el menú (Fase 8)
}
    static void crearCliente() {
        System.out.println("=== Crear Cliente ===");
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Telefono: ");
        String telefono = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        Cliente c = new Cliente(id, nombre, telefono, email);
        clientes.add(c);
        System.out.println("Cliente creado con exito.");
    }
    
    static void listarClientes() {
        System.out.println("=== Lista de Clientes ===");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
    
    static Cliente buscarCliente(String id) {
        for (Cliente c : clientes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }
    
    static void actualizarCliente() {
        System.out.print("ID del cliente a actualizar: ");
        String id = sc.nextLine();
        Cliente c = buscarCliente(id);

        if (c == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.print("Nuevo nombre (" + c.getNombre() + "): ");
        c.setNombre(sc.nextLine());
        System.out.print("Nuevo telefono (" + c.getTelefono() + "): ");
        c.setTelefono(sc.nextLine());
        System.out.print("Nuevo email (" + c.getEmail() + "): ");
        c.setEmail(sc.nextLine());

        System.out.println("Cliente actualizado con exito.");
    }
    
    static void eliminarCliente() {
        System.out.print("ID del cliente a eliminar: ");
        String id = sc.nextLine();
        Cliente c = buscarCliente(id);

        if (c == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        clientes.remove(c);
        System.out.println("Cliente eliminado con exito.");
    }
    
    static void crearLibro() {
        System.out.println("=== Crear Libro ===");
        System.out.print("Codigo: ");
        String codigo = sc.nextLine();
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Anio de publicacion: ");
        String anio = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();

        Libro l = new Libro(codigo, titulo, anio, autor);
        libros.add(l);
        System.out.println("Libro creado con exito.");
    }
    
    static void listarLibros() {
        System.out.println("=== Lista de Libros ===");
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

}
