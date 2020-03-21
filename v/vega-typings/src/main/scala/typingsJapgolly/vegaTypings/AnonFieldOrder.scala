package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.exprMod.ExprRef
import typingsJapgolly.vegaTypings.markMod.Compare
import typingsJapgolly.vegaTypings.scaleMod.SortOrder
import typingsJapgolly.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFieldOrder extends Compare {
  var field: js.Array[String | ExprRef | SignalRef]
  var order: js.UndefOr[js.Array[SortOrder]] = js.undefined
}

object AnonFieldOrder {
  @scala.inline
  def apply(field: js.Array[String | ExprRef | SignalRef], order: js.Array[SortOrder] = null): AnonFieldOrder = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFieldOrder]
  }
}

