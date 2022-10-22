package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipProps extends StObject {
  
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  
  var tooltipProps: js.UndefOr[js.Object] = js.undefined
}
object TooltipProps {
  
  inline def apply(): TooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipProps]
  }
  
  extension [Self <: TooltipProps](x: Self) {
    
    inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
    
    inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    
    inline def setTooltipProps(value: js.Object): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
    
    inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
  }
}
