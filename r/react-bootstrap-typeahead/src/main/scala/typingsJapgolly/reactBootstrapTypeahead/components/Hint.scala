package typingsJapgolly.reactBootstrapTypeahead.components

import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBootstrapTypeahead.mod.HintProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Hint {
  
  @JSImport("react-bootstrap-typeahead", "Hint")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrapTypeahead.mod.Hint] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def shouldSelect(value: (/* shouldSelect */ Boolean, /* e */ ReactKeyboardEventFrom[HTMLInputElement]) => Boolean): this.type = set("shouldSelect", js.Any.fromFunction2(value))
  }
  
  implicit def make(companion: Hint.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HintProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
