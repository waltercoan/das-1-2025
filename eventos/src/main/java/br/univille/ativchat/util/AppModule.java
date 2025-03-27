package br.univille.ativchat.util;

import com.google.inject.AbstractModule;

import br.univille.ativchat.service.BrokerMensagemService;
import br.univille.ativchat.service.impl.BrokerMensagemServiceImpl;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(BrokerMensagemService.class).to(BrokerMensagemServiceImpl.class); // Vincula a interface à implementação
    }
}