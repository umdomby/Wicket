package com.mycompany;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.model.Model;

import java.awt.*;

public class LoginPage extends WebPage {

    public LoginPage(){

        Form<?> form = new Form("form"){
            @Override
            protected void onSubmit(){
                super.onSubmit();
            }

        };
        form.add(new org.apache.wicket.markup.html.basic.Label("name", "mameTestRead: "));
        form.add(new Label("surname","surnameTestRead: "));
        form.add(new org.apache.wicket.markup.html.form.TextField("nameText", Model.of("")));
        form.add(new org.apache.wicket.markup.html.form.TextField("surnameText", Model.of("")));
        form.add(new Button("submit"));
        add(form);
    }
}
