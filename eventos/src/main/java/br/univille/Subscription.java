package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.servicebus.administration.ServiceBusAdministrationClient;
import com.azure.messaging.servicebus.administration.ServiceBusAdministrationClientBuilder;

public class Subscription {
    public static void main(String[] args) {
        String topicName = "topic-chat";
        String subName = "subscription-walter";
        var fullyQualifiedNamespace= "sb-das12025-test-brazilsouth.servicebus.windows.net";

        DefaultAzureCredential credential = new DefaultAzureCredentialBuilder()
             .build();
        HttpLogOptions logOptions = new HttpLogOptions()
            .setLogLevel(HttpLogDetailLevel.HEADERS);

        ServiceBusAdministrationClient adminClient = new ServiceBusAdministrationClientBuilder()
             .credential(fullyQualifiedNamespace, credential)
             .httpLogOptions(logOptions)
             .buildClient();
         adminClient.createSubscription(topicName, subName);
    }
}
