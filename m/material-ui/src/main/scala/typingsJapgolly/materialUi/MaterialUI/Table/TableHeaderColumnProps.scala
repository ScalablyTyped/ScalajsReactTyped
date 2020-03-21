package typingsJapgolly.materialUi.MaterialUI.Table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderColumnProps extends js.Object {
  // <th/> is element that get the 'other' properties
  var className: js.UndefOr[String] = js.undefined
  // useful attributes passed to <th/>
  var colSpan: js.UndefOr[Double] = js.undefined
  var columnNumber: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* e */ ReactMouseEventFrom[js.Object with Element], /* column */ Double, Unit]
  ] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
  var tooltipStyle: js.UndefOr[CSSProperties] = js.undefined
}

object TableHeaderColumnProps {
  @scala.inline
  def apply(
    className: String = null,
    colSpan: Int | Double = null,
    columnNumber: Int | Double = null,
    key: String = null,
    onClick: (/* e */ ReactMouseEventFrom[js.Object with Element], /* column */ Double) => Callback = null,
    rowSpan: Int | Double = null,
    style: CSSProperties = null,
    tooltip: String = null,
    tooltipStyle: CSSProperties = null
  ): TableHeaderColumnProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* column */ scala.Double) => onClick(t0, t1).runNow()))
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipStyle != null) __obj.updateDynamic("tooltipStyle")(tooltipStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeaderColumnProps]
  }
}

