package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.AccessibilityLabel
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.info
import typingsJapgolly.gestalt.gestaltStrings.recommendation
import typingsJapgolly.gestalt.gestaltStrings.success
import typingsJapgolly.gestalt.gestaltStrings.warning
import typingsJapgolly.gestalt.mod.ActionData
import typingsJapgolly.gestalt.mod.CalloutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Callout {
  
  inline def apply(
    iconAccessibilityLabel: String,
    message: String,
    `type`: error | info | recommendation | success | warning
  ): Builder = {
    val __props = js.Dynamic.literal(iconAccessibilityLabel = iconAccessibilityLabel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CalloutProps]))
  }
  
  @JSImport("gestalt", "Callout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dismissButton(value: AccessibilityLabel): this.type = set("dismissButton", value.asInstanceOf[js.Any])
    
    inline def primaryAction(value: ActionData): this.type = set("primaryAction", value.asInstanceOf[js.Any])
    
    inline def secondaryAction(value: ActionData): this.type = set("secondaryAction", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CalloutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
