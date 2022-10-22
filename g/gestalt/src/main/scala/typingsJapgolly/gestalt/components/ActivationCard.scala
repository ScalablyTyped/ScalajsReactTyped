package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.AccessibilityLabel
import typingsJapgolly.gestalt.anon.Href
import typingsJapgolly.gestalt.gestaltStrings.complete
import typingsJapgolly.gestalt.gestaltStrings.needsAttention
import typingsJapgolly.gestalt.gestaltStrings.notStarted
import typingsJapgolly.gestalt.gestaltStrings.pending
import typingsJapgolly.gestalt.mod.ActivationCardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActivationCard {
  
  inline def apply(
    message: String,
    status: notStarted | pending | needsAttention | complete,
    statusMessage: String,
    title: String
  ): Builder = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ActivationCardProps]))
  }
  
  @JSImport("gestalt", "ActivationCard")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dismissButton(value: AccessibilityLabel): this.type = set("dismissButton", value.asInstanceOf[js.Any])
    
    inline def link(value: Href): this.type = set("link", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ActivationCardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
