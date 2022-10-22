package typingsJapgolly.griddleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.griddleReact.mod.components.RowDefinitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RowDefinition {
  
  @JSImport("griddle-react", "RowDefinition")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.griddleReact.mod.RowDefinition] {
    
    inline def childColumnName(value: String): this.type = set("childColumnName", value.asInstanceOf[js.Any])
    
    inline def cssClassName(value: String | (js.Function1[/* props */ Any, String])): this.type = set("cssClassName", value.asInstanceOf[js.Any])
    
    inline def cssClassNameFunction1(value: /* props */ Any => String): this.type = set("cssClassName", js.Any.fromFunction1(value))
    
    inline def rowKey(value: String): this.type = set("rowKey", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RowDefinition.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RowDefinitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
