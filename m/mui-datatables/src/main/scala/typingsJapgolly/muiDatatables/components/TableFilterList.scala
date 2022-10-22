package typingsJapgolly.muiDatatables.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.muiDatatables.anon.FilterType
import typingsJapgolly.muiDatatables.mod.MUIDataTableFilterList
import typingsJapgolly.muiDatatables.mod.MUIDataTableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableFilterList {
  
  inline def apply(filterList: js.Array[js.Array[String]], options: MUIDataTableOptions): Builder = {
    val __props = js.Dynamic.literal(filterList = filterList.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MUIDataTableFilterList]))
  }
  
  @JSImport("mui-datatables", "TableFilterList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def classes(value: js.Object): this.type = set("classes", value.asInstanceOf[js.Any])
    
    inline def columnNames(value: js.Array[FilterType]): this.type = set("columnNames", value.asInstanceOf[js.Any])
    
    inline def columnNamesVarargs(value: FilterType*): this.type = set("columnNames", js.Array(value*))
    
    inline def customFilterListUpdate(value: js.Array[Any]): this.type = set("customFilterListUpdate", value.asInstanceOf[js.Any])
    
    inline def customFilterListUpdateVarargs(value: Any*): this.type = set("customFilterListUpdate", js.Array(value*))
    
    inline def filterListRenderers(value: /* e */ Any => js.Array[Any]): this.type = set("filterListRenderers", js.Any.fromFunction1(value))
    
    inline def filterUpdate(value: /* args */ Any => Any): this.type = set("filterUpdate", js.Any.fromFunction1(value))
    
    inline def serverSideFilterList(value: Any): this.type = set("serverSideFilterList", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MUIDataTableFilterList): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
