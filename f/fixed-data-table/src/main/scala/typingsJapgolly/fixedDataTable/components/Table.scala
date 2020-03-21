package typingsJapgolly.fixedDataTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.fixedDataTable.mod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  def apply(
    rowHeight: Double,
    rowsCount: Double,
    width: Double,
    footerHeight: Int | Double = null,
    groupHeaderHeight: Int | Double = null,
    headerHeight: Int | Double = null,
    height: Int | Double = null,
    isColumnResizing: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    onColumnResizeEndCallback: (/* newColumnWidth */ Double, /* columnKey */ String) => Callback = null,
    onContentHeightChange: /* newHeight */ Double => Callback = null,
    onRowClick: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowDoubleClick: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowMouseDown: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowMouseEnter: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowMouseLeave: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onScrollEnd: (/* x */ Double, /* y */ Double) => Callback = null,
    onScrollStart: (/* x */ Double, /* y */ Double) => Callback = null,
    overflowX: String = null,
    overflowY: String = null,
    ownerHeight: Int | Double = null,
    rowClassNameGetter: /* index */ Double => CallbackTo[String] = null,
    rowHeightGetter: /* index */ Double => CallbackTo[Double] = null,
    scrollLeft: Int | Double = null,
    scrollToColumn: Int | Double = null,
    scrollToRow: Int | Double = null,
    scrollTop: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableProps, typingsJapgolly.fixedDataTable.mod.Table, Unit, TableProps] = {
    val __obj = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      if (footerHeight != null) __obj.updateDynamic("footerHeight")(footerHeight.asInstanceOf[js.Any])
    if (groupHeaderHeight != null) __obj.updateDynamic("groupHeaderHeight")(groupHeaderHeight.asInstanceOf[js.Any])
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumnResizing)) __obj.updateDynamic("isColumnResizing")(isColumnResizing.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (onColumnResizeEndCallback != null) __obj.updateDynamic("onColumnResizeEndCallback")(js.Any.fromFunction2((t0: /* newColumnWidth */ scala.Double, t1: /* columnKey */ java.lang.String) => onColumnResizeEndCallback(t0, t1).runNow()))
    if (onContentHeightChange != null) __obj.updateDynamic("onContentHeightChange")(js.Any.fromFunction1((t0: /* newHeight */ scala.Double) => onContentHeightChange(t0).runNow()))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowClick(t0, t1).runNow()))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowDoubleClick(t0, t1).runNow()))
    if (onRowMouseDown != null) __obj.updateDynamic("onRowMouseDown")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowMouseDown(t0, t1).runNow()))
    if (onRowMouseEnter != null) __obj.updateDynamic("onRowMouseEnter")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowMouseEnter(t0, t1).runNow()))
    if (onRowMouseLeave != null) __obj.updateDynamic("onRowMouseLeave")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowMouseLeave(t0, t1).runNow()))
    if (onScrollEnd != null) __obj.updateDynamic("onScrollEnd")(js.Any.fromFunction2((t0: /* x */ scala.Double, t1: /* y */ scala.Double) => onScrollEnd(t0, t1).runNow()))
    if (onScrollStart != null) __obj.updateDynamic("onScrollStart")(js.Any.fromFunction2((t0: /* x */ scala.Double, t1: /* y */ scala.Double) => onScrollStart(t0, t1).runNow()))
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (ownerHeight != null) __obj.updateDynamic("ownerHeight")(ownerHeight.asInstanceOf[js.Any])
    if (rowClassNameGetter != null) __obj.updateDynamic("rowClassNameGetter")(js.Any.fromFunction1((t0: /* index */ scala.Double) => rowClassNameGetter(t0).runNow()))
    if (rowHeightGetter != null) __obj.updateDynamic("rowHeightGetter")(js.Any.fromFunction1((t0: /* index */ scala.Double) => rowHeightGetter(t0).runNow()))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fixedDataTable.mod.TableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fixedDataTable.mod.Table](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fixedDataTable.mod.TableProps])(children: _*)
  }
  @JSImport("fixed-data-table", "Table")
  @js.native
  object componentImport extends js.Object
  
}

