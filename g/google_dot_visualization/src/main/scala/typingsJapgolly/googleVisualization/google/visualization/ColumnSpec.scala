package typingsJapgolly.googleVisualization.google.visualization

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSpec extends js.Object {
  var calc: js.UndefOr[js.Function2[/* data */ DataTable, /* row */ Double, _]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var properties: js.UndefOr[Properties] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var sourceColumn: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ColumnSpec {
  @scala.inline
  def apply(
    calc: (/* data */ DataTable, /* row */ Double) => CallbackTo[js.Any] = null,
    id: String = null,
    label: String = null,
    properties: Properties = null,
    role: String = null,
    sourceColumn: Int | Double = null,
    `type`: String = null
  ): ColumnSpec = {
    val __obj = js.Dynamic.literal()
    if (calc != null) __obj.updateDynamic("calc")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.googleVisualization.google.visualization.DataTable, t1: /* row */ scala.Double) => calc(t0, t1).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (sourceColumn != null) __obj.updateDynamic("sourceColumn")(sourceColumn.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSpec]
  }
}

