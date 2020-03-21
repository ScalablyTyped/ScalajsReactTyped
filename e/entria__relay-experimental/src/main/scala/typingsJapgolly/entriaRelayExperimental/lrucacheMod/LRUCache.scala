package typingsJapgolly.entriaRelayExperimental.lrucacheMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JS maps (both plain objects and Map) maintain key insertion
  * order, which means there is an easy way to simulate LRU behavior
  * that should also perform quite well:
  *
  * To insert a new value, first delete the key from the inner _map,
  * then _map.set(k, v). By deleting and reinserting, you ensure that the
  * map sees the key as the last inserted key.
  *
  * Get does the same: if the key is present, delete and reinsert it.
  */
trait LRUCache[T] extends Cache[T] {
  var _capacity: Double
  var _map: Map[String, T]
}

object LRUCache {
  @scala.inline
  def apply[T](
    _capacity: Double,
    _map: Map[String, T],
    capacity: CallbackTo[Double],
    clear: Callback,
    delete: String => Callback,
    get: String => CallbackTo[T | Null],
    has: String => CallbackTo[Boolean],
    set: (String, T) => Callback,
    size: CallbackTo[Double]
  ): LRUCache[T] = {
    val __obj = js.Dynamic.literal(_capacity = _capacity.asInstanceOf[js.Any], _map = _map.asInstanceOf[js.Any])
    __obj.updateDynamic("capacity")(capacity.toJsFn)
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => set(t0, t1).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.asInstanceOf[LRUCache[T]]
  }
}

