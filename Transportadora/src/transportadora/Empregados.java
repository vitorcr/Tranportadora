/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportadora;

import java.util.ArrayList;
import java.util.List;

public class Empregados {

    public List<Motorista> empregados = new ArrayList<Motorista>();

    public void adicionarMotorista(Motorista motorista) {

        empregados.add(motorista);
    }
}
