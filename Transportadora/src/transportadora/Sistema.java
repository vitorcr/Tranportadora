/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

public class Sistema {

    Carga carga = new Carga();
    Garagem garagem = new Garagem();
    Empregados empregados = new Empregados();

    public boolean verificaVeiculoDisp(Veiculo veiculo) {

        return true;
    }

    public boolean verificaCNH(Motorista motorista, Veiculo veiculo) {

        if (motorista.getTipoCNH() == veiculo.getCNH()) {
            return true;
        } else {
            return false;
        }
    }

    public void cadastrarObjeto(Objeto obj) {

        carga.adicionarObj(obj);
    }

    public void cadastrarVeiculo(Veiculo veiculo) {

        garagem.adicionarVeiculo(veiculo);

    }

    public void cadastrarMotorista(Motorista motorista) {

        empregados.adicionarMotorista(motorista);
    }

    public void separarCarga(Veiculo veiculo) {

        veiculo.gerarCarga();

    }

    public void vincularMotoristaVeiculo(Motorista motorista, Veiculo veiculo) {

        if (verificaCNH(motorista, veiculo)) {
            motorista.setVeiculo(veiculo);
        } else {
            //informar que não é possível atribuir o motorista ao veiculos
            //pois a cnh não é permitida.
        }

    }

}
