package typingsJapgolly.reactNavigationStack.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HandlerStateChangeEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandlerEventPayload
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandlerProps_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PanGestureHandler {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/GestureHandler", "PanGestureHandler")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activateAfterLongPress(value: Double): this.type = set("activateAfterLongPress", value.asInstanceOf[js.Any])
    
    inline def activeOffsetX(value: Double | js.Array[Double]): this.type = set("activeOffsetX", value.asInstanceOf[js.Any])
    
    inline def activeOffsetXVarargs(value: Double*): this.type = set("activeOffsetX", js.Array(value*))
    
    inline def activeOffsetY(value: Double | js.Array[Double]): this.type = set("activeOffsetY", value.asInstanceOf[js.Any])
    
    inline def activeOffsetYVarargs(value: Double*): this.type = set("activeOffsetY", js.Array(value*))
    
    inline def avgTouches(value: Boolean): this.type = set("avgTouches", value.asInstanceOf[js.Any])
    
    inline def cancelsTouchesInView(value: Boolean): this.type = set("cancelsTouchesInView", value.asInstanceOf[js.Any])
    
    inline def enableTrackpadTwoFingerGesture(value: Boolean): this.type = set("enableTrackpadTwoFingerGesture", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def failOffsetX(value: Double | js.Array[Double]): this.type = set("failOffsetX", value.asInstanceOf[js.Any])
    
    inline def failOffsetXVarargs(value: Double*): this.type = set("failOffsetX", js.Array(value*))
    
    inline def failOffsetY(value: Double | js.Array[Double]): this.type = set("failOffsetY", value.asInstanceOf[js.Any])
    
    inline def failOffsetYVarargs(value: Double*): this.type = set("failOffsetY", js.Array(value*))
    
    inline def hitSlop(value: HitSlop): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def maxPointers(value: Double): this.type = set("maxPointers", value.asInstanceOf[js.Any])
    
    inline def minDist(value: Double): this.type = set("minDist", value.asInstanceOf[js.Any])
    
    inline def minPointers(value: Double): this.type = set("minPointers", value.asInstanceOf[js.Any])
    
    inline def minVelocity(value: Double): this.type = set("minVelocity", value.asInstanceOf[js.Any])
    
    inline def minVelocityX(value: Double): this.type = set("minVelocityX", value.asInstanceOf[js.Any])
    
    inline def minVelocityY(value: Double): this.type = set("minVelocityY", value.asInstanceOf[js.Any])
    
    inline def onActivated(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onActivated", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onBegan(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onBegan", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onCancelled(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onCancelled", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onEnded(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onFailed(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onFailed", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onGestureEvent(value: /* event */ GestureEvent[PanGestureHandlerEventPayload] => Callback): this.type = set("onGestureEvent", js.Any.fromFunction1((t0: /* event */ GestureEvent[PanGestureHandlerEventPayload]) => value(t0).runNow()))
    
    inline def onHandlerStateChange(value: /* event */ HandlerStateChangeEvent[PanGestureHandlerEventPayload] => Callback): this.type = set("onHandlerStateChange", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[PanGestureHandlerEventPayload]) => value(t0).runNow()))
    
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
  
  implicit def make(companion: PanGestureHandler.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PanGestureHandlerProps_): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
