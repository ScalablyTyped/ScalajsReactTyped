package typingsJapgolly.fixedDataTable2.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.auto
import typingsJapgolly.fixedDataTable2.fixedDataTable2Strings.hidden
import typingsJapgolly.fixedDataTable2.mod.ColumnReorderEndEvent
import typingsJapgolly.fixedDataTable2.mod.ElementOrFunc
import typingsJapgolly.fixedDataTable2.mod.RowProps
import typingsJapgolly.fixedDataTable2.mod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  inline def apply(headerHeight: Double, rowHeight: Double, rowsCount: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(headerHeight = headerHeight.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableProps]))
  }
  
  @JSImport("fixed-data-table-2", "Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fixedDataTable2.mod.Table] {
    
    inline def bufferRowCount(value: Double): this.type = set("bufferRowCount", value.asInstanceOf[js.Any])
    
    inline def cellGroupWrapperHeight(value: Double): this.type = set("cellGroupWrapperHeight", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def footerHeight(value: Double): this.type = set("footerHeight", value.asInstanceOf[js.Any])
    
    inline def groupHeaderHeight(value: Double): this.type = set("groupHeaderHeight", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def isColumnReordering(value: Boolean): this.type = set("isColumnReordering", value.asInstanceOf[js.Any])
    
    inline def isColumnResizing(value: Boolean): this.type = set("isColumnResizing", value.asInstanceOf[js.Any])
    
    inline def keyboardPageEnabled(value: Boolean): this.type = set("keyboardPageEnabled", value.asInstanceOf[js.Any])
    
    inline def keyboardScrollEnabled(value: Boolean): this.type = set("keyboardScrollEnabled", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def onColumnReorderEndCallback(value: /* event */ ColumnReorderEndEvent => Callback): this.type = set("onColumnReorderEndCallback", js.Any.fromFunction1((t0: /* event */ ColumnReorderEndEvent) => value(t0).runNow()))
    
    inline def onColumnResizeEndCallback(value: (/* newColumnWidth */ Double, /* columnKey */ String) => Callback): this.type = set("onColumnResizeEndCallback", js.Any.fromFunction2((t0: /* newColumnWidth */ Double, t1: /* columnKey */ String) => (value(t0, t1)).runNow()))
    
    inline def onContentHeightChange(value: /* newHeight */ Double => Callback): this.type = set("onContentHeightChange", js.Any.fromFunction1((t0: /* newHeight */ Double) => value(t0).runNow()))
    
    inline def onHorizontalScroll(value: /* scrollPos */ Double => Boolean): this.type = set("onHorizontalScroll", js.Any.fromFunction1(value))
    
    inline def onRowClick(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowClick", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowContextMenu(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowContextMenu", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowDoubleClick(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowDoubleClick", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowMouseDown(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowMouseDown", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowMouseEnter(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowMouseEnter", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowMouseLeave(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowMouseLeave", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowMouseUp(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowMouseUp", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowTouchEnd(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowTouchEnd", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowTouchMove(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowTouchMove", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowTouchStart(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowTouchStart", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable2.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onScrollEnd(value: (/* x */ Double, /* y */ Double) => Callback): this.type = set("onScrollEnd", js.Any.fromFunction2((t0: /* x */ Double, t1: /* y */ Double) => (value(t0, t1)).runNow()))
    
    inline def onScrollStart(value: (/* x */ Double, /* y */ Double) => Callback): this.type = set("onScrollStart", js.Any.fromFunction2((t0: /* x */ Double, t1: /* y */ Double) => (value(t0, t1)).runNow()))
    
    inline def onVerticalScroll(value: /* scrollPos */ Double => Boolean): this.type = set("onVerticalScroll", js.Any.fromFunction1(value))
    
    inline def overflowX(value: hidden | auto): this.type = set("overflowX", value.asInstanceOf[js.Any])
    
    inline def overflowY(value: hidden | auto): this.type = set("overflowY", value.asInstanceOf[js.Any])
    
    inline def ownerHeight(value: Double): this.type = set("ownerHeight", value.asInstanceOf[js.Any])
    
    inline def rowClassNameGetter(value: /* index */ Double => String): this.type = set("rowClassNameGetter", js.Any.fromFunction1(value))
    
    inline def rowExpanded(value: ElementOrFunc[RowProps]): this.type = set("rowExpanded", value.asInstanceOf[js.Any])
    
    inline def rowExpandedFunction1(value: RowProps => String | japgolly.scalajs.react.facade.React.Element): this.type = set("rowExpanded", js.Any.fromFunction1(value))
    
    inline def rowExpandedVdomElement(value: VdomElement): this.type = set("rowExpanded", value.rawElement.asInstanceOf[js.Any])
    
    inline def rowHeightGetter(value: /* index */ Double => Double): this.type = set("rowHeightGetter", js.Any.fromFunction1(value))
    
    inline def rowKeyGetter(value: /* index */ Double => String): this.type = set("rowKeyGetter", js.Any.fromFunction1(value))
    
    inline def scrollLeft(value: Double): this.type = set("scrollLeft", value.asInstanceOf[js.Any])
    
    inline def scrollToColumn(value: Double): this.type = set("scrollToColumn", value.asInstanceOf[js.Any])
    
    inline def scrollToRow(value: Double): this.type = set("scrollToRow", value.asInstanceOf[js.Any])
    
    inline def scrollTop(value: Double): this.type = set("scrollTop", value.asInstanceOf[js.Any])
    
    inline def showScrollbarX(value: Boolean): this.type = set("showScrollbarX", value.asInstanceOf[js.Any])
    
    inline def showScrollbarY(value: Boolean): this.type = set("showScrollbarY", value.asInstanceOf[js.Any])
    
    inline def stopScrollPropagation(value: Boolean): this.type = set("stopScrollPropagation", value.asInstanceOf[js.Any])
    
    inline def subRowHeight(value: Double): this.type = set("subRowHeight", value.asInstanceOf[js.Any])
    
    inline def subRowHeightGetter(value: /* index */ Double => Double): this.type = set("subRowHeightGetter", js.Any.fromFunction1(value))
    
    inline def touchScrollEnabled(value: Boolean): this.type = set("touchScrollEnabled", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
