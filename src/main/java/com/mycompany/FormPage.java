package com.mycompany;

import org.apache.wicket.markup.html.WebPage;

public class FormPage extends WebPage {

    public FormPage(){
        add(new FromPanel("fromPanel"));
    }

}
