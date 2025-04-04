package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusSenderClient;

public class Producer {
    public static void main(String[] args) {
        var queueName = "queue-das1";
        DefaultAzureCredential credential =
            new DefaultAzureCredentialBuilder()
            .build();

        ServiceBusSenderClient senderClient = 
            new ServiceBusClientBuilder()
            .fullyQualifiedNamespace("sb-das12025-test-brazilsouth.servicebus.windows.net")
            .credential(credential)
            .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
            .sender()
            .queueName(queueName)
            .buildClient();
        senderClient.sendMessage(new ServiceBusMessage("Ola do Walter"));
        System.out.println("Enviado");
    }
}
