package tech.easynlp.postman.base.codec;

public class CodecFactory
{
    public static StringCodec stringCodec()
    {
        return StringCodec.INSTANCE;
    }
}
