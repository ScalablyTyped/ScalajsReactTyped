package typingsJapgolly.muiDatatables.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.anon.DataIndex
import typingsJapgolly.muiDatatables.mod.MUIDataTableBody
import typingsJapgolly.muiDatatables.mod.MUIDataTableColumnDef
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import typingsJapgolly.muiDatatables.mod.MUIDataTableStateRows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableBody {
  
  inline def apply(
    classes: js.Object,
    columns: js.Array[MUIDataTableColumnDef],
    count: Double,
    data: js.Array[js.Object | (js.Array[Double | String])],
    options: MUIDataTableOptions
  ): Builder = {
    val __props = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableBody]))
  }
  
  @JSImport("mui-datatables", "TableBody")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def columnOrder(value: js.Array[Double]): this.type = set("columnOrder", value.asInstanceOf[js.Any])
    
    inline def columnOrderVarargs(value: Double*): this.type = set("columnOrder", js.Array(value*))
    
    inline def expandedRows(value: MUIDataTableStateRows): this.type = set("expandedRows", value.asInstanceOf[js.Any])
    
    inline def filterList(value: js.Array[js.Array[String]]): this.type = set("filterList", value.asInstanceOf[js.Any])
    
    inline def filterListVarargs(value: js.Array[String]*): this.type = set("filterList", js.Array(value*))
    
    inline def onRowClick(value: (/* rowData */ js.Array[String], /* rowMeta */ DataIndex) => Callback): this.type = set("onRowClick", js.Any.fromFunction2((t0: /* rowData */ js.Array[String], t1: /* rowMeta */ DataIndex) => (value(t0, t1)).runNow()))
    
    inline def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    inline def previousSelectedRow(value: Double): this.type = set("previousSelectedRow", value.asInstanceOf[js.Any])
    
    inline def previousSelectedRowNull: this.type = set("previousSelectedRow", null)
    
    inline def rowsPerPage(value: Double): this.type = set("rowsPerPage", value.asInstanceOf[js.Any])
    
    inline def searchText(value: String): this.type = set("searchText", value.asInstanceOf[js.Any])
    
    inline def selectRowUpdate(value: /* args */ Any => Any): this.type = set("selectRowUpdate", js.Any.fromFunction1(value))
    
    inline def selectedRows(value: MUIDataTableStateRows): this.type = set("selectedRows", value.asInstanceOf[js.Any])
    
    inline def tableId(value: String): this.type = set("tableId", value.asInstanceOf[js.Any])
    
    inline def toggleExpandRow(value: /* args */ Any => Any): this.type = set("toggleExpandRow", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableBody): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
