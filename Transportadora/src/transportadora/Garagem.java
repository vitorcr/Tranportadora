/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

import java.util.ArrayList;
import java.util.List;

public class Garagem {

    public int numVan = 0, numCam = 0, numCar = 0;

    /*
    Cria um ArrayList que armazena todos os veículos cadastrados.
     */
    public List<Veiculo> garagem = new ArrayList<Veiculo>();

    public void adicionarVeiculo(Veiculo veiculo) {

        garagem.add(veiculo);

        if (veiculo.getTipo() == "Van") {
            numVan++;
        }

        if (veiculo.getTipo() == "Caminhao") {
            numCam++;
        }

        if (veiculo.getTipo() == "Carreta") {
            numCar++;
        }

    }

}
