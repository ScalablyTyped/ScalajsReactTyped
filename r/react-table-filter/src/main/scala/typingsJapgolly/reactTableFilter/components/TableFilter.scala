package typingsJapgolly.reactTableFilter.components

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTableFilter.mod.TabfilterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableFilter {
  
  inline def apply(
    onFilterUpdate: (js.Array[String], js.Array[Any]) => js.Array[Any] | Unit,
    rows: String | js.Array[String] | StringDictionary[Boolean]
  ): Builder = {
    val __props = js.Dynamic.literal(onFilterUpdate = js.Any.fromFunction2(onFilterUpdate), rows = rows.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TabfilterProps]))
  }
  
  @JSImport("react-table-filter", "TableFilter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactTableFilter.mod.TableFilter] {
    
    inline def initialFilters(value: String | js.Array[String] | StringDictionary[Boolean]): this.type = set("initialFilters", value.asInstanceOf[js.Any])
    
    inline def initialFiltersVarargs(value: String*): this.type = set("initialFilters", js.Array(value*))
    
    inline def rowClass(value: String): this.type = set("rowClass", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabfilterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
