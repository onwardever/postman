package tech.easynlp.postman.client.processors;

import org.apache.log4j.Logger;
import tech.easynlp.postman.base.replies.StringReply;

public class SimpleLoggerProcessor implements ReplyProcessor<StringReply>
{
    private static final Logger LOGGER = Logger.getLogger(SimpleLoggerProcessor.class);

    @Override
    public void process(StringReply reply)
    {
        LOGGER.info("reply: " + reply.content());
    }
}
