package typingsJapgolly.vue.typesOptionsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputedOptions[T] extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var get: js.UndefOr[js.Function0[T]] = js.undefined
  var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
}

object ComputedOptions {
  @scala.inline
  def apply[T](
    cache: js.UndefOr[Boolean] = js.undefined,
    get: js.UndefOr[CallbackTo[T]] = js.undefined,
    set: /* value */ T => Callback = null
  ): ComputedOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    get.foreach(p => __obj.updateDynamic("get")(p.toJsFn))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1((t0: /* value */ T) => set(t0).runNow()))
    __obj.asInstanceOf[ComputedOptions[T]]
  }
}

