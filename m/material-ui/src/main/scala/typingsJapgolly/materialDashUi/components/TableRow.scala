package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialDashUi.__MaterialUI.Table.TableRowProps
import typingsJapgolly.materialDashUi.tableTableRowMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableRow {
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
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableRowProps, default, Unit, TableRowProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.Table.TableRowProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.tableTableRowMod.default](js.constructorOf[typingsJapgolly.materialDashUi.tableTableRowMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.Table.TableRowProps])(children: _*)
  }
}

