package typingsJapgolly.ionicCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaLabel extends StObject {
  
  var ariaLabel: String | Null
  
  var ariaSelected: String | Null
  
  var disabled: Boolean
  
  var isActive: Boolean
  
  var isToday: Boolean
  
  var text: String | Null
}
object AriaLabel {
  
  inline def apply(disabled: Boolean, isActive: Boolean, isToday: Boolean): AriaLabel = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], ariaLabel = null, ariaSelected = null, text = null)
    __obj.asInstanceOf[AriaLabel]
  }
  
  extension [Self <: AriaLabel](x: Self) {
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelNull: Self = StObject.set(x, "ariaLabel", null)
    
    inline def setAriaSelected(value: String): Self = StObject.set(x, "ariaSelected", value.asInstanceOf[js.Any])
    
    inline def setAriaSelectedNull: Self = StObject.set(x, "ariaSelected", null)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
  }
}
