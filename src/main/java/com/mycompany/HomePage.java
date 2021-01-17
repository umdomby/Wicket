package com.mycompany;

import org.apache.wicket.Component;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.MarkupStream;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {

	public HomePage() {
		add(new Link("linkId") {
			@Override
			public void onClick() {
				setResponsePage(FormPage.class);
			}

		});

		add(new Link("loginPage") {
			@Override
			public void onClick() {
				setResponsePage(LoginPage.class);
			}

		});

		Label label = new Label("thanks", "asdasdasdasdadsa");
		label.setVisible(false);
		add(label);

//		Field registration
		Form<?> form = new Form("form"){
			@Override
			protected void onSubmit(){
				label.setVisible(true);
				super.onSubmit();
			}

		};
		form.add(new Label("name", "mameTestRead: "));
		form.add(new Label("surname","surnameTestRead: "));
		form.add(new TextField("nameText", Model.of("")));
		form.add(new TextField("surnameText", Model.of("")));
		form.add(new Button("submit"));
		add(form);

//		Add variable and life cycle
		int messages = 0;
		WebMarkupContainer webMarkupContainer = new WebMarkupContainer("messages"){
			@Override
			protected void onConfigure() {
				super.onConfigure();
				setVisible(messages > 0);
				System.out.println("configure");
			}
			//Time life cycle component
			@Override
			protected void onInitialize(){
				super.onInitialize();
				System.out.println("init");
			}
			@Override
			protected void onBeforeRender(){
				System.out.println("Before");
				super.onBeforeRender();
			}
			@Override
			protected void onRender(){
				super.onRender();
				System.out.println("render");
			}
			@Override
			public void onComponentTagBody(MarkupStream markupStream, ComponentTag openTag){
				super.onComponentTagBody(markupStream,openTag);
				System.out.println("onComponentTagBody");
			}
			@Override
			protected void onComponentTag(ComponentTag tag){
				super.onComponentTag(tag);
				System.out.println("onComponentTag");
			}
		};
		webMarkupContainer.add(new Label("messageID", messages));
		add(webMarkupContainer);

//		Fragment
		OwnFragment ownFragment = new OwnFragment("content", "fragment", this);
		add(ownFragment);

//      enclosure
		Label label1 = new Label("test1", "test string 1");
		add(label1);
		Label label2 = new Label("test2", "test string 2");
		add(label2);
		label1.setVisible(true);


	}


}
