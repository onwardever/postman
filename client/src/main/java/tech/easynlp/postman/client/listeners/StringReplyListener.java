package tech.easynlp.postman.client.listeners;

import tech.easynlp.postman.base.replies.StringReply;
import tech.easynlp.postman.client.processors.ReplyProcessor;

public class StringReplyListener implements ReplyListener<StringReply>
{
    private ReplyProcessor processor;

    public StringReplyListener(ReplyProcessor processor)
    {
        this.processor = processor;
    }

    @Override
    public void onProcess(StringReply reply)
    {
        processor.process(reply);
    }
}
