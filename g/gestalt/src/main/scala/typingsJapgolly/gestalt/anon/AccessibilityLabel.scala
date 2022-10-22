package typingsJapgolly.gestalt.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityLabel extends StObject {
  
  var accessibilityLabel: String
  
  def onDismiss(): Unit
}
object AccessibilityLabel {
  
  inline def apply(accessibilityLabel: String, onDismiss: Callback): AccessibilityLabel = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], onDismiss = onDismiss.toJsFn)
    __obj.asInstanceOf[AccessibilityLabel]
  }
  
  extension [Self <: AccessibilityLabel](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
  }
}
