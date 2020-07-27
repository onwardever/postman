package tech.easynlp.postman.base.emails;

import tech.easynlp.postman.base.codec.Codec;
import tech.easynlp.postman.base.codec.CodecFactory;

public class StringEmail implements Email<String>
{
    private Codec<String> codec = CodecFactory.stringCodec();
    private byte[] bytes;

    @Override
    public void content(String content)
    {
        this.bytes = codec.encode(content);
    }

    @Override
    public String content()
    {
        return codec.decode(bytes);
    }
}
