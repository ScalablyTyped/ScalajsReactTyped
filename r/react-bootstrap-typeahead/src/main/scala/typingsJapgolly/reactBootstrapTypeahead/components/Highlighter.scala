package typingsJapgolly.reactBootstrapTypeahead.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrapTypeahead.mod.HighligherProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Highlighter {
  
  inline def apply(search: String): Builder = {
    val __props = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HighligherProps]))
  }
  
  @JSImport("react-bootstrap-typeahead", "Highlighter")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrapTypeahead.mod.Highlighter] {
    
    inline def highlightClassName(value: String): this.type = set("highlightClassName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HighligherProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
