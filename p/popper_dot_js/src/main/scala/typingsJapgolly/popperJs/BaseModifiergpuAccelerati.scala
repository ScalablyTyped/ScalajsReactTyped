package typingsJapgolly.popperJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.popperJs.mod.Popper.Data
import typingsJapgolly.popperJs.mod.Popper.ModifierFn
import typingsJapgolly.popperJs.popperJsStrings.bottom
import typingsJapgolly.popperJs.popperJsStrings.left
import typingsJapgolly.popperJs.popperJsStrings.right
import typingsJapgolly.popperJs.popperJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  gpuAcceleration ? :boolean,   x ? :'bottom' | 'top',   y ? :'left' | 'right'} */
trait BaseModifiergpuAccelerati extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fn: js.UndefOr[ModifierFn] = js.undefined
  var gpuAcceleration: js.UndefOr[Boolean] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[bottom | top] = js.undefined
  var y: js.UndefOr[left | right] = js.undefined
}

object BaseModifiergpuAccelerati {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    fn: (/* data */ Data, /* options */ js.Object) => CallbackTo[Data] = null,
    gpuAcceleration: js.UndefOr[Boolean] = js.undefined,
    order: Int | Double = null,
    x: bottom | top = null,
    y: left | right = null
  ): BaseModifiergpuAccelerati = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.popperJs.mod.Popper.Data, t1: /* options */ js.Object) => fn(t0, t1).runNow()))
    if (!js.isUndefined(gpuAcceleration)) __obj.updateDynamic("gpuAcceleration")(gpuAcceleration.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModifiergpuAccelerati]
  }
}

