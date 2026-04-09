package br.fiap.navio;

import br.fiap.carga.Carga;

public class Navio {
    private double capacidade;
    private int index;
    private Carga [] cargas;

    public Navio(){
        this.capacidade = 10000;
        this.index = 0;
        this.cargas = new Carga[20];
    }

    public boolean permitidoReservar(double peso){
        double total = 0;
        for (int i = 0; i < index; i++) {
            total += cargas[i].getPeso();
        }

        return (total + peso) <= capacidade;
    }

    public boolean reservar (Carga carga) {
        if (index < this.cargas.length) {
            if (permitidoReservar(carga.getPeso())){
                this.cargas[index]=carga;
                index++;
                return true;
            }
        }
        return false;
    }
}
