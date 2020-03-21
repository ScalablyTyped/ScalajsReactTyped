package typingsJapgolly.mobx.decoratorsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.PropertyDescriptor & {initializer ? (): any} */
trait BabelDescriptor extends js.Object {
  var configurable: js.UndefOr[Boolean] = js.undefined
  var enumerable: js.UndefOr[Boolean] = js.undefined
  var get: js.UndefOr[js.Function0[_]] = js.undefined
  var initializer: js.UndefOr[js.Function0[_]] = js.undefined
  var set: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var writable: js.UndefOr[Boolean] = js.undefined
}

object BabelDescriptor {
  @scala.inline
  def apply(
    configurable: js.UndefOr[Boolean] = js.undefined,
    enumerable: js.UndefOr[Boolean] = js.undefined,
    get: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    initializer: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    set: /* v */ js.Any => Callback = null,
    value: js.Any = null,
    writable: js.UndefOr[Boolean] = js.undefined
  ): BabelDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable.asInstanceOf[js.Any])
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable.asInstanceOf[js.Any])
    get.foreach(p => __obj.updateDynamic("get")(p.toJsFn))
    initializer.foreach(p => __obj.updateDynamic("initializer")(p.toJsFn))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1((t0: /* v */ js.Any) => set(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[BabelDescriptor]
  }
}

