package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusSenderClient;

public class Publisher {
    public static void main(String[] args) {
        String topicName = "topic-das1";
        DefaultAzureCredential credential = new DefaultAzureCredentialBuilder()
            .build();

        ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
            .fullyQualifiedNamespace("sb-das12025-test-brazilsouth.servicebus.windows.net")
            .credential(credential)
            .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
            .sender()
            .topicName(topicName)
            .buildClient();

        // send one message to the topic
        senderClient.sendMessage(new ServiceBusMessage("Hello, World! do Walter"));
        System.out.println("Sent a single message to the topic: " + topicName);

    }
}