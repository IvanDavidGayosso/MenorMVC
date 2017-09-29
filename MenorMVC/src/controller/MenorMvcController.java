/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Ivan David
 */
import view.MenorMvcView;
import model.MenorMvcModel;

public class MenorMvcController {

    MenorMvcView menor_view;
    MenorMvcModel menor_model;

    public MenorMvcController(MenorMvcView menor_view, MenorMvcModel menor_model) {
        this.menor_view = menor_view;
        this.menor_model = menor_model;
        initView();
    }

    public void initView() {

        menor_view.jbtn_menor.addAvtionListener(e -> jtbn_obtener_menor_click());
        menor_view.setVisible(true);
    }

    public void jtbn_obtener_menor_click() {
        menor_model.setN1(Integer.parseInt(menor_view.jtf_N1.getText()));
        menor_model.setN2(Integer.parseInt(menor_view.jtf_N2.getText()));
        menor_model.setN3(Integer.parseInt(menor_view.jtf_N3.getText()));
        menor_model.Menor();
        menor_view.jtf_MN.setText(String.valueOf(menor_model.getMN()));
    }
}
