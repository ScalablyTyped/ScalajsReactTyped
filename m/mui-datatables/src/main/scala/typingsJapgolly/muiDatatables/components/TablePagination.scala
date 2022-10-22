package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import typingsJapgolly.muiDatatables.mod.MUIDataTablePagination
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TablePagination {
  
  inline def apply(
    changeRowsPerPage: Any => Any,
    count: Double,
    options: MUIDataTableOptions,
    page: Double,
    rowsPerPage: Double
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(changeRowsPerPage = js.Any.fromFunction1(changeRowsPerPage), count = count.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], rowsPerPage = rowsPerPage.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[MUIDataTablePagination]))
  }
  
  @JSImport("mui-datatables", "TablePagination")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MUIDataTablePagination): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
