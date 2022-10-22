package typingsJapgolly.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UiTooltipInitConfig extends StObject {
  
  var preventAnimation: Boolean
  
  var tooltipClass: String
}
object UiTooltipInitConfig {
  
  inline def apply(preventAnimation: Boolean, tooltipClass: String): UiTooltipInitConfig = {
    val __obj = js.Dynamic.literal(preventAnimation = preventAnimation.asInstanceOf[js.Any], tooltipClass = tooltipClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiTooltipInitConfig]
  }
  
  extension [Self <: UiTooltipInitConfig](x: Self) {
    
    inline def setPreventAnimation(value: Boolean): Self = StObject.set(x, "preventAnimation", value.asInstanceOf[js.Any])
    
    inline def setTooltipClass(value: String): Self = StObject.set(x, "tooltipClass", value.asInstanceOf[js.Any])
  }
}
