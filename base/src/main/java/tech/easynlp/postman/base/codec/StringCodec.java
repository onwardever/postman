package tech.easynlp.postman.base.codec;

public class StringCodec implements Codec<String>
{
    public static final StringCodec INSTANCE = new StringCodec();

    private StringCodec()
    {
    }

    @Override
    public byte[] encode(String content)
    {
        return content.getBytes();
    }

    @Override
    public String decode(byte[] bytes)
    {
        return new String(bytes);
    }
}
