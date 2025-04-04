package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusProcessorClient;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;

public class Consumer {
    public static void main(String[] args) {
        String queueName = "queue-das1";
        String fqdns = "sb-das12025-test-brazilsouth.servicebus.windows.net";

        DefaultAzureCredential credential = 
            new DefaultAzureCredentialBuilder()
            .build();
        
        ServiceBusProcessorClient processorClient = new ServiceBusClientBuilder()
            .fullyQualifiedNamespace(fqdns)
            .credential(credential)
            .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
            .processor()
            .queueName(queueName)
            .receiveMode(ServiceBusReceiveMode.RECEIVE_AND_DELETE)
            .processMessage(context -> {
                System.out.println("Mensagem recebida: " + context.getMessage().getBody().toString());
                
                context.complete();
            })
            .processError(context -> {
                System.out.println("Erro: " + context.getException().getMessage());
            })
            .buildProcessorClient();

        processorClient.start();
        System.out.println("Aguardando mensagens...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            processorClient.close();
        }
    }
}
