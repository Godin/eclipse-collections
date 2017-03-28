class Fun {

  interface MutableObjectByteMap {
    <V> MutableCollection<V> collect(ByteToObjectFunction<? extends V> function);
  }

  interface MutableCollection<T> {
    ImmutableCollection<T> toImmutable();
  }

  interface ImmutableCollection<T> {
  }

  interface ByteToObjectFunction<T> {
  }

  MutableObjectByteMap delegate;

  // eclipse-collections/eclipse-collections/target/generated-sources/java/
  // org/eclipse/collections/impl/map/immutable/primitive/ImmutableObjectByteHashMap.java
  // 120
  <V> ImmutableCollection<V> example(ByteToObjectFunction<? extends V> function) {
    return delegate.collect(function).toImmutable();
  }

}
