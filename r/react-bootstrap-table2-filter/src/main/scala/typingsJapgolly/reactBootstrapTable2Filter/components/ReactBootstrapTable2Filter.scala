package typingsJapgolly.reactBootstrapTable2Filter.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrapTable2Filter.mod.FilterFactoryProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactBootstrapTable2Filter {
  
  @JSImport("react-bootstrap-table2-filter", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def afterFilter(value: (/* newResult */ js.Array[Any], /* newFilters */ js.UndefOr[js.Array[Any]]) => Callback): this.type = set("afterFilter", js.Any.fromFunction2((t0: /* newResult */ js.Array[Any], t1: /* newFilters */ js.UndefOr[js.Array[Any]]) => (value(t0, t1)).runNow()))
  }
  
  implicit def make(companion: ReactBootstrapTable2Filter.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FilterFactoryProps[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
