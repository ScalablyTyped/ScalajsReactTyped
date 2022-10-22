package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.MUIDataTableColumnDef
import typingsJapgolly.muiDatatables.mod.MUIDataTableHead
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import typingsJapgolly.muiDatatables.mod.MUIDataTableStateRows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHead {
  
  inline def apply(columnOrder: js.Array[Double]): Builder = {
    val __props = js.Dynamic.literal(columnOrder = columnOrder.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableHead]))
  }
  
  @JSImport("mui-datatables", "TableHead")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeColumn(value: Any): this.type = set("activeColumn", value.asInstanceOf[js.Any])
    
    inline def areAllRowsExpanded(value: CallbackTo[Boolean]): this.type = set("areAllRowsExpanded", value.toJsFn)
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def columns(value: js.Array[MUIDataTableColumnDef]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def columnsVarargs(value: MUIDataTableColumnDef*): this.type = set("columns", js.Array(value*))
    
    inline def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[Any]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: Any*): this.type = set("data", js.Array(value*))
    
    inline def draggableHeadCellRefs(value: js.Object): this.type = set("draggableHeadCellRefs", value.asInstanceOf[js.Any])
    
    inline def expandedRows(value: MUIDataTableStateRows): this.type = set("expandedRows", value.asInstanceOf[js.Any])
    
    inline def options(value: MUIDataTableOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    inline def rowsPerPage(value: Double): this.type = set("rowsPerPage", value.asInstanceOf[js.Any])
    
    inline def selectRowUpdate(value: /* repeated */ Any => Any): this.type = set("selectRowUpdate", js.Any.fromFunction1(value))
    
    inline def selectedRows(value: MUIDataTableStateRows): this.type = set("selectedRows", value.asInstanceOf[js.Any])
    
    inline def setCellRef(value: /* repeated */ Any => Any): this.type = set("setCellRef", js.Any.fromFunction1(value))
    
    inline def tableRef(value: CallbackTo[Any]): this.type = set("tableRef", value.toJsFn)
    
    inline def tabledId(value: String): this.type = set("tabledId", value.asInstanceOf[js.Any])
    
    inline def timers(value: js.Object): this.type = set("timers", value.asInstanceOf[js.Any])
    
    inline def toggleAllExpandableRows(value: CallbackTo[Any]): this.type = set("toggleAllExpandableRows", value.toJsFn)
    
    inline def toggleSort(value: /* repeated */ Any => Any): this.type = set("toggleSort", js.Any.fromFunction1(value))
    
    inline def updateColumnOrder(value: /* repeated */ Any => Any): this.type = set("updateColumnOrder", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableHead): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
