package typingsJapgolly.gestalt.mod

import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpinnerProps extends StObject {
  
  var accessibilityLabel: String
  
  var delay: js.UndefOr[Boolean] = js.undefined
  
  var show: Boolean
  
  var size: js.UndefOr[sm | md] = js.undefined
}
object SpinnerProps {
  
  inline def apply(accessibilityLabel: String, show: Boolean): SpinnerProps = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerProps]
  }
  
  extension [Self <: SpinnerProps](x: Self) {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Boolean): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setSize(value: sm | md): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
