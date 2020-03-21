package typingsJapgolly.materialUi.MaterialUI.Table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowColumnProps extends js.Object {
  // <td/> is element that get the 'other' properties
  var className: js.UndefOr[String] = js.undefined
  // useful attributes passed to <td/>
  var colSpan: js.UndefOr[Double] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var hoverable: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onClick: js.UndefOr[
    js.Function2[/* e */ ReactMouseEventFrom[js.Object with Element], /* column */ Double, Unit]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onHover: js.UndefOr[
    js.Function2[/* e */ ReactMouseEventFrom[js.Object with Element], /* column */ Double, Unit]
  ] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onHoverExit: js.UndefOr[
    js.Function2[/* e */ ReactMouseEventFrom[js.Object with Element], /* column */ Double, Unit]
  ] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TableRowColumnProps {
  @scala.inline
  def apply(
    className: String = null,
    colSpan: Int | Double = null,
    columnNumber: Int | Double = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    onClick: (/* e */ ReactMouseEventFrom[js.Object with Element], /* column */ Double) => Callback = null,
    onHover: (/* e */ ReactMouseEventFrom[js.Object with Element], /* column */ Double) => Callback = null,
    onHoverExit: (/* e */ ReactMouseEventFrom[js.Object with Element], /* column */ Double) => Callback = null,
    rowSpan: Int | Double = null,
    style: CSSProperties = null
  ): TableRowColumnProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* column */ scala.Double) => onClick(t0, t1).runNow()))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* column */ scala.Double) => onHover(t0, t1).runNow()))
    if (onHoverExit != null) __obj.updateDynamic("onHoverExit")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* column */ scala.Double) => onHoverExit(t0, t1).runNow()))
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowColumnProps]
  }
}

