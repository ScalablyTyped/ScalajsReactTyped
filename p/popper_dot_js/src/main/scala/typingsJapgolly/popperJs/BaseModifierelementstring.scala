package typingsJapgolly.popperJs

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.popperJs.mod.Popper.Data
import typingsJapgolly.popperJs.mod.Popper.ModifierFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  element ? :string | std.Element} */
trait BaseModifierelementstring extends js.Object {
  var element: js.UndefOr[String | Element] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var fn: js.UndefOr[ModifierFn] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
}

object BaseModifierelementstring {
  @scala.inline
  def apply(
    element: String | Element = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fn: (/* data */ Data, /* options */ js.Object) => CallbackTo[Data] = null,
    order: Int | Double = null
  ): BaseModifierelementstring = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.popperJs.mod.Popper.Data, t1: /* options */ js.Object) => fn(t0, t1).runNow()))
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModifierelementstring]
  }
}

