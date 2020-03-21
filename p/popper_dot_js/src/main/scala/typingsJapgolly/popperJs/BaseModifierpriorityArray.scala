package typingsJapgolly.popperJs

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.popperJs.mod.Popper.Boundary
import typingsJapgolly.popperJs.mod.Popper.Data
import typingsJapgolly.popperJs.mod.Popper.ModifierFn
import typingsJapgolly.popperJs.mod.Popper.Padding
import typingsJapgolly.popperJs.mod.Popper.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  priority ? :std.Array<popper.js.popper.js.Popper.Position>,   padding ? :number | popper.js.popper.js.Popper.Padding,   boundariesElement ? :popper.js.popper.js.Popper.Boundary | std.Element,   escapeWithReference ? :boolean} */
trait BaseModifierpriorityArray extends js.Object {
  var boundariesElement: js.UndefOr[Boundary | Element] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var escapeWithReference: js.UndefOr[Boolean] = js.undefined
  var fn: js.UndefOr[ModifierFn] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double | Padding] = js.undefined
  var priority: js.UndefOr[js.Array[Position]] = js.undefined
}

object BaseModifierpriorityArray {
  @scala.inline
  def apply(
    boundariesElement: Boundary | Element = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    escapeWithReference: js.UndefOr[Boolean] = js.undefined,
    fn: (/* data */ Data, /* options */ js.Object) => CallbackTo[Data] = null,
    order: Int | Double = null,
    padding: Double | Padding = null,
    priority: js.Array[Position] = null
  ): BaseModifierpriorityArray = {
    val __obj = js.Dynamic.literal()
    if (boundariesElement != null) __obj.updateDynamic("boundariesElement")(boundariesElement.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeWithReference)) __obj.updateDynamic("escapeWithReference")(escapeWithReference.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.popperJs.mod.Popper.Data, t1: /* options */ js.Object) => fn(t0, t1).runNow()))
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModifierpriorityArray]
  }
}

