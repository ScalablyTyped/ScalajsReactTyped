package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.MUIDataTableHeadCell
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import typingsJapgolly.muiDatatables.mod.MUISortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHeadCell {
  
  inline def apply(hint: String, options: MUIDataTableOptions, sort: Boolean, toggleSort: Any => Any): Builder = {
    val __props = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], toggleSort = js.Any.fromFunction1(toggleSort))
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableHeadCell]))
  }
  
  @JSImport("mui-datatables", "TableHeadCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def sortOrder(value: MUISortOptions): this.type = set("sortOrder", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableHeadCell): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
