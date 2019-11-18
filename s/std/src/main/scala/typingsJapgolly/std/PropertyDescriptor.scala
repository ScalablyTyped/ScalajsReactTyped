package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyDescriptor extends js.Object {
  var configurable: js.UndefOr[scala.Boolean] = js.undefined
  var enumerable: js.UndefOr[scala.Boolean] = js.undefined
  var get: js.UndefOr[js.Function0[_]] = js.undefined
  var set: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

object PropertyDescriptor {
  @scala.inline
  def apply(
    configurable: js.UndefOr[scala.Boolean] = js.undefined,
    enumerable: js.UndefOr[scala.Boolean] = js.undefined,
    get: js.UndefOr[CallbackTo[_]] = js.undefined,
    set: /* v */ js.Any => Callback = null,
    value: js.Any = null,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): PropertyDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable.asInstanceOf[js.Any])
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable.asInstanceOf[js.Any])
    get.foreach(p => __obj.updateDynamic("get")(p.toJsFn))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1((t0: /* v */ js.Any) => set(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDescriptor]
  }
}

