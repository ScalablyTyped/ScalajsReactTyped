package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.scaleMod.ScaleField
import typingsJapgolly.vegaTypings.scaleMod.SortOrder
import typingsJapgolly.vegaTypings.scaleMod._UnionSortField
import typingsJapgolly.vegaTypings.vegaTypingsStrings.count
import typingsJapgolly.vegaTypings.vegaTypingsStrings.max
import typingsJapgolly.vegaTypings.vegaTypingsStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFieldOp extends _UnionSortField {
  var field: ScaleField
  var op: count | min | max
  var order: js.UndefOr[SortOrder] = js.undefined
}

object AnonFieldOp {
  @scala.inline
  def apply(field: ScaleField, op: count | min | max, order: SortOrder = null): AnonFieldOp = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFieldOp]
  }
}

