package typingsJapgolly.reactNativeGestureHandler

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersForceTouchGestureHandlerMod.ForceTouchGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HandlerStateChangeEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.BaseGesture
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGesturesGestureMod.GestureType
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersLongPressGestureHandlerMod.LongPressGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPinchGestureHandlerMod.PinchGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersRotationGestureHandlerMod.RotationGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersTapGestureHandlerMod.TapGestureHandlerEventPayload
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersHandlersRegistryMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/handlersRegistry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findHandler(handlerTag: Double): js.UndefOr[GestureType] = ^.asInstanceOf[js.Dynamic].applyDynamic("findHandler")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[GestureType]]
  
  inline def findHandlerByTestID(testID: String): (BaseGesture[
    ForceTouchGestureHandlerEventPayload | LongPressGestureHandlerEventPayload | NativeViewGestureHandlerPayload | PanGestureHandlerEventPayload | PinchGestureHandlerEventPayload | (Record[String, Any | scala.Nothing]) | RotationGestureHandlerEventPayload | TapGestureHandlerEventPayload
  ]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findHandlerByTestID")(testID.asInstanceOf[js.Any]).asInstanceOf[(BaseGesture[
    ForceTouchGestureHandlerEventPayload | LongPressGestureHandlerEventPayload | NativeViewGestureHandlerPayload | PanGestureHandlerEventPayload | PinchGestureHandlerEventPayload | (Record[String, Any | scala.Nothing]) | RotationGestureHandlerEventPayload | TapGestureHandlerEventPayload
  ]) | Null]
  
  inline def findOldGestureHandler(handlerTag: Double): js.UndefOr[GestureHandlerCallbacks] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOldGestureHandler")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[GestureHandlerCallbacks]]
  
  inline def getNextHandlerTag(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextHandlerTag")().asInstanceOf[Double]
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/handlersRegistry", "handlerIDToTag")
  @js.native
  val handlerIDToTag: Record[String, Double] = js.native
  
  inline def registerHandler(handlerTag: Double, handler: GestureType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHandler")(handlerTag.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerHandler(handlerTag: Double, handler: GestureType, testID: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHandler")(handlerTag.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], testID.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerOldGestureHandler(handlerTag: Double, handler: GestureHandlerCallbacks): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerOldGestureHandler")(handlerTag.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregisterHandler(handlerTag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterHandler")(handlerTag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unregisterHandler(handlerTag: Double, testID: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterHandler")(handlerTag.asInstanceOf[js.Any], testID.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait GestureHandlerCallbacks extends StObject {
    
    def onGestureEvent(event: GestureEvent[Any]): Unit
    
    def onGestureStateChange(event: HandlerStateChangeEvent[Any]): Unit
  }
  object GestureHandlerCallbacks {
    
    inline def apply(
      onGestureEvent: GestureEvent[Any] => Callback,
      onGestureStateChange: HandlerStateChangeEvent[Any] => Callback
    ): GestureHandlerCallbacks = {
      val __obj = js.Dynamic.literal(onGestureEvent = js.Any.fromFunction1((t0: GestureEvent[Any]) => onGestureEvent(t0).runNow()), onGestureStateChange = js.Any.fromFunction1((t0: HandlerStateChangeEvent[Any]) => onGestureStateChange(t0).runNow()))
      __obj.asInstanceOf[GestureHandlerCallbacks]
    }
    
    extension [Self <: GestureHandlerCallbacks](x: Self) {
      
      inline def setOnGestureEvent(value: GestureEvent[Any] => Callback): Self = StObject.set(x, "onGestureEvent", js.Any.fromFunction1((t0: GestureEvent[Any]) => value(t0).runNow()))
      
      inline def setOnGestureStateChange(value: HandlerStateChangeEvent[Any] => Callback): Self = StObject.set(x, "onGestureStateChange", js.Any.fromFunction1((t0: HandlerStateChangeEvent[Any]) => value(t0).runNow()))
    }
  }
}
