package br.fiap.util;
import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;
import br.fiap.navio.Navio;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;


public class Util {
    private Navio navio = new Navio();
    public void menu(){
        int opc=0;

        do {
            String aux = "Reserva de Cargas de Boa Viagem\n";
            aux+="[1] Reservar\n";
            aux+="[2] Pesquisar\n";
            aux+="[3] Exibir\n";
            aux+="[4] Capacidade reservada\n";
            aux+="[5] Cancelar a Reserva\n";
            aux+="[6] Finalizar\n";
            opc=parseInt(showInputDialog(aux));
            if (opc<1 || opc>6){
                showMessageDialog(null,"Opção inválida");
            }
            else {
                switch (opc){
                    case 1 -> reservar();
//                    case 2 -> pesquisar();
                    case 3 -> exibir();
//                    case 4 -> capacidade();
//                    case 5 -> cancelar();
                    case 6 -> showMessageDialog(null,"Até breve");
                }
            }
        }while (opc!=6);

    }

    private void exibir() {
        showMessageDialog(null,navio.getDados());
    }

    private void reservar() {
        int cnpj;
        String destino, nomeCliente;
        cnpj = parseInt(showInputDialog("CNPJ"));
        destino = showInputDialog("Destino");
        nomeCliente = showInputDialog("Cliente");
        Cliente cliente = new Cliente(cnpj,nomeCliente);
        Carga carga = new Carga(destino,cliente);
        if (navio.reservar(carga)){
            showMessageDialog(null,"Carga reservada com sucesso");
        }
        else {
            showMessageDialog(null,"Problemas ao reservar");
        }
    }

}
