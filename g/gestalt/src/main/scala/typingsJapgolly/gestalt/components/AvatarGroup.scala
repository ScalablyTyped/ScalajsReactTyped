package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.DangerouslydangerouslyDisableOnNavigation
import typingsJapgolly.gestalt.anon.Event
import typingsJapgolly.gestalt.anon.Name
import typingsJapgolly.gestalt.gestaltStrings.button
import typingsJapgolly.gestalt.gestaltStrings.fit
import typingsJapgolly.gestalt.gestaltStrings.link
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.gestaltStrings.xs
import typingsJapgolly.gestalt.mod.AvatarGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AvatarGroup {
  
  inline def apply(accessibilityLabel: String, collaborators: js.Array[Name]): Builder = {
    val __props = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AvatarGroupProps]))
  }
  
  @JSImport("gestalt", "AvatarGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accessibilityControls(value: String): this.type = set("accessibilityControls", value.asInstanceOf[js.Any])
    
    inline def accessibilityExpanded(value: Boolean): this.type = set("accessibilityExpanded", value.asInstanceOf[js.Any])
    
    inline def accessibilityHaspopup(value: Boolean): this.type = set("accessibilityHaspopup", value.asInstanceOf[js.Any])
    
    inline def addCollaborators(value: Boolean): this.type = set("addCollaborators", value.asInstanceOf[js.Any])
    
    inline def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: /* arg */ DangerouslydangerouslyDisableOnNavigation & (Event[
          (ReactMouseEventFrom[(HTMLAnchorElement | HTMLDivElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLDivElement) & Element])
        ]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction1((t0: /* arg */ DangerouslydangerouslyDisableOnNavigation & (Event[
          (ReactMouseEventFrom[(HTMLAnchorElement | HTMLDivElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLDivElement) & Element])
        ])) => value(t0).runNow()))
    
    inline def role(value: button | link): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def size(value: xs | sm | md | fit): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
