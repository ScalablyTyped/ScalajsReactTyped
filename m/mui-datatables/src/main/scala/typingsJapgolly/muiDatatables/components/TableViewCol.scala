package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.MUIDataTableViewCol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableViewCol {
  
  inline def apply(columns: js.Array[Any], `object`: js.Object, onColumnUpdate: Any => Any): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], onColumnUpdate = js.Any.fromFunction1(onColumnUpdate))
    __props.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableViewCol]))
  }
  
  @JSImport("mui-datatables", "TableViewCol")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableViewCol): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
