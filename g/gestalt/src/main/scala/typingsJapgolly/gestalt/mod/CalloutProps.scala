package typingsJapgolly.gestalt.mod

import typingsJapgolly.gestalt.anon.AccessibilityLabel
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.info
import typingsJapgolly.gestalt.gestaltStrings.recommendation
import typingsJapgolly.gestalt.gestaltStrings.success
import typingsJapgolly.gestalt.gestaltStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalloutProps extends StObject {
  
  var dismissButton: js.UndefOr[AccessibilityLabel] = js.undefined
  
  var iconAccessibilityLabel: String
  
  var message: String
  
  var primaryAction: js.UndefOr[ActionData] = js.undefined
  
  var secondaryAction: js.UndefOr[ActionData] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: error | info | recommendation | success | warning
}
object CalloutProps {
  
  inline def apply(
    iconAccessibilityLabel: String,
    message: String,
    `type`: error | info | recommendation | success | warning
  ): CalloutProps = {
    val __obj = js.Dynamic.literal(iconAccessibilityLabel = iconAccessibilityLabel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutProps]
  }
  
  extension [Self <: CalloutProps](x: Self) {
    
    inline def setDismissButton(value: AccessibilityLabel): Self = StObject.set(x, "dismissButton", value.asInstanceOf[js.Any])
    
    inline def setDismissButtonUndefined: Self = StObject.set(x, "dismissButton", js.undefined)
    
    inline def setIconAccessibilityLabel(value: String): Self = StObject.set(x, "iconAccessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPrimaryAction(value: ActionData): Self = StObject.set(x, "primaryAction", value.asInstanceOf[js.Any])
    
    inline def setPrimaryActionUndefined: Self = StObject.set(x, "primaryAction", js.undefined)
    
    inline def setSecondaryAction(value: ActionData): Self = StObject.set(x, "secondaryAction", value.asInstanceOf[js.Any])
    
    inline def setSecondaryActionUndefined: Self = StObject.set(x, "secondaryAction", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: error | info | recommendation | success | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
