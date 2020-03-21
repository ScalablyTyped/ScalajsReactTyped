package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseExpandedInstanceProps[D /* <: js.Object */] extends js.Object {
  var expandedDepth: Double
  var rows: js.Array[Row[D]]
  def toggleExpanded(id: js.Array[IdType[D]], isExpanded: Boolean): Unit
}

object UseExpandedInstanceProps {
  @scala.inline
  def apply[D /* <: js.Object */](
    expandedDepth: Double,
    rows: js.Array[Row[D]],
    toggleExpanded: (js.Array[IdType[D]], Boolean) => Callback
  ): UseExpandedInstanceProps[D] = {
    val __obj = js.Dynamic.literal(expandedDepth = expandedDepth.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.updateDynamic("toggleExpanded")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.reactTable.mod.IdType[D]], t1: scala.Boolean) => toggleExpanded(t0, t1).runNow()))
    __obj.asInstanceOf[UseExpandedInstanceProps[D]]
  }
}

