package typingsJapgolly.muiDatatables.components

import typingsJapgolly.muiDatatables.mod.MUIDataTableColumnDef
import typingsJapgolly.muiDatatables.mod.MUIDataTableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MUIDataTable {
  
  inline def apply(columns: js.Array[MUIDataTableColumnDef], data: js.Array[js.Object | (js.Array[Double | String])]): SharedBuilder_MUIDataTableProps936471268 = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    new SharedBuilder_MUIDataTableProps936471268(js.Array(this.component, __props.asInstanceOf[MUIDataTableProps]))
  }
  
  @JSImport("mui-datatables", "MUIDataTable")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MUIDataTableProps): SharedBuilder_MUIDataTableProps936471268 = new SharedBuilder_MUIDataTableProps936471268(js.Array(this.component, p.asInstanceOf[js.Any]))
}
