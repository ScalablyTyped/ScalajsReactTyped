package typingsJapgolly.d3DashCollection.d3DashCollectionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.d3DashCollection.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map[T] extends js.Object {
  /**
    * Removes all entries from this map.
    */
  def clear(): Unit
  /**
    * Calls the specified function for each entry in this map and returns undefined.
    * The iteration order is arbitrary.
    *
    * @param func Function to call for each entry. The function is passed the entry’s value and key as arguments,
    * followed by the map itself.
    */
  def each(func: js.Function3[/* value */ T, /* key */ String, /* map */ Map[T], Unit]): Unit
  /**
    * Returns true if and only if this map has zero entries.
    */
  def empty(): Boolean
  /**
    * Returns an array of key-value objects for each entry in this map. The order of the returned entries is arbitrary.
    * Each entry’s key is a string, but the value can have arbitrary type.
    */
  def entries(): js.Array[Anon_Key[T]]
  /**
    * Returns the value for the specified key string.
    * If the map does not have an entry for the specified key, returns undefined.
    *
    * @param key Key of map entry to access.
    */
  def get(key: String): js.UndefOr[T]
  /**
    * Returns true if and only if this map has an entry for the specified key string.
    * Note: the value may be null or undefined.
    *
    * @param key Key of map entry to access.
    */
  def has(key: String): Boolean
  /**
    * Returns an array of string keys for every entry in this map.
    * The order of the returned keys is arbitrary.
    */
  def keys(): js.Array[String]
  /**
    * If the map has an entry for the specified key string, removes the entry and returns true.
    * Otherwise, this method does nothing and returns false.
    *
    * @param key Map key for which to remove the entry.
    */
  def remove(key: String): Boolean
  /**
    * Sets the value for the specified key string and returns the updated map.
    * If the map previously had an entry for the same key string, the old entry is replaced with the new value.
    *
    * @param key Key of map entry to access.
    * @param value Value to set for entry at key.
    */
  def set(key: String, value: T): this.type
  /**
    * Returns the number of entries in this map.
    */
  def size(): Double
  /**
    * Returns an array of values for every entry in this map.
    * The order of the returned values is arbitrary.
    */
  def values(): js.Array[T]
}

object Map {
  @scala.inline
  def apply[T](
    clear: Callback,
    each: js.Function3[/* value */ T, /* key */ String, /* map */ Map[T], Unit] => Callback,
    empty: CallbackTo[Boolean],
    entries: CallbackTo[js.Array[Anon_Key[T]]],
    get: String => CallbackTo[js.UndefOr[T]],
    has: String => CallbackTo[Boolean],
    keys: CallbackTo[js.Array[String]],
    remove: String => CallbackTo[Boolean],
    set: (String, T) => CallbackTo[Map[T]],
    size: CallbackTo[Double],
    values: CallbackTo[js.Array[T]]
  ): Map[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: js.Function3[
  /* value */ T, 
  /* key */ java.lang.String, 
  /* map */ typingsJapgolly.d3DashCollection.d3DashCollectionMod.Map[T], 
  scala.Unit]) => each(t0).runNow()))
    __obj.updateDynamic("empty")(empty.toJsFn)
    __obj.updateDynamic("entries")(entries.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => set(t0, t1).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[Map[T]]
  }
}

@JSImport("d3-collection", "map")
@js.native
object map extends js.Object {
  def apply(obj: js.Object): Map[_] = js.native
  def apply[T](): Map[T] = js.native
  def apply[T](array: js.Array[T]): Map[T] = js.native
  def apply[T](
    array: js.Array[T],
    key: js.Function3[/* value */ T, /* i */ js.UndefOr[Double], /* array */ js.UndefOr[js.Array[T]], String]
  ): Map[T] = js.native
  def apply[T](d3Map: Map[T]): Map[T] = js.native
  def apply[T](obj: NumberDictionary[T]): Map[T] = js.native
  def apply[T](obj: StringDictionary[T]): Map[T] = js.native
}

