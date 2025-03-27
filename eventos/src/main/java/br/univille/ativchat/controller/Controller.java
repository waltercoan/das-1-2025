package br.univille.ativchat.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.google.inject.Guice;
import com.google.inject.Injector;

import br.univille.ativchat.model.Mensagem;
import br.univille.ativchat.service.BrokerMensagemService;
import br.univille.ativchat.util.AppModule;
import br.univille.ativchat.view.Form;

public class Controller implements ActionListener {
    Injector injector = Guice.createInjector(new AppModule());
    BrokerMensagemService service = injector.getInstance(BrokerMensagemService.class);
    private Form form;

    public Controller(Form form) {
        this.form = form;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        service.enviarMensagem(new Mensagem("EU", "Mensagem de teste"));
    }

}
