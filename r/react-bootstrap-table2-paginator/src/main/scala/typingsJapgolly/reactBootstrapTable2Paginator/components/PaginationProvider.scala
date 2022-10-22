package typingsJapgolly.reactBootstrapTable2Paginator.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrapTable2Paginator.anon.Children
import typingsJapgolly.reactBootstrapTable2Paginator.anon.PaginationProps
import typingsJapgolly.reactBootstrapTable2Paginator.mod.PaginationCtxOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PaginationProvider {
  
  inline def apply(children: PaginationProps => Element | Null): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("react-bootstrap-table2-paginator", "PaginationProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def pagination(value: PaginationCtxOptions): this.type = set("pagination", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
