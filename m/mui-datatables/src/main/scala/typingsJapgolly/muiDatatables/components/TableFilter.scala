package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.MUIDataTableFilter
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableFilter {
  
  inline def apply(filterData: js.Array[Any], options: MUIDataTableOptions): Builder = {
    val __props = js.Dynamic.literal(filterData = filterData.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableFilter]))
  }
  
  @JSImport("mui-datatables", "TableFilter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def filterList(value: js.Array[js.Array[String]]): this.type = set("filterList", value.asInstanceOf[js.Any])
    
    inline def filterListVarargs(value: js.Array[String]*): this.type = set("filterList", js.Array(value*))
    
    inline def onFilterReset(value: /* args */ Any => Any): this.type = set("onFilterReset", js.Any.fromFunction1(value))
    
    inline def onFilterUpdate(value: /* args */ Any => Any): this.type = set("onFilterUpdate", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MUIDataTableFilter): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
