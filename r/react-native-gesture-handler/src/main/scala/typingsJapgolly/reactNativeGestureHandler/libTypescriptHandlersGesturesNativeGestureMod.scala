package typingsJapgolly.reactNativeGestureHandler

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGestureConfig
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureConfig
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptJestUtilsJestUtilsMod.AllGestures
import typingsJapgolly.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesNativeGestureMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/nativeGesture", "NativeGesture")
  @js.native
  open class NativeGesture ()
    extends BaseGesture[NativeViewGestureHandlerPayload]
       with AllGestures {
    
    @JSName("config")
    var config_NativeGesture: BaseGestureConfig & NativeViewGestureConfig = js.native
    
    def disallowInterruption(value: Boolean): this.type = js.native
    
    def shouldActivateOnStart(value: Boolean): this.type = js.native
  }
  
  type NativeGestureType = InstanceType[Instantiable0[NativeGesture]]
}
