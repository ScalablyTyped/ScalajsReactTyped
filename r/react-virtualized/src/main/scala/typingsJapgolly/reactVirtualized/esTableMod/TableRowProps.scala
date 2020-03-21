package typingsJapgolly.reactVirtualized.esTableMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowProps extends js.Object {
  var className: String
  var columns: js.Array[_]
  var index: Double
  var isScrolling: Boolean
  var key: String
  var onRowClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  var onRowDoubleClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  var onRowMouseOut: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  var onRowMouseOver: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  var onRowRightClick: js.UndefOr[js.Function1[/* params */ RowMouseEventHandlerParams, Unit]] = js.undefined
  var rowData: js.Any
  var style: js.Any
}

object TableRowProps {
  @scala.inline
  def apply(
    className: String,
    columns: js.Array[_],
    index: Double,
    isScrolling: Boolean,
    key: String,
    rowData: js.Any,
    style: js.Any,
    onRowClick: /* params */ RowMouseEventHandlerParams => Callback = null,
    onRowDoubleClick: /* params */ RowMouseEventHandlerParams => Callback = null,
    onRowMouseOut: /* params */ RowMouseEventHandlerParams => Callback = null,
    onRowMouseOver: /* params */ RowMouseEventHandlerParams => Callback = null,
    onRowRightClick: /* params */ RowMouseEventHandlerParams => Callback = null
  ): TableRowProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esTableMod.RowMouseEventHandlerParams) => onRowClick(t0).runNow()))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esTableMod.RowMouseEventHandlerParams) => onRowDoubleClick(t0).runNow()))
    if (onRowMouseOut != null) __obj.updateDynamic("onRowMouseOut")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esTableMod.RowMouseEventHandlerParams) => onRowMouseOut(t0).runNow()))
    if (onRowMouseOver != null) __obj.updateDynamic("onRowMouseOver")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esTableMod.RowMouseEventHandlerParams) => onRowMouseOver(t0).runNow()))
    if (onRowRightClick != null) __obj.updateDynamic("onRowRightClick")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esTableMod.RowMouseEventHandlerParams) => onRowRightClick(t0).runNow()))
    __obj.asInstanceOf[TableRowProps]
  }
}

