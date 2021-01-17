package com.mycompany;


import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;

public class FromPanel extends Panel {
    public FromPanel(String id) {
        super(id);
        Label label = new Label("label", "Кнопка");
        //Label label2 = new Label("label2", "Кнопка2");

        //Button button = new Button("submitButton");
        //add(button);

        add(label);
        //add(label2);
        add(new Button("submitButton"));
        add(new Button("resetButton"));
        add(new TextField<String >("textfieldId"));



    }
}
