package typingsJapgolly.reactNativeGestureHandler

import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureStateChangeEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureTouchEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureUpdateEvent
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptHandlersGesturesEventReceiverMod {
  
  @JSImport("react-native-gesture-handler/lib/typescript/handlers/gestures/eventReceiver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onGestureHandlerEvent(event: (GestureStateChangeEvent[Record[String, Any]]) | (GestureUpdateEvent[Record[String, Any]])): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onGestureHandlerEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def onGestureHandlerEvent(event: GestureTouchEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onGestureHandlerEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def startListening(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startListening")().asInstanceOf[Unit]
  
  inline def stopListening(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")().asInstanceOf[Unit]
}
