package typingsJapgolly.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicWidth extends StObject {
  
  var appendTo: Any
  
  var dynamicWidth: Any
  
  var fixed: Any
  
  var flip: Any
  
  var isTestEnv: Any
  
  var minWidth: Any
  
  var moveBy: Any
  
  var placement: Any
  
  var shouldAnimate: Any
  
  var width: Any
}
object DynamicWidth {
  
  inline def apply(
    appendTo: Any,
    dynamicWidth: Any,
    fixed: Any,
    flip: Any,
    isTestEnv: Any,
    minWidth: Any,
    moveBy: Any,
    placement: Any,
    shouldAnimate: Any,
    width: Any
  ): DynamicWidth = {
    val __obj = js.Dynamic.literal(appendTo = appendTo.asInstanceOf[js.Any], dynamicWidth = dynamicWidth.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], isTestEnv = isTestEnv.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], moveBy = moveBy.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shouldAnimate = shouldAnimate.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicWidth]
  }
  
  extension [Self <: DynamicWidth](x: Self) {
    
    inline def setAppendTo(value: Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setDynamicWidth(value: Any): Self = StObject.set(x, "dynamicWidth", value.asInstanceOf[js.Any])
    
    inline def setFixed(value: Any): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFlip(value: Any): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setIsTestEnv(value: Any): Self = StObject.set(x, "isTestEnv", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Any): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMoveBy(value: Any): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: Any): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setShouldAnimate(value: Any): Self = StObject.set(x, "shouldAnimate", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
