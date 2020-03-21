package typingsJapgolly.hapiCatboxMemcached.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hapiCatbox.mod.CacheKey
import typingsJapgolly.hapiCatbox.mod.CachedObject
import typingsJapgolly.hapiCatbox.mod.ClientApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatboxMemcached[T] extends ClientApi[T] {
  def generateKey(key: CacheKey): String
}

object CatboxMemcached {
  @scala.inline
  def apply[T](
    drop: CacheKey => CallbackTo[js.Promise[Unit]],
    generateKey: CacheKey => CallbackTo[String],
    get: CacheKey => CallbackTo[js.Promise[Null | CachedObject[T]]],
    isReady: CallbackTo[Boolean],
    set: (CacheKey, T, Double) => CallbackTo[js.Promise[Unit]],
    start: CallbackTo[js.Promise[Unit]],
    stop: Callback,
    validateSegmentName: String => CallbackTo[Null | js.Error]
  ): CatboxMemcached[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drop")(js.Any.fromFunction1((t0: typingsJapgolly.hapiCatbox.mod.CacheKey) => drop(t0).runNow()))
    __obj.updateDynamic("generateKey")(js.Any.fromFunction1((t0: typingsJapgolly.hapiCatbox.mod.CacheKey) => generateKey(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.hapiCatbox.mod.CacheKey) => get(t0).runNow()))
    __obj.updateDynamic("isReady")(isReady.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction3((t0: typingsJapgolly.hapiCatbox.mod.CacheKey, t1: T, t2: scala.Double) => set(t0, t1, t2).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.updateDynamic("validateSegmentName")(js.Any.fromFunction1((t0: java.lang.String) => validateSegmentName(t0).runNow()))
    __obj.asInstanceOf[CatboxMemcached[T]]
  }
}

