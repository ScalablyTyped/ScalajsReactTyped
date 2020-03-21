package typingsJapgolly.akamaiEdgeworkers.urlSearchParamsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLSearchParams extends js.Object {
  /**
    * Add a new name/value to the receiver.
    */
  def append(name: String, value: String): Unit
  /**
    * Remove the given name/value from the receiver.
    */
  def delete(name: String): Unit
  /**
    * Iterate through the name/value pairs.
    */
  def entries(): IterableIterator[js.Tuple2[String, String]]
  /**
    * Return the first value with the specified name.
    */
  def get(name: String): String | Null
  /**
    * Return *all* values association with the specified name.
    */
  def getAll(name: String): js.Array[String]
  /**
    * Check if the given name exists.
    */
  def has(name: String): Boolean
  /**
    * Iterate through the names.
    */
  def keys(): IterableIterator[String]
  /**
    * Replace all instances of `name` with a single name/value pair.
    */
  def set(name: String, value: String): Unit
  /**
    * Iterate through the values.
    */
  def values(): IterableIterator[String]
}

object URLSearchParams {
  @scala.inline
  def apply(
    append: (String, String) => Callback,
    delete: String => Callback,
    entries: CallbackTo[IterableIterator[js.Tuple2[String, String]]],
    get: String => CallbackTo[String | Null],
    getAll: String => CallbackTo[js.Array[String]],
    has: String => CallbackTo[Boolean],
    keys: CallbackTo[IterableIterator[String]],
    set: (String, String) => Callback,
    values: CallbackTo[IterableIterator[String]]
  ): URLSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => append(t0, t1).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("entries")(entries.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("getAll")(js.Any.fromFunction1((t0: java.lang.String) => getAll(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => set(t0, t1).runNow()))
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[URLSearchParams]
  }
}

