package tech.easynlp.postman.client;

import org.apache.log4j.Logger;
import tech.easynlp.postman.base.emails.Email;
import tech.easynlp.postman.base.replies.StringReply;
import tech.easynlp.postman.client.listeners.ReplyListener;

import java.io.IOException;

public class PostmanClient implements Client
{
    private static final Logger LOGGER = Logger.getLogger(PostmanClient.class);

    @Override
    public void start()
    {

    }

    public void post(Email email, ReplyListener listener)
    {
        StringReply reply = new StringReply("abc".getBytes());

        listener.onProcess(reply);
    }

    @Override
    public void close() throws IOException
    {

    }
}
