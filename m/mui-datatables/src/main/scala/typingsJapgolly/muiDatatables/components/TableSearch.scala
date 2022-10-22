package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import typingsJapgolly.muiDatatables.mod.MUIDataTableSearch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableSearch {
  
  @JSImport("mui-datatables", "TableSearch")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def onHide(value: /* args */ Any => Any): this.type = set("onHide", js.Any.fromFunction1(value))
    
    inline def onSearch(value: /* args */ Any => Any): this.type = set("onSearch", js.Any.fromFunction1(value))
    
    inline def options(value: MUIDataTableOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def searchText(value: String): this.type = set("searchText", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableSearch.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MUIDataTableSearch): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
