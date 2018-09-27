/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

/**
 *
 * @author Vitor
 */
public class Van extends Veiculo {

    public Van(Veiculo veiculo) {

        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.ano = veiculo.getAno();
        this.placa = veiculo.getPlaca();
        this.tipo = "Van";
        this.capacidade = 1;
        this.cargaVeiculo = new Objeto[capacidade];
        this.roteiroEntrega = "";
        this.CNH = "B ou C"; //verificar como armazenas estas duas informações--
    }

    @Override
    public void gerarCarga() {

        Carga carga = new Carga();

        carga.gerarCargaVeiculo(this);
    }

    @Override
    public void gerarRoteiro() {

        Roteiro roteiro = new Roteiro();

        roteiro.gerarRoteiroEntrega(this);

    }

}
