package typingsJapgolly.fixedDataTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fixedDataTable.mod.TableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Table {
  
  inline def apply(rowHeight: Double, rowsCount: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(rowHeight = rowHeight.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableProps]))
  }
  
  @JSImport("fixed-data-table", "Table")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.fixedDataTable.mod.Table] {
    
    inline def footerHeight(value: Double): this.type = set("footerHeight", value.asInstanceOf[js.Any])
    
    inline def groupHeaderHeight(value: Double): this.type = set("groupHeaderHeight", value.asInstanceOf[js.Any])
    
    inline def headerHeight(value: Double): this.type = set("headerHeight", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def isColumnResizing(value: Boolean): this.type = set("isColumnResizing", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: Double): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def onColumnResizeEndCallback(value: (/* newColumnWidth */ Double, /* columnKey */ String) => Callback): this.type = set("onColumnResizeEndCallback", js.Any.fromFunction2((t0: /* newColumnWidth */ Double, t1: /* columnKey */ String) => (value(t0, t1)).runNow()))
    
    inline def onContentHeightChange(value: /* newHeight */ Double => Callback): this.type = set("onContentHeightChange", js.Any.fromFunction1((t0: /* newHeight */ Double) => value(t0).runNow()))
    
    inline def onRowClick(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowClick", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowDoubleClick(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowDoubleClick", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowMouseDown(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowMouseDown", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowMouseEnter(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowMouseEnter", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onRowMouseLeave(
      value: (/* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table & Element], /* rowIndex */ Double) => Callback
    ): this.type = set("onRowMouseLeave", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[typingsJapgolly.fixedDataTable.mod.Table & Element], t1: /* rowIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onScrollEnd(value: (/* x */ Double, /* y */ Double) => Callback): this.type = set("onScrollEnd", js.Any.fromFunction2((t0: /* x */ Double, t1: /* y */ Double) => (value(t0, t1)).runNow()))
    
    inline def onScrollStart(value: (/* x */ Double, /* y */ Double) => Callback): this.type = set("onScrollStart", js.Any.fromFunction2((t0: /* x */ Double, t1: /* y */ Double) => (value(t0, t1)).runNow()))
    
    inline def overflowX(value: String): this.type = set("overflowX", value.asInstanceOf[js.Any])
    
    inline def overflowY(value: String): this.type = set("overflowY", value.asInstanceOf[js.Any])
    
    inline def ownerHeight(value: Double): this.type = set("ownerHeight", value.asInstanceOf[js.Any])
    
    inline def rowClassNameGetter(value: /* index */ Double => String): this.type = set("rowClassNameGetter", js.Any.fromFunction1(value))
    
    inline def rowHeightGetter(value: /* index */ Double => Double): this.type = set("rowHeightGetter", js.Any.fromFunction1(value))
    
    inline def scrollLeft(value: Double): this.type = set("scrollLeft", value.asInstanceOf[js.Any])
    
    inline def scrollToColumn(value: Double): this.type = set("scrollToColumn", value.asInstanceOf[js.Any])
    
    inline def scrollToRow(value: Double): this.type = set("scrollToRow", value.asInstanceOf[js.Any])
    
    inline def scrollTop(value: Double): this.type = set("scrollTop", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
