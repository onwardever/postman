package tech.easynlp.postman.base.zookeeper;

import tech.easynlp.postman.base.exception.UnsupportedException;

import java.util.Arrays;
import java.util.Iterator;

public class Path
{
    private final String splitter;
    private Node root = new Node();

    public Path(String splitter)
    {
        this.splitter = splitter;
    }


    public void addPath(String completePath) throws UnsupportedException
    {
        String[] nodes = split(completePath);
        Node temp = this.root;

        for (int i = 0; i < nodes.length; i++)
        {
            Node found = temp.findChild(nodes[i]);

            if (found == null)
            {

            }
            else
            {
                temp = found;
            }
        }
    }


    private String[] split(String completePath) throws UnsupportedException
    {
        String[] values = completePath.split(splitter);

        for (int i = 1; i < values.length; i++)
        {
            if (values[i].isEmpty())
            {
                throw new UnsupportedException();
            }
        }

        return Arrays.copyOfRange(values, 1, values.length);
    }

    public class Node implements Iterable<Node>
    {
        String value;
        Node nextSibling;
        Node firstChild;

        public Node addChildAndReturnThis(Node child)
        {
            if (this.firstChild == null)
            {
                this.firstChild = child;
            }
            else
            {
                Iterator<Node> iterator = iterator();

                Node lastChild = null;

                while (iterator.hasNext())
                {
                    lastChild = iterator.next();
                }

                lastChild.nextSibling = child;
            }

            return this;
        }

        public void addChild(Node node)
        {
            if (firstChild == null)
            {
                firstChild = node;
            }

            Node last = firstChild;

            Iterator<Node> iterator = iterator();

            while (iterator.hasNext())
            {
                last = iterator.next();
            }

            last.nextSibling = node;
        }

        public Node findChild(String valueToFind)
        {
            Iterator<Node> iterator = iterator();

            while (iterator.hasNext())
            {
                Node temp = iterator.next();

                if (temp.value.equals(valueToFind))
                {
                    return temp;
                }
            }

            return null;
        }

        @Override
        public Iterator<Node> iterator()
        {
            return new ChildIterator();
        }


        /**
         * iterator for Node's children
         */
        public class ChildIterator implements Iterator<Node>
        {
            private Node pointer = Node.this.firstChild;

            @Override
            public boolean hasNext()
            {
                return pointer != null;
            }

            @Override
            public Node next()
            {
                Node temp = pointer;
                pointer = pointer.nextSibling;
                return temp;
            }
        }
    }


    public static void main(String[] args)
    {

    }
}
