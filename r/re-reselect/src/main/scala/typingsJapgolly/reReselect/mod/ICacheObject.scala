package typingsJapgolly.reReselect.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICacheObject extends js.Object {
  var isValidCacheKey: js.UndefOr[js.Function1[/* key */ js.Any, Boolean]] = js.undefined
  def clear(): Unit
  def get(key: js.Any): js.Any
  def remove(key: js.Any): Unit
  def set(key: js.Any, selectorFn: js.Any): Unit
}

object ICacheObject {
  @scala.inline
  def apply(
    clear: Callback,
    get: js.Any => CallbackTo[js.Any],
    remove: js.Any => Callback,
    set: (js.Any, js.Any) => Callback,
    isValidCacheKey: /* key */ js.Any => CallbackTo[Boolean] = null
  ): ICacheObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Any) => get(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: js.Any) => remove(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => set(t0, t1).runNow()))
    if (isValidCacheKey != null) __obj.updateDynamic("isValidCacheKey")(js.Any.fromFunction1((t0: /* key */ js.Any) => isValidCacheKey(t0).runNow()))
    __obj.asInstanceOf[ICacheObject]
  }
}

