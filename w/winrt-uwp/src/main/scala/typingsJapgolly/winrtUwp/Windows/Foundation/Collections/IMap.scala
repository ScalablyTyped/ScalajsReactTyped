package typingsJapgolly.winrtUwp.Windows.Foundation.Collections

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an associative collection, also known as a map or a dictionary. */
trait IMap[K, V]
  extends IIterable[IKeyValuePair[js.Any, js.Any]] {
  /** Gets the number of items in the map. */
  var size: Double
  /** Removes all items from the map. */
  def clear(): Unit
  /**
    * Returns an immutable view of the map.
    * @return The view of the map.
    */
  def getView(): IMapView[K, V]
  /**
    * Determines whether the map contains the specified key.
    * @param key The key associated with the item to locate.
    * @return True if the key is found; otherwise, false.
    */
  def hasKey(key: K): Boolean
  /**
    * Inserts or replaces an item in the map.
    * @param key The key associated with the item to insert.
    * @param value The item to insert.
    * @return True if an item with the specified key is an existing item that was replaced; otherwise, false.
    */
  def insert(key: K, value: V): Boolean
  /**
    * Returns the item at the specified key in the map.
    * @param key The key associated with the item to locate.
    * @return The item associated with the specified key.
    */
  def lookup(key: K): V
  /**
    * Removes an item from the map.
    * @param key The key associated with the item to remove.
    */
  def remove(key: K): Unit
}

object IMap {
  @scala.inline
  def apply[K, V](
    clear: Callback,
    first: CallbackTo[IIterator[IKeyValuePair[js.Any, js.Any]]],
    getView: CallbackTo[IMapView[K, V]],
    hasKey: K => CallbackTo[Boolean],
    insert: (K, V) => CallbackTo[Boolean],
    lookup: K => CallbackTo[V],
    remove: K => Callback,
    size: Double
  ): IMap[K, V] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("first")(first.toJsFn)
    __obj.updateDynamic("getView")(getView.toJsFn)
    __obj.updateDynamic("hasKey")(js.Any.fromFunction1((t0: K) => hasKey(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction2((t0: K, t1: V) => insert(t0, t1).runNow()))
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: K) => lookup(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: K) => remove(t0).runNow()))
    __obj.asInstanceOf[IMap[K, V]]
  }
}

