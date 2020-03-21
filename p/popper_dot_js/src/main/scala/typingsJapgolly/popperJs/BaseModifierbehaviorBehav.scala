package typingsJapgolly.popperJs

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.popperJs.mod.Popper.Behavior
import typingsJapgolly.popperJs.mod.Popper.Boundary
import typingsJapgolly.popperJs.mod.Popper.Data
import typingsJapgolly.popperJs.mod.Popper.ModifierFn
import typingsJapgolly.popperJs.mod.Popper.Padding
import typingsJapgolly.popperJs.mod.Popper.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popper.js.popper.js.Popper.BaseModifier & {  behavior ? :popper.js.popper.js.Popper.Behavior | std.Array<popper.js.popper.js.Popper.Position>,   padding ? :number | popper.js.popper.js.Popper.Padding,   boundariesElement ? :popper.js.popper.js.Popper.Boundary | std.Element,   flipVariations ? :boolean,   flipVariationsByContent ? :boolean} */
trait BaseModifierbehaviorBehav extends js.Object {
  var behavior: js.UndefOr[Behavior | js.Array[Position]] = js.undefined
  var boundariesElement: js.UndefOr[Boundary | Element] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var flipVariations: js.UndefOr[Boolean] = js.undefined
  var flipVariationsByContent: js.UndefOr[Boolean] = js.undefined
  var fn: js.UndefOr[ModifierFn] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Double | Padding] = js.undefined
}

object BaseModifierbehaviorBehav {
  @scala.inline
  def apply(
    behavior: Behavior | js.Array[Position] = null,
    boundariesElement: Boundary | Element = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    flipVariations: js.UndefOr[Boolean] = js.undefined,
    flipVariationsByContent: js.UndefOr[Boolean] = js.undefined,
    fn: (/* data */ Data, /* options */ js.Object) => CallbackTo[Data] = null,
    order: Int | Double = null,
    padding: Double | Padding = null
  ): BaseModifierbehaviorBehav = {
    val __obj = js.Dynamic.literal()
    if (behavior != null) __obj.updateDynamic("behavior")(behavior.asInstanceOf[js.Any])
    if (boundariesElement != null) __obj.updateDynamic("boundariesElement")(boundariesElement.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(flipVariations)) __obj.updateDynamic("flipVariations")(flipVariations.asInstanceOf[js.Any])
    if (!js.isUndefined(flipVariationsByContent)) __obj.updateDynamic("flipVariationsByContent")(flipVariationsByContent.asInstanceOf[js.Any])
    if (fn != null) __obj.updateDynamic("fn")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.popperJs.mod.Popper.Data, t1: /* options */ js.Object) => fn(t0, t1).runNow()))
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseModifierbehaviorBehav]
  }
}

