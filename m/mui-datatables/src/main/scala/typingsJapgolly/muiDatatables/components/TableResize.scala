package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import typingsJapgolly.muiDatatables.mod.MUIDataTableResize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableResize {
  
  @JSImport("mui-datatables", "TableResize")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def options(value: MUIDataTableOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def rowSelected(value: Boolean): this.type = set("rowSelected", value.asInstanceOf[js.Any])
    
    inline def setResizeable(value: /* args */ Any => Any): this.type = set("setResizeable", js.Any.fromFunction1(value))
    
    inline def updateDividers(value: /* args */ Any => Any): this.type = set("updateDividers", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: TableResize.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MUIDataTableResize): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
