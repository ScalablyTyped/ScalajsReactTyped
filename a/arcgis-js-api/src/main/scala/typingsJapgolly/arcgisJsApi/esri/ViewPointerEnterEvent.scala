package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`pointer-enter`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.mouse
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewPointerEnterEvent extends StObject {
  
  var button: Double
  
  var buttons: Double
  
  var native: Any
  
  var pointerId: Double
  
  var pointerType: mouse | touch
  
  var stopPropagation: js.Function
  
  var timestamp: Double
  
  var `type`: `pointer-enter`
  
  var x: Double
  
  var y: Double
}
object ViewPointerEnterEvent {
  
  inline def apply(
    button: Double,
    buttons: Double,
    native: Any,
    pointerId: Double,
    pointerType: mouse | touch,
    stopPropagation: js.Function,
    timestamp: Double,
    x: Double,
    y: Double
  ): ViewPointerEnterEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], pointerId = pointerId.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pointer-enter")
    __obj.asInstanceOf[ViewPointerEnterEvent]
  }
  
  extension [Self <: ViewPointerEnterEvent](x: Self) {
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setNative(value: Any): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setPointerId(value: Double): Self = StObject.set(x, "pointerId", value.asInstanceOf[js.Any])
    
    inline def setPointerType(value: mouse | touch): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: js.Function): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: `pointer-enter`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
