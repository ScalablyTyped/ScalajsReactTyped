package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.dataTableColumnCategoricalMod.CategoricalFilterProps
import typingsJapgolly.baseui.dataTableColumnCategoricalMod.FilterParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CategoricalFilter {
  
  inline def apply(close: Callback, data: js.Array[String], setFilter: FilterParameters => Callback): Builder = {
    val __props = js.Dynamic.literal(close = close.toJsFn, data = data.asInstanceOf[js.Any], setFilter = js.Any.fromFunction1((t0: FilterParameters) => setFilter(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[CategoricalFilterProps]))
  }
  
  @JSImport("baseui/data-table/column-categorical", "CategoricalFilter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def filterParams(value: FilterParameters): this.type = set("filterParams", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CategoricalFilterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
