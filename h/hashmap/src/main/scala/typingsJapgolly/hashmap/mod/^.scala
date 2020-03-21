package typingsJapgolly.hashmap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hashmap", JSImport.Namespace)
@js.native
/**
  * Creates an empty hashmap.
  */
class ^[TKey, TValue] () extends HashMap[TKey, TValue] {
  def this(data: js.Array[js.Tuple2[TKey, TValue]]) = this()
  /**
    * Creates a hashmap with the key-value pairs of map or from an array of key-values.
    *
    * @param data A hashmap to copy from or a set or key-value pairs for the initialization.
    */
  def this(data: HashMap[TKey, TValue]) = this()
  /**
    * Creates a hashmap with several key-value pairs.
    *
    * @param keysAndValues key1, value1, key2, value2...
    */
  def this(keysAndValues: (TKey | TValue)*) = this()
  /**
    * Clears hashmap.
    *
    * @return Self.
    */
  /* CompleteClass */
  override def clear(): HashMap[TKey, TValue] = js.native
  /**
    * Copy all key-value pairs from other to this instance.
    *
    * @param map Other map.
    * @return Self.
    */
  /* CompleteClass */
  override def copy(map: HashMap[TKey, TValue]): HashMap[TKey, TValue] = js.native
  /**
    * Returns size of hashmap (number of entries).
    *
    * @return Number of entries in hashmap.
    */
  /* CompleteClass */
  override def count(): Double = js.native
  /**
    * Removes given key from hashmap.
    *
    * @param key Key.
    * @return Self.
    */
  /* CompleteClass */
  override def delete(key: TKey): HashMap[TKey, TValue] = js.native
  /**
    * Returns all key-value pairs.
    *
    * @return List of key-value pairs.
    * @since 2.3.0
    */
  /* CompleteClass */
  override def entries(): js.Array[js.Tuple2[TKey, TValue]] = js.native
  /**
    * Iterates over hashmap.
    *
    * @param callback Function to be invoked for every hashmap entry.
    * @return Self.
    */
  /* CompleteClass */
  override def forEach(callback: js.Function2[TValue, TKey, Unit]): HashMap[TKey, TValue] = js.native
  /**
    * Return value from hashmap.
    *
    * @param key Key.
    * @return Value stored under given key.
    */
  /* CompleteClass */
  override def get(key: TKey): TValue = js.native
  /**
    * Checks if given key exists in hashmap.
    *
    * @param key Key.
    * @return Whether given key exists in hashmap.
    */
  /* CompleteClass */
  override def has(key: TKey): Boolean = js.native
  /**
    * Returns all contained keys.
    *
    * @return List of keys.
    */
  /* CompleteClass */
  override def keys(): js.Array[TKey] = js.native
  /**
    * Store several key-value pairs.
    *
    * @param keysAndValues key1, value1, key2, value2...
    * @return Self.
    */
  /* CompleteClass */
  override def multi(keysAndValues: (TKey | TValue)*): HashMap[TKey, TValue] = js.native
  /**
    * Removes given key from hashmap.
    *
    * @param key Key.
    * @return Self.
    * @deprecated Since 2.3.0
    */
  /* CompleteClass */
  override def remove(key: TKey): HashMap[TKey, TValue] = js.native
  /**
    * Returns key under which given value is stored.
    *
    * @param value Value.
    * @return Key which is assigned to value stored.
    */
  /* CompleteClass */
  override def search(value: TValue): TKey = js.native
  /**
    * Store value in hashmap.
    *
    * @param key Key.
    * @param value Value.
    * @return Self.
    */
  /* CompleteClass */
  override def set(key: TKey, value: TValue): HashMap[TKey, TValue] = js.native
  /**
    * Returns all container values.
    *
    * @return List of values.
    */
  /* CompleteClass */
  override def values(): js.Array[TValue] = js.native
}

