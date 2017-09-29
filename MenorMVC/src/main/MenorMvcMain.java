/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import view.MenorMvcView;
import model.MenorMvcModel;
import controller.MenorMvcController;

public class MenorMvcMain {

    public static void main(String[] args) {
        MenorMvcView menor_view = new MenorMvcView();
        MenorMvcModel menor_model = new MenorMvcModel();
        MenorMvcController menor_controller = new MenorMvcController(menor_view, menor_model);

    }
}
