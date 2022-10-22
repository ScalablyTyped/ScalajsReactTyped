package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.EventSyntheticEvent
import typingsJapgolly.gestalt.mod.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  @JSImport("gestalt", "Card")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def image(value: VdomNode): this.type = set("image", value.rawNode.asInstanceOf[js.Any])
    
    inline def imageNull: this.type = set("image", null)
    
    inline def imageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("image", js.Array(value*))
    
    inline def imageVdomElement(value: VdomElement): this.type = set("image", value.rawElement.asInstanceOf[js.Any])
    
    inline def onMouseEnter(value: /* args */ EventSyntheticEvent => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: /* args */ EventSyntheticEvent) => value(t0).runNow()))
    
    inline def onMouseLeave(value: /* args */ EventSyntheticEvent => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: /* args */ EventSyntheticEvent) => value(t0).runNow()))
  }
  
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
