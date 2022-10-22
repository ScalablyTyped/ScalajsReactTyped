package typingsJapgolly.reactNativeGestureHandler.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersFlingGestureHandlerMod.FlingGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersFlingGestureHandlerMod.FlingGestureHandlerProps_
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HandlerStateChangeEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FlingGestureHandler {
  
  @JSImport("react-native-gesture-handler", "FlingGestureHandler")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def cancelsTouchesInView(value: Boolean): this.type = set("cancelsTouchesInView", value.asInstanceOf[js.Any])
    
    inline def direction(value: Double): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: HitSlop): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def numberOfPointers(value: Double): this.type = set("numberOfPointers", value.asInstanceOf[js.Any])
    
    inline def onActivated(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onActivated", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onBegan(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onBegan", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onCancelled(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onCancelled", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onEnded(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onFailed(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onFailed", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onGestureEvent(value: /* event */ GestureEvent[FlingGestureHandlerEventPayload] => Callback): this.type = set("onGestureEvent", js.Any.fromFunction1((t0: /* event */ GestureEvent[FlingGestureHandlerEventPayload]) => value(t0).runNow()))
    
    inline def onHandlerStateChange(value: /* event */ HandlerStateChangeEvent[FlingGestureHandlerEventPayload] => Callback): this.type = set("onHandlerStateChange", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[FlingGestureHandlerEventPayload]) => value(t0).runNow()))
    
    inline def shouldCancelWhenOutside(value: Boolean): this.type = set("shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    inline def simultaneousHandlers(value: Ref[Any] | js.Array[Ref[Any]]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def simultaneousHandlersFunction1(value: Any | Null => Callback): this.type = set("simultaneousHandlers", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def simultaneousHandlersNull: this.type = set("simultaneousHandlers", null)
    
    inline def simultaneousHandlersVarargs(value: Ref[Any]*): this.type = set("simultaneousHandlers", js.Array(value*))
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def waitFor(value: Ref[Any] | js.Array[Ref[Any]]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    
    inline def waitForFunction1(value: Any | Null => Callback): this.type = set("waitFor", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def waitForNull: this.type = set("waitFor", null)
    
    inline def waitForVarargs(value: Ref[Any]*): this.type = set("waitFor", js.Array(value*))
  }
  
  implicit def make(companion: FlingGestureHandler.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FlingGestureHandlerProps_ & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
