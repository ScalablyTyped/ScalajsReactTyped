package typingsJapgolly.reactOutsideClickHandler.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactOutsideClickHandler.mod.Props
import typingsJapgolly.reactOutsideClickHandler.mod.default
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typingsJapgolly.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactOutsideClickHandler {
  
  inline def apply(onOutsideClick: MouseEvent => Callback): Builder = {
    val __props = js.Dynamic.literal(onOutsideClick = js.Any.fromFunction1((t0: MouseEvent) => onOutsideClick(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-outside-click-handler", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def display(value: block | flex | `inline` | `inline-block` | contents): this.type = set("display", value.asInstanceOf[js.Any])
    
    inline def useCapture(value: Boolean): this.type = set("useCapture", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
