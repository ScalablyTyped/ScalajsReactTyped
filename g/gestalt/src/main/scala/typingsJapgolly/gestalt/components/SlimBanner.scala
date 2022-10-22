package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.Target
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.errorBare
import typingsJapgolly.gestalt.gestaltStrings.info
import typingsJapgolly.gestalt.gestaltStrings.infoBare
import typingsJapgolly.gestalt.gestaltStrings.neutral
import typingsJapgolly.gestalt.gestaltStrings.recommendation
import typingsJapgolly.gestalt.gestaltStrings.success
import typingsJapgolly.gestalt.gestaltStrings.successBare
import typingsJapgolly.gestalt.gestaltStrings.warning
import typingsJapgolly.gestalt.gestaltStrings.warningBare
import typingsJapgolly.gestalt.mod.SlimBannerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SlimBanner {
  
  inline def apply(message: String): Builder = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SlimBannerProps]))
  }
  
  @JSImport("gestalt", "SlimBanner")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def helperLink(value: Target): this.type = set("helperLink", value.asInstanceOf[js.Any])
    
    inline def iconAccessibilityLabel(value: String): this.type = set("iconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def `type`(
      value: neutral | error | info | warning | success | errorBare | infoBare | warningBare | successBare | recommendation
    ): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SlimBannerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
