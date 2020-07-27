package tech.easynlp.postman.base.codec;

public interface Codec<T>
{
    byte[] encode(T content);

    T decode(byte[] bytes);
}
