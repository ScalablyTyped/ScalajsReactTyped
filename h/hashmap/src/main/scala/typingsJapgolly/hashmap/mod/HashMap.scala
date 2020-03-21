package typingsJapgolly.hashmap.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashMap[TKey, TValue] extends js.Object {
  /**
    * Clears hashmap.
    *
    * @return Self.
    */
  def clear(): HashMap[TKey, TValue]
  /**
    * Copy all key-value pairs from other to this instance.
    *
    * @param map Other map.
    * @return Self.
    */
  def copy(map: HashMap[TKey, TValue]): HashMap[TKey, TValue]
  /**
    * Returns size of hashmap (number of entries).
    *
    * @return Number of entries in hashmap.
    */
  def count(): Double
  /**
    * Removes given key from hashmap.
    *
    * @param key Key.
    * @return Self.
    */
  def delete(key: TKey): HashMap[TKey, TValue]
  /**
    * Returns all key-value pairs.
    *
    * @return List of key-value pairs.
    * @since 2.3.0
    */
  def entries(): js.Array[js.Tuple2[TKey, TValue]]
  /**
    * Iterates over hashmap.
    *
    * @param callback Function to be invoked for every hashmap entry.
    * @return Self.
    */
  def forEach(callback: js.Function2[/* value */ TValue, /* key */ TKey, Unit]): HashMap[TKey, TValue]
  /**
    * Return value from hashmap.
    *
    * @param key Key.
    * @return Value stored under given key.
    */
  def get(key: TKey): TValue
  /**
    * Checks if given key exists in hashmap.
    *
    * @param key Key.
    * @return Whether given key exists in hashmap.
    */
  def has(key: TKey): Boolean
  /**
    * Returns all contained keys.
    *
    * @return List of keys.
    */
  def keys(): js.Array[TKey]
  /**
    * Store several key-value pairs.
    *
    * @param keysAndValues key1, value1, key2, value2...
    * @return Self.
    */
  def multi(keysAndValues: (TKey | TValue)*): HashMap[TKey, TValue]
  /**
    * Removes given key from hashmap.
    *
    * @param key Key.
    * @return Self.
    * @deprecated Since 2.3.0
    */
  def remove(key: TKey): HashMap[TKey, TValue]
  /**
    * Returns key under which given value is stored.
    *
    * @param value Value.
    * @return Key which is assigned to value stored.
    */
  def search(value: TValue): TKey
  /**
    * Store value in hashmap.
    *
    * @param key Key.
    * @param value Value.
    * @return Self.
    */
  def set(key: TKey, value: TValue): HashMap[TKey, TValue]
  /**
    * Returns all container values.
    *
    * @return List of values.
    */
  def values(): js.Array[TValue]
}

object HashMap {
  @scala.inline
  def apply[TKey, TValue](
    clear: CallbackTo[HashMap[TKey, TValue]],
    copy: HashMap[TKey, TValue] => CallbackTo[HashMap[TKey, TValue]],
    count: CallbackTo[Double],
    delete: TKey => CallbackTo[HashMap[TKey, TValue]],
    entries: CallbackTo[js.Array[js.Tuple2[TKey, TValue]]],
    forEach: js.Function2[/* value */ TValue, /* key */ TKey, Unit] => CallbackTo[HashMap[TKey, TValue]],
    get: TKey => CallbackTo[TValue],
    has: TKey => CallbackTo[Boolean],
    keys: CallbackTo[js.Array[TKey]],
    multi: /* repeated */ TKey | TValue => CallbackTo[HashMap[TKey, TValue]],
    remove: TKey => CallbackTo[HashMap[TKey, TValue]],
    search: TValue => CallbackTo[TKey],
    set: (TKey, TValue) => CallbackTo[HashMap[TKey, TValue]],
    values: CallbackTo[js.Array[TValue]]
  ): HashMap[TKey, TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("copy")(js.Any.fromFunction1((t0: typingsJapgolly.hashmap.mod.HashMap[TKey, TValue]) => copy(t0).runNow()))
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: TKey) => delete(t0).runNow()))
    __obj.updateDynamic("entries")(entries.toJsFn)
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function2[/* value */ TValue, /* key */ TKey, scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: TKey) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: TKey) => has(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("multi")(js.Any.fromFunction1((t0: /* repeated */ TKey | TValue) => multi(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: TKey) => remove(t0).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: TValue) => search(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: TKey, t1: TValue) => set(t0, t1).runNow()))
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[HashMap[TKey, TValue]]
  }
}

