package tech.easynlp.postman.base.emails;

import tech.easynlp.postman.base.ContentHolder;

public interface Email<T> extends ContentHolder<T>
{
    void content(T content);
}
