package typingsJapgolly.fixedDataTable2.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.auto
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.hidden
import typingsJapgolly.fixedDataTable2.mod.ColumnReorderEndEvent
import typingsJapgolly.fixedDataTable2.mod.ElementOrFunc
import typingsJapgolly.fixedDataTable2.mod.RowProps
import typingsJapgolly.fixedDataTable2.mod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  def apply(
    headerHeight: Double,
    rowHeight: Double,
    rowsCount: Double,
    width: Double,
    bufferRowCount: Int | Double = null,
    cellGroupWrapperHeight: Int | Double = null,
    className: String = null,
    footerHeight: Int | Double = null,
    groupHeaderHeight: Int | Double = null,
    height: Int | Double = null,
    isColumnReordering: js.UndefOr[Boolean] = js.undefined,
    isColumnResizing: js.UndefOr[Boolean] = js.undefined,
    keyboardPageEnabled: js.UndefOr[Boolean] = js.undefined,
    keyboardScrollEnabled: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    onColumnReorderEndCallback: /* event */ ColumnReorderEndEvent => Callback = null,
    onColumnResizeEndCallback: (/* newColumnWidth */ Double, /* columnKey */ String) => Callback = null,
    onContentHeightChange: /* newHeight */ Double => Callback = null,
    onHorizontalScroll: /* scrollPos */ Double => CallbackTo[Boolean] = null,
    onRowClick: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowDoubleClick: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowMouseDown: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowMouseEnter: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowMouseLeave: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowMouseUp: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowTouchEnd: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowTouchMove: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onRowTouchStart: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with Element], /* rowIndex */ Double) => Callback = null,
    onScrollEnd: (/* x */ Double, /* y */ Double) => Callback = null,
    onScrollStart: (/* x */ Double, /* y */ Double) => Callback = null,
    onVerticalScroll: /* scrollPos */ Double => CallbackTo[Boolean] = null,
    overflowX: hidden | auto = null,
    overflowY: hidden | auto = null,
    ownerHeight: Int | Double = null,
    rowClassNameGetter: /* index */ Double => CallbackTo[String] = null,
    rowExpanded: ElementOrFunc[RowProps] = null,
    rowHeightGetter: /* index */ Double => CallbackTo[Double] = null,
    rowKeyGetter: /* index */ Double => CallbackTo[String] = null,
    scrollLeft: Int | Double = null,
    scrollToColumn: Int | Double = null,
    scrollToRow: Int | Double = null,
    scrollTop: Int | Double = null,
    showScrollbarX: js.UndefOr[Boolean] = js.undefined,
    showScrollbarY: js.UndefOr[Boolean] = js.undefined,
    stopScrollPropagation: js.UndefOr[Boolean] = js.undefined,
    subRowHeight: Int | Double = null,
    subRowHeightGetter: /* index */ Double => CallbackTo[Double] = null,
    touchScrollEnabled: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableProps, typingsJapgolly.fixedDataTable2.mod.Table, Unit, TableProps] = {
    val __obj = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      if (bufferRowCount != null) __obj.updateDynamic("bufferRowCount")(bufferRowCount.asInstanceOf[js.Any])
    if (cellGroupWrapperHeight != null) __obj.updateDynamic("cellGroupWrapperHeight")(cellGroupWrapperHeight.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (footerHeight != null) __obj.updateDynamic("footerHeight")(footerHeight.asInstanceOf[js.Any])
    if (groupHeaderHeight != null) __obj.updateDynamic("groupHeaderHeight")(groupHeaderHeight.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumnReordering)) __obj.updateDynamic("isColumnReordering")(isColumnReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumnResizing)) __obj.updateDynamic("isColumnResizing")(isColumnResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardPageEnabled)) __obj.updateDynamic("keyboardPageEnabled")(keyboardPageEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboardScrollEnabled)) __obj.updateDynamic("keyboardScrollEnabled")(keyboardScrollEnabled.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (onColumnReorderEndCallback != null) __obj.updateDynamic("onColumnReorderEndCallback")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.fixedDataTable2.mod.ColumnReorderEndEvent) => onColumnReorderEndCallback(t0).runNow()))
    if (onColumnResizeEndCallback != null) __obj.updateDynamic("onColumnResizeEndCallback")(js.Any.fromFunction2((t0: /* newColumnWidth */ scala.Double, t1: /* columnKey */ java.lang.String) => onColumnResizeEndCallback(t0, t1).runNow()))
    if (onContentHeightChange != null) __obj.updateDynamic("onContentHeightChange")(js.Any.fromFunction1((t0: /* newHeight */ scala.Double) => onContentHeightChange(t0).runNow()))
    if (onHorizontalScroll != null) __obj.updateDynamic("onHorizontalScroll")(js.Any.fromFunction1((t0: /* scrollPos */ scala.Double) => onHorizontalScroll(t0).runNow()))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowClick(t0, t1).runNow()))
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowDoubleClick(t0, t1).runNow()))
    if (onRowMouseDown != null) __obj.updateDynamic("onRowMouseDown")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowMouseDown(t0, t1).runNow()))
    if (onRowMouseEnter != null) __obj.updateDynamic("onRowMouseEnter")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowMouseEnter(t0, t1).runNow()))
    if (onRowMouseLeave != null) __obj.updateDynamic("onRowMouseLeave")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowMouseLeave(t0, t1).runNow()))
    if (onRowMouseUp != null) __obj.updateDynamic("onRowMouseUp")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowMouseUp(t0, t1).runNow()))
    if (onRowTouchEnd != null) __obj.updateDynamic("onRowTouchEnd")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowTouchEnd(t0, t1).runNow()))
    if (onRowTouchMove != null) __obj.updateDynamic("onRowTouchMove")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowTouchMove(t0, t1).runNow()))
    if (onRowTouchStart != null) __obj.updateDynamic("onRowTouchStart")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table with org.scalajs.dom.raw.Element], t1: /* rowIndex */ scala.Double) => onRowTouchStart(t0, t1).runNow()))
    if (onScrollEnd != null) __obj.updateDynamic("onScrollEnd")(js.Any.fromFunction2((t0: /* x */ scala.Double, t1: /* y */ scala.Double) => onScrollEnd(t0, t1).runNow()))
    if (onScrollStart != null) __obj.updateDynamic("onScrollStart")(js.Any.fromFunction2((t0: /* x */ scala.Double, t1: /* y */ scala.Double) => onScrollStart(t0, t1).runNow()))
    if (onVerticalScroll != null) __obj.updateDynamic("onVerticalScroll")(js.Any.fromFunction1((t0: /* scrollPos */ scala.Double) => onVerticalScroll(t0).runNow()))
    if (overflowX != null) __obj.updateDynamic("overflowX")(overflowX.asInstanceOf[js.Any])
    if (overflowY != null) __obj.updateDynamic("overflowY")(overflowY.asInstanceOf[js.Any])
    if (ownerHeight != null) __obj.updateDynamic("ownerHeight")(ownerHeight.asInstanceOf[js.Any])
    if (rowClassNameGetter != null) __obj.updateDynamic("rowClassNameGetter")(js.Any.fromFunction1((t0: /* index */ scala.Double) => rowClassNameGetter(t0).runNow()))
    if (rowExpanded != null) __obj.updateDynamic("rowExpanded")(rowExpanded.asInstanceOf[js.Any])
    if (rowHeightGetter != null) __obj.updateDynamic("rowHeightGetter")(js.Any.fromFunction1((t0: /* index */ scala.Double) => rowHeightGetter(t0).runNow()))
    if (rowKeyGetter != null) __obj.updateDynamic("rowKeyGetter")(js.Any.fromFunction1((t0: /* index */ scala.Double) => rowKeyGetter(t0).runNow()))
    if (scrollLeft != null) __obj.updateDynamic("scrollLeft")(scrollLeft.asInstanceOf[js.Any])
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (!js.isUndefined(showScrollbarX)) __obj.updateDynamic("showScrollbarX")(showScrollbarX.asInstanceOf[js.Any])
    if (!js.isUndefined(showScrollbarY)) __obj.updateDynamic("showScrollbarY")(showScrollbarY.asInstanceOf[js.Any])
    if (!js.isUndefined(stopScrollPropagation)) __obj.updateDynamic("stopScrollPropagation")(stopScrollPropagation.asInstanceOf[js.Any])
    if (subRowHeight != null) __obj.updateDynamic("subRowHeight")(subRowHeight.asInstanceOf[js.Any])
    if (subRowHeightGetter != null) __obj.updateDynamic("subRowHeightGetter")(js.Any.fromFunction1((t0: /* index */ scala.Double) => subRowHeightGetter(t0).runNow()))
    if (!js.isUndefined(touchScrollEnabled)) __obj.updateDynamic("touchScrollEnabled")(touchScrollEnabled.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fixedDataTable2.mod.TableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fixedDataTable2.mod.Table](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fixedDataTable2.mod.TableProps])(children: _*)
  }
  @JSImport("fixed-data-table-2", "Table")
  @js.native
  object componentImport extends js.Object
  
}

