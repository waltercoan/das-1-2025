package br.univille.ativchat.service.impl;

import java.util.List;

import br.univille.ativchat.model.Mensagem;
import br.univille.ativchat.service.BrokerMensagemService;

public class BrokerMensagemServiceImpl implements BrokerMensagemService {
    String topicName = "topic-chat";
    String serviceBus = "sb-das12025-test-brazilsouth.servicebus.windows.net";
    String subscription = "subscription-" +  System.getenv("USERNAME");

    @Override
    public void enviarMensagem(Mensagem mensagem) {
        System.out.println(mensagem);
    }

    @Override
    public void buscarMensagens(List<Mensagem> mensagens) {
        mensagens.stream().forEach(m -> System.out.println(m));
    }
    
}
