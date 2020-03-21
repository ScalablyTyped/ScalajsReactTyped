package typingsJapgolly.googleVisualization.google.visualization

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTableCellValueFilter extends DataTableCellFilter

object DataTableCellValueFilter {
  @scala.inline
  def apply(
    column: Double,
    maxValue: js.Any = null,
    minValue: js.Any = null,
    test: (/* value */ js.Any, /* row */ js.UndefOr[Double], /* column */ js.UndefOr[Double], /* data */ js.UndefOr[DataTable | DataView]) => CallbackTo[Boolean] = null,
    value: js.Any = null
  ): DataTableCellValueFilter = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(js.Any.fromFunction4((t0: /* value */ js.Any, t1: /* row */ js.UndefOr[scala.Double], t2: /* column */ js.UndefOr[scala.Double], t3: /* data */ js.UndefOr[
  typingsJapgolly.googleVisualization.google.visualization.DataTable | typingsJapgolly.googleVisualization.google.visualization.DataView]) => test(t0, t1, t2, t3).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTableCellValueFilter]
  }
}

