package br.fiap;

import br.fiap.cliente.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1,"Gomes");
        System.out.println(cliente.getCliente());
        cliente.setCliente("Gomudo");
    }
}
