package typingsJapgolly.cypress.lodashMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a cache object to store key/value pairs.
  */
trait MapCache extends js.Object {
  /**
    * Removes all key-value entries from the map.
    */
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Removes `key` and its value from the cache.
    * @param key The key of the value to remove.
    * @return Returns `true` if the entry was removed successfully, else `false`.
    */
  def delete(key: js.Any): Boolean
  /**
    * Gets the cached value for `key`.
    * @param key The key of the value to get.
    * @return Returns the cached value.
    */
  def get(key: js.Any): js.Any
  /**
    * Checks if a cached value for `key` exists.
    * @param key The key of the entry to check.
    * @return Returns `true` if an entry for `key` exists, else `false`.
    */
  def has(key: js.Any): Boolean
  /**
    * Sets `value` to `key` of the cache.
    * @param key The key of the value to cache.
    * @param value The value to cache.
    * @return Returns the cache object.
    */
  def set(key: js.Any, value: js.Any): this.type
}

object MapCache {
  @scala.inline
  def apply(
    delete: js.Any => CallbackTo[Boolean],
    get: js.Any => CallbackTo[js.Any],
    has: js.Any => CallbackTo[Boolean],
    set: (js.Any, js.Any) => CallbackTo[MapCache],
    clear: js.UndefOr[Callback] = js.undefined
  ): MapCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: js.Any) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Any) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: js.Any) => has(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => set(t0, t1).runNow()))
    clear.foreach(p => __obj.updateDynamic("clear")(p.toJsFn))
    __obj.asInstanceOf[MapCache]
  }
}

