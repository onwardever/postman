package tech.easynlp.postman.base.replies;

import tech.easynlp.postman.base.codec.Codec;
import tech.easynlp.postman.base.codec.CodecFactory;

public class StringReply implements Reply<String>
{
    private Codec<String> codec = CodecFactory.stringCodec();

    private final byte[] bytes;

    public StringReply(byte[] bytes)
    {
        this.bytes = bytes;
    }

    @Override
    public String content()
    {
        return codec.decode(bytes);
    }
}
