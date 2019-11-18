package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedPropertyDescriptor[T] extends js.Object {
  var configurable: js.UndefOr[scala.Boolean] = js.undefined
  var enumerable: js.UndefOr[scala.Boolean] = js.undefined
  var get: js.UndefOr[js.Function0[T]] = js.undefined
  var set: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  var value: js.UndefOr[T] = js.undefined
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

object TypedPropertyDescriptor {
  @scala.inline
  def apply[T](
    configurable: js.UndefOr[scala.Boolean] = js.undefined,
    enumerable: js.UndefOr[scala.Boolean] = js.undefined,
    get: js.UndefOr[CallbackTo[T]] = js.undefined,
    set: /* value */ T => Callback = null,
    value: T = null,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): TypedPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable.asInstanceOf[js.Any])
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable.asInstanceOf[js.Any])
    get.foreach(p => __obj.updateDynamic("get")(p.toJsFn))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1((t0: /* value */ T) => set(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedPropertyDescriptor[T]]
  }
}

