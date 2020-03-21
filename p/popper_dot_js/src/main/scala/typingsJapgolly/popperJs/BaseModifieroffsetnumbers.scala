package typingsJapgolly.popperJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.popperJs.mod.Popper.Data
import typingsJapgolly.popperJs.mod.Popper.ModifierFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  offset ? :number | string} */
trait BaseModifieroffsetnumbers extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fn: js.UndefOr[ModifierFn] = js.undefined
  var offset: js.UndefOr[Double | String] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
}

object BaseModifieroffsetnumbers {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    fn: (/* data */ Data, /* options */ js.Object) => CallbackTo[Data] = null,
    offset: Double | String = null,
    order: Int | Double = null
  ): BaseModifieroffsetnumbers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.popperJs.mod.Popper.Data, t1: /* options */ js.Object) => fn(t0, t1).runNow()))
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModifieroffsetnumbers]
  }
}

