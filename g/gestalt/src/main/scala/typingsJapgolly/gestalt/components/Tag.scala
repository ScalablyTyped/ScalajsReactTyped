package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.Event
import typingsJapgolly.gestalt.mod.TagProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tag {
  
  inline def apply(text: String): Builder = {
    val __props = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TagProps]))
  }
  
  @JSImport("gestalt", "Tag")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    inline def onRemove(value: /* arg */ js.Object & Event[ReactMouseEventFrom[HTMLButtonElement]] => Callback): this.type = set("onRemove", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactMouseEventFrom[HTMLButtonElement]]) => value(t0).runNow()))
    
    inline def removeIconAccessibilityLabel(value: String): this.type = set("removeIconAccessibilityLabel", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TagProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
