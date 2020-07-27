package tech.easynlp.postman.client;

import tech.easynlp.postman.client.listeners.StringReplyListener;
import tech.easynlp.postman.client.processors.SimpleLoggerProcessor;

public class Test
{
    public static void main(String[] args)
    {
        PostmanClient client = new PostmanClient();

        client.post(null, new StringReplyListener(new SimpleLoggerProcessor()));
    }
}
