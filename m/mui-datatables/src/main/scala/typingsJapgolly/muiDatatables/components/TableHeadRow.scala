package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.MUIDataTableHeadRow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHeadRow {
  
  @JSImport("mui-datatables", "TableHeadRow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableHeadRow.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MUIDataTableHeadRow): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
