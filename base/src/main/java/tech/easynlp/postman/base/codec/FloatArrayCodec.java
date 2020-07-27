package tech.easynlp.postman.base.codec;

import tech.easynlp.postman.base.ArrayUtils;

public class FloatArrayCodec implements Codec<float[]>
{
    @Override
    public byte[] encode(float[] content)
    {
        return ArrayUtils.getBytes(content);
    }

    @Override
    public float[] decode(byte[] bytes)
    {
        return ArrayUtils.recoverToFloats(bytes);
    }
}
