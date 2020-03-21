package typingsJapgolly.typescriptCollections.dictionaryMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictionary[K, V] extends js.Object {
  /**
    * Number of elements in the list.
    * @type {number}
    * @private
    */
  var nElements: Double
  /**
    * Object holding the key-value pairs.
    * @type {Object}
    * @private
    */
  var table: StringDictionary[IDictionaryPair[K, V]]
  /**
    * Removes all mappings from this dictionary.
    * @this {collections.Dictionary}
    */
  def clear(): Unit
  /**
    * Returns true if this dictionary contains a mapping for the specified key.
    * @param {Object} key key whose presence in this dictionary is to be
    * tested.
    * @return {boolean} true if this dictionary contains a mapping for the
    * specified key.
    */
  def containsKey(key: K): Boolean
  /**
    * Executes the provided function once for each key-value pair
    * present in this dictionary.
    * @param {function(Object,Object):*} callback function to execute, it is
    * invoked with two arguments: key and value. To break the iteration you can
    * optionally return false.
    */
  def forEach(callback: js.Function2[/* key */ K, /* value */ V, _]): Unit
  /**
    * Returns the value to which this dictionary maps the specified key.
    * Returns undefined if this dictionary contains no mapping for this key.
    * @param {Object} key key whose associated value is to be returned.
    * @return {*} the value to which this dictionary maps the specified key or
    * undefined if the map contains no mapping for this key.
    */
  def getValue(key: K): js.UndefOr[V]
  /**
    * Returns true if this dictionary contains no mappings.
    * @return {boolean} true if this dictionary contains no mappings.
    */
  def isEmpty(): Boolean
  /**
    * Returns an array containing all of the keys in this dictionary.
    * @return {Array} an array containing all of the keys in this dictionary.
    */
  def keys(): js.Array[K]
  /**
    * Removes the mapping for this key from this dictionary if it is present.
    * @param {Object} key key whose mapping is to be removed from the
    * dictionary.
    * @return {*} previous value associated with specified key, or undefined if
    * there was no mapping for key.
    */
  def remove(key: K): js.UndefOr[V]
  /**
    * Associates the specified value with the specified key in this dictionary.
    * If the dictionary previously contained a mapping for this key, the old
    * value is replaced by the specified value.
    * @param {Object} key key with which the specified value is to be
    * associated.
    * @param {Object} value value to be associated with the specified key.
    * @return {*} previous value associated with the specified key, or undefined if
    * there was no mapping for the key or if the key/value are undefined.
    */
  def setValue(key: K, value: V): js.UndefOr[V]
  /**
    * Returns the number of keys in this dictionary.
    * @return {number} the number of key-value mappings in this dictionary.
    */
  def size(): Double
  /**
    * Function used to convert keys to strings.
    * @type {function(Object):string}
    * @protected
    */
  /* protected */ def toStr(key: K): String
  /**
    * Returns an array containing all of the values in this dictionary.
    * @return {Array} an array containing all of the values in this dictionary.
    */
  def values(): js.Array[V]
}

object Dictionary {
  @scala.inline
  def apply[K, V](
    clear: Callback,
    containsKey: K => CallbackTo[Boolean],
    forEach: js.Function2[/* key */ K, /* value */ V, js.Any] => Callback,
    getValue: K => CallbackTo[js.UndefOr[V]],
    isEmpty: CallbackTo[Boolean],
    keys: CallbackTo[js.Array[K]],
    nElements: Double,
    remove: K => CallbackTo[js.UndefOr[V]],
    setValue: (K, V) => CallbackTo[js.UndefOr[V]],
    size: CallbackTo[Double],
    table: StringDictionary[IDictionaryPair[K, V]],
    toStr: K => CallbackTo[String],
    values: CallbackTo[js.Array[V]]
  ): Dictionary[K, V] = {
    val __obj = js.Dynamic.literal(nElements = nElements.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("containsKey")(js.Any.fromFunction1((t0: K) => containsKey(t0).runNow()))
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function2[/* key */ K, /* value */ V, js.Any]) => forEach(t0).runNow()))
    __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: K) => getValue(t0).runNow()))
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: K) => remove(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction2((t0: K, t1: V) => setValue(t0, t1).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.updateDynamic("toStr")(js.Any.fromFunction1((t0: K) => toStr(t0).runNow()))
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[Dictionary[K, V]]
  }
}

