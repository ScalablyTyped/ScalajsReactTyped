package typingsJapgolly.gestalt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityLabelValue extends StObject {
  
  var accessibilityLabel: String
  
  var value: Double
}
object AccessibilityLabelValue {
  
  inline def apply(accessibilityLabel: String, value: Double): AccessibilityLabelValue = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityLabelValue]
  }
  
  extension [Self <: AccessibilityLabelValue](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
