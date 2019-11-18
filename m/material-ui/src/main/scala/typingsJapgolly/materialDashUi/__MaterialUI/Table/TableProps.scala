package typingsJapgolly.materialDashUi.__MaterialUI.Table

import japgolly.scalajs.react.Callback
import typingsJapgolly.materialDashUi.materialDashUiStrings.all
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends js.Object {
  var allRowsSelected: js.UndefOr[Boolean] = js.undefined
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var fixedFooter: js.UndefOr[Boolean] = js.undefined
  var fixedHeader: js.UndefOr[Boolean] = js.undefined
  var footerStyle: js.UndefOr[CSSProperties] = js.undefined
  var headerStyle: js.UndefOr[CSSProperties] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var multiSelectable: js.UndefOr[Boolean] = js.undefined
  var onCellClick: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
  var onCellHover: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
  var onCellHoverExit: js.UndefOr[js.Function2[/* row */ Double, /* column */ Double, Unit]] = js.undefined
  var onRowHover: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var onRowHoverExit: js.UndefOr[js.Function1[/* row */ Double, Unit]] = js.undefined
  var onRowSelection: js.UndefOr[js.Function1[/* selectedRows */ js.Array[Double] | all, Unit]] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var wrapperStyle: js.UndefOr[CSSProperties] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    allRowsSelected: js.UndefOr[Boolean] = js.undefined,
    bodyStyle: CSSProperties = null,
    className: String = null,
    fixedFooter: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    footerStyle: CSSProperties = null,
    headerStyle: CSSProperties = null,
    height: String = null,
    multiSelectable: js.UndefOr[Boolean] = js.undefined,
    onCellClick: (/* row */ Double, /* column */ Double) => Callback = null,
    onCellHover: (/* row */ Double, /* column */ Double) => Callback = null,
    onCellHoverExit: (/* row */ Double, /* column */ Double) => Callback = null,
    onRowHover: /* row */ Double => Callback = null,
    onRowHoverExit: /* row */ Double => Callback = null,
    onRowSelection: /* selectedRows */ js.Array[Double] | all => Callback = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    wrapperStyle: CSSProperties = null
  ): TableProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allRowsSelected)) __obj.updateDynamic("allRowsSelected")(allRowsSelected.asInstanceOf[js.Any])
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedFooter)) __obj.updateDynamic("fixedFooter")(fixedFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle.asInstanceOf[js.Any])
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelectable)) __obj.updateDynamic("multiSelectable")(multiSelectable.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* column */ scala.Double) => onCellClick(t0, t1).runNow()))
    if (onCellHover != null) __obj.updateDynamic("onCellHover")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* column */ scala.Double) => onCellHover(t0, t1).runNow()))
    if (onCellHoverExit != null) __obj.updateDynamic("onCellHoverExit")(js.Any.fromFunction2((t0: /* row */ scala.Double, t1: /* column */ scala.Double) => onCellHoverExit(t0, t1).runNow()))
    if (onRowHover != null) __obj.updateDynamic("onRowHover")(js.Any.fromFunction1((t0: /* row */ scala.Double) => onRowHover(t0).runNow()))
    if (onRowHoverExit != null) __obj.updateDynamic("onRowHoverExit")(js.Any.fromFunction1((t0: /* row */ scala.Double) => onRowHoverExit(t0).runNow()))
    if (onRowSelection != null) __obj.updateDynamic("onRowSelection")(js.Any.fromFunction1((t0: /* selectedRows */ js.Array[scala.Double] | typingsJapgolly.materialDashUi.materialDashUiStrings.all) => onRowSelection(t0).runNow()))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
}

