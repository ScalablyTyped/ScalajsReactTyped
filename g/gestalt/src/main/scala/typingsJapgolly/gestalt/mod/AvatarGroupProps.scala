package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.gestalt.anon.DangerouslydangerouslyDisableOnNavigation
import typingsJapgolly.gestalt.anon.Event
import typingsJapgolly.gestalt.anon.Name
import typingsJapgolly.gestalt.gestaltStrings.button
import typingsJapgolly.gestalt.gestaltStrings.fit
import typingsJapgolly.gestalt.gestaltStrings.link
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.gestaltStrings.xs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvatarGroupProps extends StObject {
  
  var accessibilityControls: js.UndefOr[String] = js.undefined
  
  var accessibilityExpanded: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHaspopup: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: String
  
  var addCollaborators: js.UndefOr[Boolean] = js.undefined
  
  var collaborators: js.Array[Name]
  
  var href: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[OnTapType] = js.undefined
  
  var role: js.UndefOr[button | link] = js.undefined
  
  var size: js.UndefOr[xs | sm | md | fit] = js.undefined
}
object AvatarGroupProps {
  
  inline def apply(accessibilityLabel: String, collaborators: js.Array[Name]): AvatarGroupProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], collaborators = collaborators.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarGroupProps]
  }
  
  extension [Self <: AvatarGroupProps](x: Self) {
    
    inline def setAccessibilityControls(value: String): Self = StObject.set(x, "accessibilityControls", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityControlsUndefined: Self = StObject.set(x, "accessibilityControls", js.undefined)
    
    inline def setAccessibilityExpanded(value: Boolean): Self = StObject.set(x, "accessibilityExpanded", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityExpandedUndefined: Self = StObject.set(x, "accessibilityExpanded", js.undefined)
    
    inline def setAccessibilityHaspopup(value: Boolean): Self = StObject.set(x, "accessibilityHaspopup", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHaspopupUndefined: Self = StObject.set(x, "accessibilityHaspopup", js.undefined)
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAddCollaborators(value: Boolean): Self = StObject.set(x, "addCollaborators", value.asInstanceOf[js.Any])
    
    inline def setAddCollaboratorsUndefined: Self = StObject.set(x, "addCollaborators", js.undefined)
    
    inline def setCollaborators(value: js.Array[Name]): Self = StObject.set(x, "collaborators", value.asInstanceOf[js.Any])
    
    inline def setCollaboratorsVarargs(value: Name*): Self = StObject.set(x, "collaborators", js.Array(value*))
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setOnClick(
      value: /* arg */ DangerouslydangerouslyDisableOnNavigation & (Event[
          (ReactMouseEventFrom[(HTMLAnchorElement | HTMLDivElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLDivElement) & Element])
        ]) => Callback
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* arg */ DangerouslydangerouslyDisableOnNavigation & (Event[
          (ReactMouseEventFrom[(HTMLAnchorElement | HTMLDivElement) & Element]) | (ReactKeyboardEventFrom[(HTMLAnchorElement | HTMLDivElement) & Element])
        ])) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setRole(value: button | link): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSize(value: xs | sm | md | fit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
