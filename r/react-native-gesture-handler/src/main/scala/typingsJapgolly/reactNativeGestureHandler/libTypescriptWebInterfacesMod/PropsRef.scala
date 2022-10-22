package typingsJapgolly.reactNativeGestureHandler.libTypescriptWebInterfacesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsRef extends StObject {
  
  def onGestureHandlerEvent(): Unit
  
  def onGestureHandlerStateChange(): Unit
}
object PropsRef {
  
  inline def apply(onGestureHandlerEvent: Callback, onGestureHandlerStateChange: Callback): PropsRef = {
    val __obj = js.Dynamic.literal(onGestureHandlerEvent = onGestureHandlerEvent.toJsFn, onGestureHandlerStateChange = onGestureHandlerStateChange.toJsFn)
    __obj.asInstanceOf[PropsRef]
  }
  
  extension [Self <: PropsRef](x: Self) {
    
    inline def setOnGestureHandlerEvent(value: Callback): Self = StObject.set(x, "onGestureHandlerEvent", value.toJsFn)
    
    inline def setOnGestureHandlerStateChange(value: Callback): Self = StObject.set(x, "onGestureHandlerStateChange", value.toJsFn)
  }
}
