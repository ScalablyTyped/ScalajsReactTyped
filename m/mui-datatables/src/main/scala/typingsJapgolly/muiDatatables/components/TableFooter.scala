package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.MUIDataTableFooter
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableFooter {
  
  @JSImport("mui-datatables", "TableFooter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def changePage(value: /* e */ Any => Any): this.type = set("changePage", js.Any.fromFunction1(value))
    
    inline def changeRowsPerPage(value: /* e */ Any => Any): this.type = set("changeRowsPerPage", js.Any.fromFunction1(value))
    
    inline def options(value: MUIDataTableOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    inline def rowCount(value: Double): this.type = set("rowCount", value.asInstanceOf[js.Any])
    
    inline def rowsPerPage(value: Double): this.type = set("rowsPerPage", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableFooter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MUIDataTableFooter): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
