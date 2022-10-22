package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.anon.Data
import typingsJapgolly.muiDatatables.mod.DisplayData
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import typingsJapgolly.muiDatatables.mod.MUIDataTableToolbarSelect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableToolbarSelect {
  
  inline def apply(options: MUIDataTableOptions): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableToolbarSelect]))
  }
  
  @JSImport("mui-datatables", "TableToolbarSelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def displayData(value: DisplayData): this.type = set("displayData", value.asInstanceOf[js.Any])
    
    inline def displayDataVarargs(value: Data*): this.type = set("displayData", js.Array(value*))
    
    inline def onRowsDelete(value: /* args */ Any => Any): this.type = set("onRowsDelete", js.Any.fromFunction1(value))
    
    inline def rowSelected(value: Boolean): this.type = set("rowSelected", value.asInstanceOf[js.Any])
    
    inline def selectRowUpdate(value: /* args */ Any => Any): this.type = set("selectRowUpdate", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableToolbarSelect): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
