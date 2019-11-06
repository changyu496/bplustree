package com.github.davidmoten.bplustree;

public interface Serializer<T> {

    T read(SimpleByteBuffer bb);

    void write(SimpleByteBuffer bb, T t);

    /**
     * Returns the maximum size in bytes of a serialized item. Returns 0 when there
     * is no maximum.
     * 
     * @return the maximum size in bytes of a serialized item. Returns 0 when there
     *         is no maximum.
     */
    int maxSize();
}
