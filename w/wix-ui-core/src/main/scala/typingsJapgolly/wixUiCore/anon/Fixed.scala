package typingsJapgolly.wixUiCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fixed extends StObject {
  
  var fixed: Boolean
  
  var flip: Boolean
  
  def onClickOutside(): js.Object
  
  var zIndex: Double
}
object Fixed {
  
  inline def apply(fixed: Boolean, flip: Boolean, onClickOutside: CallbackTo[js.Object], zIndex: Double): Fixed = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], onClickOutside = onClickOutside.toJsFn, zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fixed]
  }
  
  extension [Self <: Fixed](x: Self) {
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setOnClickOutside(value: CallbackTo[js.Object]): Self = StObject.set(x, "onClickOutside", value.toJsFn)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
