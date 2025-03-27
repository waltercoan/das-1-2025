package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusProcessorClient;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;

public class Subcriber {
    public static void main(String[] args) {
        String topicName = "topic-das1";
        String subName = "subscription-walter";

        // Configura as credenciais
        DefaultAzureCredential credential = new DefaultAzureCredentialBuilder()
            .build();

        // Cria o cliente do processador para receber mensagens de forma assíncrona
        ServiceBusProcessorClient processorClient = new ServiceBusClientBuilder()
                .fullyQualifiedNamespace("sb-das12025-test-brazilsouth.servicebus.windows.net")
                .credential(credential)
                .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
                .processor()
                .topicName(topicName)
                .subscriptionName(subName)
                .receiveMode(ServiceBusReceiveMode.PEEK_LOCK)
                .processMessage(context -> {
                    // Processa a mensagem recebida
                    System.out.println("Mensagem recebida: " + context.getMessage().getBody().toString());
                    context.complete();
                })
                .processError(context -> {
                    // Trata erros
                    System.err.println("Erro ao processar mensagem: " + context.getException().getMessage());
                })
                .buildProcessorClient();

        // Inicia o processamento
        processorClient.start();

        System.out.println("Aguardando mensagens... Pressione ENTER para encerrar.");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Para o processamento ao encerrar
            processorClient.close();
        }
    }
}
