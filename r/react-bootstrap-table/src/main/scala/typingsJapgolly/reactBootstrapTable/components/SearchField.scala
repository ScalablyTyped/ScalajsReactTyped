package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrapTable.mod.SearchFieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchField {
  
  @JSImport("react-bootstrap-table", "SearchField")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrapTable.mod.SearchField] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def onKeyUp(value: /* e */ ReactKeyboardEventFrom[Any & Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: /* e */ ReactKeyboardEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SearchField.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SearchFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
