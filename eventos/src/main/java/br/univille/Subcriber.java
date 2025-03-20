package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusReceiverClient;

public class Subcriber {
    public static void main(String[] args) {
        String topicName = "topic-das1";
        String subName = "subscription-walter";
        DefaultAzureCredential credential = new DefaultAzureCredentialBuilder()
            .build();

        ServiceBusReceiverClient receiverClient = new ServiceBusClientBuilder()
                .fullyQualifiedNamespace("sb-das12025-test-brazilsouth-001.servicebus.windows.net")
                .credential(credential)
                .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
                .receiver()
                .topicName(topicName)
                .subscriptionName(subName)
                .buildClient();

        // receive messages from the subscription
        receiverClient.receiveMessages(10).forEach(message -> {
            System.out.println("Received message: " + message.getBody().toString());
            receiverClient.complete(message);
        });
    }
}
