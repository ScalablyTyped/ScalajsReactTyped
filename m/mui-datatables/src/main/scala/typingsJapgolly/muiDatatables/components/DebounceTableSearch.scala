package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.mod.DebouncedMUIDataTableSearch
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DebounceTableSearch {
  
  inline def apply(debounceWait: Double): Builder = {
    val __props = js.Dynamic.literal(debounceWait = debounceWait.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DebouncedMUIDataTableSearch]))
  }
  
  @JSImport("mui-datatables", "DebounceTableSearch")
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
  
  def withProps(p: DebouncedMUIDataTableSearch): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
