package typingsJapgolly.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.ContinousBaseGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPinchGestureHandlerMod.PinchGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptJestUtilsJestUtilsMod.AllGestures
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesPinchGestureMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/pinchGesture", "PinchGesture")
  @js.native
  open class PinchGesture ()
    extends ContinousBaseGesture[PinchGestureHandlerEventPayload, PinchGestureChangeEventPayload]
       with AllGestures
  
  trait PinchGestureChangeEventPayload extends StObject {
    
    var scaleChange: Double
  }
  object PinchGestureChangeEventPayload {
    
    inline def apply(scaleChange: Double): PinchGestureChangeEventPayload = {
      val __obj = js.Dynamic.literal(scaleChange = scaleChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinchGestureChangeEventPayload]
    }
    
    extension [Self <: PinchGestureChangeEventPayload](x: Self) {
      
      inline def setScaleChange(value: Double): Self = StObject.set(x, "scaleChange", value.asInstanceOf[js.Any])
    }
  }
  
  type PinchGestureType = InstanceType[Instantiable0[PinchGesture]]
}
