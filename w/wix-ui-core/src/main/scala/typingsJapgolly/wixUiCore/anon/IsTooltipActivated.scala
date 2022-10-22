package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsTooltipActivated extends StObject {
  
  var Tooltip: Any
  
  var isTooltipActivated: Boolean
  
  var tooltipStyles: Any
}
object IsTooltipActivated {
  
  inline def apply(Tooltip: Any, isTooltipActivated: Boolean, tooltipStyles: Any): IsTooltipActivated = {
    val __obj = js.Dynamic.literal(Tooltip = Tooltip.asInstanceOf[js.Any], isTooltipActivated = isTooltipActivated.asInstanceOf[js.Any], tooltipStyles = tooltipStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsTooltipActivated]
  }
  
  extension [Self <: IsTooltipActivated](x: Self) {
    
    inline def setIsTooltipActivated(value: Boolean): Self = StObject.set(x, "isTooltipActivated", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: Any): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipStyles(value: Any): Self = StObject.set(x, "tooltipStyles", value.asInstanceOf[js.Any])
  }
}
