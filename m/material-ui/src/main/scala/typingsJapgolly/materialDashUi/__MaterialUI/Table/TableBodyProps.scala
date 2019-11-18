package typingsJapgolly.materialDashUi.__MaterialUI.Table

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableBodyProps extends js.Object {
  /** @deprecated Instead, use property on Table */
  var allRowsSelected: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var deselectOnClickaway: js.UndefOr[Boolean] = js.undefined
  var displayRowCheckbox: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Instead, use property on Table */
  var multiSelectable: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellClick: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellHover: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellHoverExit: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowHover: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowHoverExit: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowSelection: js.UndefOr[js.Function1[/* selectedRows */ js.Array[Double] | String, Unit]] = js.undefined
  var preScanRows: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Instead, use property on Table */
  var selectable: js.UndefOr[Boolean] = js.undefined
  var showRowHover: js.UndefOr[Boolean] = js.undefined
  var stripedRows: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TableBodyProps {
  @scala.inline
  def apply(
    allRowsSelected: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    deselectOnClickaway: js.UndefOr[Boolean] = js.undefined,
    displayRowCheckbox: js.UndefOr[Boolean] = js.undefined,
    multiSelectable: js.UndefOr[Boolean] = js.undefined,
    onCellClick: (/* row */ Double, /* column */ Double) => Callback = null,
    onCellHover: (/* row */ Double, /* column */ Double) => Callback = null,
    onCellHoverExit: (/* row */ Double, /* column */ Double) => Callback = null,
    onRowHover: /* row */ Double => Callback = null,
    onRowHoverExit: /* row */ Double => Callback = null,
    onRowSelection: /* selectedRows */ js.Array[Double] | String => Callback = null,
    preScanRows: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    showRowHover: js.UndefOr[Boolean] = js.undefined,
    stripedRows: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): TableBodyProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allRowsSelected)) __obj.updateDynamic("allRowsSelected")(allRowsSelected.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(deselectOnClickaway)) __obj.updateDynamic("deselectOnClickaway")(deselectOnClickaway.asInstanceOf[js.Any])
    if (!js.isUndefined(displayRowCheckbox)) __obj.updateDynamic("displayRowCheckbox")(displayRowCheckbox.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* column */ scala.Double) => onCellClick(t0, t1).runNow()))
    if (onCellHover != null) __obj.updateDynamic("onCellHover")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* column */ scala.Double) => onCellHover(t0, t1).runNow()))
    if (onCellHoverExit != null) __obj.updateDynamic("onCellHoverExit")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* column */ scala.Double) => onCellHoverExit(t0, t1).runNow()))
    if (onRowHover != null) __obj.updateDynamic("onRowHover")(js.Any.fromFunction1((t0: /* row */ scala.Double) => onRowHover(t0).runNow()))
    if (onRowHoverExit != null) __obj.updateDynamic("onRowHoverExit")(js.Any.fromFunction1((t0: /* row */ scala.Double) => onRowHoverExit(t0).runNow()))
    if (onRowSelection != null) __obj.updateDynamic("onRowSelection")(js.Any.fromFunction1((t0: /* selectedRows */ js.Array[scala.Double] | java.lang.String) => onRowSelection(t0).runNow()))
    if (!js.isUndefined(preScanRows)) __obj.updateDynamic("preScanRows")(preScanRows.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowHover)) __obj.updateDynamic("showRowHover")(showRowHover.asInstanceOf[js.Any])
    if (!js.isUndefined(stripedRows)) __obj.updateDynamic("stripedRows")(stripedRows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBodyProps]
  }
}

