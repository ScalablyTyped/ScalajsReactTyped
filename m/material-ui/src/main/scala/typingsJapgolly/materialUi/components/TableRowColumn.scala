package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialUi.MaterialUI.Table.TableRowColumnProps
import typingsJapgolly.materialUi.tableRowColumnMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableRowColumn {
  def apply(
    className: String = null,
    colSpan: Int | Double = null,
    columnNumber: Int | Double = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* e */ ReactMouseEventFrom[js.Object with Element], /* column */ Double) => Callback = null,
    onHover: (/* e */ ReactMouseEventFrom[js.Object with Element], /* column */ Double) => Callback = null,
    onHoverExit: (/* e */ ReactMouseEventFrom[js.Object with Element], /* column */ Double) => Callback = null,
    rowSpan: Int | Double = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableRowColumnProps, default, Unit, TableRowColumnProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* column */ scala.Double) => onClick(t0, t1).runNow()))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* column */ scala.Double) => onHover(t0, t1).runNow()))
    if (onHoverExit != null) __obj.updateDynamic("onHoverExit")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* column */ scala.Double) => onHoverExit(t0, t1).runNow()))
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.Table.TableRowColumnProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.tableRowColumnMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Table.TableRowColumnProps])(children: _*)
  }
  @JSImport("material-ui/Table/TableRowColumn", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

