package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.info
import typingsJapgolly.gestalt.mod.BadgeObject
import typingsJapgolly.gestalt.mod.Icons
import typingsJapgolly.gestalt.mod.ModuleProps
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Module {
  
  inline def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[ModuleProps]]))
  }
  
  @JSImport("gestalt", "Module")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def badge(value: BadgeObject): this.type = set("badge", value.asInstanceOf[js.Any])
    
    inline def icon(value: Icons): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconAccessibilityLabel(value: String): this.type = set("iconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def iconButton(value: VdomElement): this.type = set("iconButton", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def `type`(value: error | info): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[ModuleProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
