package typingsJapgolly.gestalt.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.Path
import typingsJapgolly.gestalt.gestaltStrings.brandPrimary
import typingsJapgolly.gestalt.gestaltStrings.dark
import typingsJapgolly.gestalt.gestaltStrings.default
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.info
import typingsJapgolly.gestalt.gestaltStrings.inverse
import typingsJapgolly.gestalt.gestaltStrings.light
import typingsJapgolly.gestalt.gestaltStrings.shopping
import typingsJapgolly.gestalt.gestaltStrings.subtle
import typingsJapgolly.gestalt.gestaltStrings.success
import typingsJapgolly.gestalt.gestaltStrings.warning
import typingsJapgolly.gestalt.mod.IconProps
import typingsJapgolly.gestalt.mod.Icons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  inline def apply(accessibilityLabel: String): Builder = {
    val __props = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  
  @JSImport("gestalt", "Icon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def color(
      value: default | subtle | success | error | warning | info | inverse | shopping | brandPrimary | light | dark
    ): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetSvgPath(value: Path): this.type = set("dangerouslySetSvgPath", value.asInstanceOf[js.Any])
    
    inline def icon(value: Icons): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def size(value: Double | String): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
