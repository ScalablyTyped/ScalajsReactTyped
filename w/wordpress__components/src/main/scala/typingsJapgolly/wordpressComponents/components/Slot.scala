package typingsJapgolly.wordpressComponents.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressComponents.slotFillSlotMod.Slot.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slot {
  
  @JSImport("@wordpress/components", "Slot")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def bubblesVirtually(value: Boolean): this.type = set("bubblesVirtually", value.asInstanceOf[js.Any])
    
    inline def children(value: /* fills */ js.Array[js.Array[Element]] => Element | Null): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Slot.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
