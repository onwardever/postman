package tech.easynlp.postman.base.zookeeper;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        String[] strings = new String[]{"a", "b", "c"};

        System.out.println(Arrays.toString(Arrays.copyOfRange(strings, 1, strings.length)));

    }
}
