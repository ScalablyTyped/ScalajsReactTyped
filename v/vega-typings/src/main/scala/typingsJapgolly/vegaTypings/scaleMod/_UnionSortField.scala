package typingsJapgolly.vegaTypings.scaleMod

import typingsJapgolly.vegaTypings.vegaTypingsStrings.count
import typingsJapgolly.vegaTypings.vegaTypingsStrings.max
import typingsJapgolly.vegaTypings.vegaTypingsStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnionSortField extends js.Object

object _UnionSortField {
  @scala.inline
  def AnonOpOrder(op: count, order: SortOrder = null): _UnionSortField = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnionSortField]
  }
  @scala.inline
  def AnonFieldOp(field: ScaleField, op: count | min | max, order: SortOrder = null): _UnionSortField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnionSortField]
  }
}

