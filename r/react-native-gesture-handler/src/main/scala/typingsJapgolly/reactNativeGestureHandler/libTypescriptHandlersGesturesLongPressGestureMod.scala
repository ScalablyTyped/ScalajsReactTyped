package typingsJapgolly.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGestureConfig
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersLongPressGestureHandlerMod.LongPressGestureConfig
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersLongPressGestureHandlerMod.LongPressGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptJestUtilsJestUtilsMod.AllGestures
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesLongPressGestureMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/longPressGesture", "LongPressGesture")
  @js.native
  open class LongPressGesture ()
    extends BaseGesture[LongPressGestureHandlerEventPayload]
       with AllGestures {
    
    @JSName("config")
    var config_LongPressGesture: BaseGestureConfig & LongPressGestureConfig = js.native
    
    def maxDistance(distance: Double): this.type = js.native
    
    def minDuration(duration: Double): this.type = js.native
  }
  
  type LongPressGestureType = InstanceType[Instantiable0[LongPressGesture]]
}
