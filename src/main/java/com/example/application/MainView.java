package com.example.application;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Proyecto Integrador")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        H1 text1 = new H1("Hola");
        H1 text2 = new H1("Grupo");
        Button button1 = new Button();
        button1.setText("Ok");
        TextField entradaDatos1 = new TextField();

        button1.addClickListener(clickEvent -> {
            text1.setText(text1.getText().toUpperCase());
            text2.setText(entradaDatos1.getValue());
        });

        add(text1);
        add(text2);
        add(entradaDatos1);
        add(button1);
    }
}
