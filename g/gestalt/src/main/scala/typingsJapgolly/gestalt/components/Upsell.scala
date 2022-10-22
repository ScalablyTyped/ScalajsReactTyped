package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.AccessibilityLabel
import typingsJapgolly.gestalt.anon.Component
import typingsJapgolly.gestalt.mod.ActionData
import typingsJapgolly.gestalt.mod.UpsellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Upsell {
  
  inline def apply(message: String): Builder = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[UpsellProps]))
  }
  
  @JSImport("gestalt", "Upsell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dismissButton(value: AccessibilityLabel): this.type = set("dismissButton", value.asInstanceOf[js.Any])
    
    inline def imageData(value: Component): this.type = set("imageData", value.asInstanceOf[js.Any])
    
    inline def primaryAction(value: ActionData): this.type = set("primaryAction", value.asInstanceOf[js.Any])
    
    inline def secondaryAction(value: ActionData): this.type = set("secondaryAction", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: UpsellProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
