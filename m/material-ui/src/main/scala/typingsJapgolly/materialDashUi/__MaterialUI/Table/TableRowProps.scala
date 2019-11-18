package typingsJapgolly.materialDashUi.__MaterialUI.Table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowProps extends js.Object {
  // <tr/> is element that get the 'other' properties
  var className: js.UndefOr[String] = js.undefined
  var displayBorder: js.UndefOr[Boolean] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
  var hovered: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellClick: js.UndefOr[
    js.Function3[
      /* e */ ReactMouseEventFrom[js.Object with Element], 
      /* row */ Double, 
      /* column */ Double, 
      Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellHover: js.UndefOr[
    js.Function3[
      /* e */ ReactMouseEventFrom[js.Object with Element], 
      /* row */ Double, 
      /* column */ Double, 
      Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onCellHoverExit: js.UndefOr[
    js.Function3[
      /* e */ ReactMouseEventFrom[js.Object with Element], 
      /* row */ Double, 
      /* column */ Double, 
      Unit
    ]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowClick: js.UndefOr[
    js.Function2[/* e */ ReactMouseEventFrom[js.Object with Element], /* row */ Double, Unit]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowHover: js.UndefOr[
    js.Function2[/* e */ ReactMouseEventFrom[js.Object with Element], /* row */ Double, Unit]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onRowHoverExit: js.UndefOr[
    js.Function2[/* e */ ReactMouseEventFrom[js.Object with Element], /* row */ Double, Unit]
  ] = js.undefined
  var rowNumber: js.UndefOr[Double] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var striped: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TableRowProps {
  @scala.inline
  def apply(
    className: String = null,
    displayBorder: js.UndefOr[Boolean] = js.undefined,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    hovered: js.UndefOr[Boolean] = js.undefined,
    onCellClick: (/* e */ ReactMouseEventFrom[js.Object with Element], /* row */ Double, /* column */ Double) => Callback = null,
    onCellHover: (/* e */ ReactMouseEventFrom[js.Object with Element], /* row */ Double, /* column */ Double) => Callback = null,
    onCellHoverExit: (/* e */ ReactMouseEventFrom[js.Object with Element], /* row */ Double, /* column */ Double) => Callback = null,
    onRowClick: (/* e */ ReactMouseEventFrom[js.Object with Element], /* row */ Double) => Callback = null,
    onRowHover: (/* e */ ReactMouseEventFrom[js.Object with Element], /* row */ Double) => Callback = null,
    onRowHoverExit: (/* e */ ReactMouseEventFrom[js.Object with Element], /* row */ Double) => Callback = null,
    rowNumber: Int | Double = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    striped: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): TableRowProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(displayBorder)) __obj.updateDynamic("displayBorder")(displayBorder.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (!js.isUndefined(hovered)) __obj.updateDynamic("hovered")(hovered.asInstanceOf[js.Any])
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction3((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* row */ scala.Double, t2: /* column */ scala.Double) => onCellClick(t0, t1, t2).runNow()))
    if (onCellHover != null) __obj.updateDynamic("onCellHover")(js.Any.fromFunction3((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* row */ scala.Double, t2: /* column */ scala.Double) => onCellHover(t0, t1, t2).runNow()))
    if (onCellHoverExit != null) __obj.updateDynamic("onCellHoverExit")(js.Any.fromFunction3((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* row */ scala.Double, t2: /* column */ scala.Double) => onCellHoverExit(t0, t1, t2).runNow()))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* row */ scala.Double) => onRowClick(t0, t1).runNow()))
    if (onRowHover != null) __obj.updateDynamic("onRowHover")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* row */ scala.Double) => onRowHover(t0, t1).runNow()))
    if (onRowHoverExit != null) __obj.updateDynamic("onRowHoverExit")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* row */ scala.Double) => onRowHoverExit(t0, t1).runNow()))
    if (rowNumber != null) __obj.updateDynamic("rowNumber")(rowNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowProps]
  }
}

