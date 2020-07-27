package tech.easynlp.postman.client.listeners;

import tech.easynlp.postman.base.Listener;
import tech.easynlp.postman.base.replies.Reply;

public interface ReplyListener<R extends Reply> extends Listener
{
    void onProcess(R reply);
}
