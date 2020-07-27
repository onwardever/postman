package tech.easynlp.postman.client.processors;

import tech.easynlp.postman.base.replies.Reply;

public interface ReplyProcessor<R extends Reply>
{
    void process(R reply);
}
