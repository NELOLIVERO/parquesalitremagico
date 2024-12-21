package Vista;

import com.salitreparquemagicoapp.controlador.ControladorParque;
import com.salitreparquemagicoapp.modelo.Cliente;

import java.util.Scanner;

public class VistaConsola {
    private ControladorParque controlador;
    private Scanner scanner;

    public VistaConsola(ControladorParque controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Actualizar Cliente");
            System.out.println("4. Eliminar Cliente");
            System.out.println("5. Ingresar Cliente al Parque");
            System.out.println("6. Salir Cliente del Parque");
            System.out.println("7. Ver Cantidad de Personas en el Parque");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    actualizarCliente();
                    break;
                case 4:
                    eliminarCliente();
                    break;
                case 5:
                    ingresarClienteAlParque();
                    break;
                case 6:
                    salirClienteDelParque();
                    break;
                case 7:
                    verCantidadPersonasEnParque();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private void registrarCliente() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Correo: ");
        String correo = scanner.nextLine();
        System.out.print("Estatura: ");
        double estatura = scanner.nextDouble();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        String contactoFamiliar = null;
        if (edad < 18) {
            System.out.print("Contacto Familiar (si es menor): ");
            contactoFamiliar = scanner.nextLine();
        }

        Cliente cliente = new Cliente(nombre, cedula, telefono, correo, estatura, edad, contactoFamiliar);
        controlador.agregarCliente(cliente);
        System.out.println("Cliente registrado exitosamente.");
    }

    private void listarClientes() {
        System.out.println("Lista de Clientes:");
        for (Cliente cliente : controlador.listarClientes()) {
            System.out.println("Nombre: " + cliente.getNombre() + ", Cédula: " + cliente.getCedula());
        }
    }

    private void actualizarCliente() {
        System.out.print("Ingrese la cédula del cliente a actualizar: ");
        String cedula = scanner.nextLine();
        System.out.print("Nuevo Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Nuevo Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Nuevo Correo: ");
        String correo = scanner.nextLine();
        System.out.print("Nueva Estatura: ");
        double estatura = scanner.nextDouble();
        System.out.print("Nueva Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        String contactoFamiliar = null;
        if (edad < 18) {
            System.out.print("Nuevo Contacto Familiar: ");
            contactoFamiliar = scanner.nextLine();
        }

        Cliente cliente = new Cliente(nombre, cedula, telefono, correo, estatura, edad, contactoFamiliar);
        controlador.actualizarCliente(cliente, cedula);
        System.out.println("Cliente actualizado exitosamente.");
    }

    private void eliminarCliente() {
        System.out.print("Ingrese la cédula del cliente a eliminar: ");
        String cedula = scanner.nextLine();
        controlador.eliminarCliente(cedula);
        System.out.println("Cliente eliminado exitosamente.");
    }

    private void ingresarClienteAlParque() {
        System.out.print("Ingrese la cédula del cliente que ingresa al parque: ");
        String cedula = scanner.nextLine();
        Cliente cliente = controlador.listarClientes().stream()
                .filter(c -> c.getCedula().equals(cedula))
                .findFirst()
                .orElse(null);
        if (cliente != null) {
            controlador.ingresarCliente(cliente);
            System.out.println("Cliente ingresado al parque.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private void salirClienteDelParque() {
        System.out.print("Ingrese la cédula del cliente que sale del parque: ");
        String cedula = scanner.nextLine();
        Cliente cliente = controlador.listarClientes().stream()
                .filter(c -> c.getCedula().equals(cedula))
                .findFirst()
                .orElse(null);
        if (cliente != null) {
            controlador.salirCliente();
            System.out.println("Cliente salido del parque.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private void verCantidadPersonasEnParque() {
        int cantidad = controlador.getCantidadPersonasEnParque();
        System.out.println("Cantidad de personas en el parque: " + cantidad);
    }
}