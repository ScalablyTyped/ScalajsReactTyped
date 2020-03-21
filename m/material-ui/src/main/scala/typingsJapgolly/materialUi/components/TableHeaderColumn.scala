package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialUi.MaterialUI.Table.TableHeaderColumnProps
import typingsJapgolly.materialUi.tableHeaderColumnMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableHeaderColumn {
  def apply(
    className: String = null,
    colSpan: Int | Double = null,
    columnNumber: Int | Double = null,
    onClick: (/* e */ ReactMouseEventFrom[js.Object with Element], /* column */ Double) => Callback = null,
    rowSpan: Int | Double = null,
    style: CSSProperties = null,
    tooltip: String = null,
    tooltipStyle: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableHeaderColumnProps, default, Unit, TableHeaderColumnProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* column */ scala.Double) => onClick(t0, t1).runNow()))
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipStyle != null) __obj.updateDynamic("tooltipStyle")(tooltipStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.Table.TableHeaderColumnProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.tableHeaderColumnMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Table.TableHeaderColumnProps])(children: _*)
  }
  @JSImport("material-ui/Table/TableHeaderColumn", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

