package typingsJapgolly.reactNativeGestureHandler.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsGestureButtonsMod.BaseButtonProps
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.GestureEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HandlerStateChangeEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersNativeViewGestureHandlerMod.NativeViewGestureHandlerPayload
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseButton {
  
  @JSImport("react-native-gesture-handler", "BaseButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeGestureHandler.mod.BaseButton] {
    
    inline def borderless(value: Boolean): this.type = set("borderless", value.asInstanceOf[js.Any])
    
    inline def cancelsTouchesInView(value: Boolean): this.type = set("cancelsTouchesInView", value.asInstanceOf[js.Any])
    
    inline def delayLongPress(value: Double): this.type = set("delayLongPress", value.asInstanceOf[js.Any])
    
    inline def disallowInterruption(value: Boolean): this.type = set("disallowInterruption", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def exclusive(value: Boolean): this.type = set("exclusive", value.asInstanceOf[js.Any])
    
    inline def foreground(value: Boolean): this.type = set("foreground", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: HitSlop): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def onActivated(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onActivated", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onActiveStateChange(value: /* active */ Boolean => Callback): this.type = set("onActiveStateChange", js.Any.fromFunction1((t0: /* active */ Boolean) => value(t0).runNow()))
    
    inline def onBegan(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onBegan", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onCancelled(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onCancelled", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onEnded(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onFailed(value: /* event */ HandlerStateChangeEvent[Record[String, Any]] => Callback): this.type = set("onFailed", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[Record[String, Any]]) => value(t0).runNow()))
    
    inline def onGestureEvent(value: /* event */ GestureEvent[NativeViewGestureHandlerPayload] => Callback): this.type = set("onGestureEvent", js.Any.fromFunction1((t0: /* event */ GestureEvent[NativeViewGestureHandlerPayload]) => value(t0).runNow()))
    
    inline def onHandlerStateChange(value: /* event */ HandlerStateChangeEvent[NativeViewGestureHandlerPayload] => Callback): this.type = set("onHandlerStateChange", js.Any.fromFunction1((t0: /* event */ HandlerStateChangeEvent[NativeViewGestureHandlerPayload]) => value(t0).runNow()))
    
    inline def onLongPress(value: Callback): this.type = set("onLongPress", value.toJsFn)
    
    inline def onPress(value: /* pointerInside */ Boolean => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* pointerInside */ Boolean) => value(t0).runNow()))
    
    inline def rippleColor(value: Any): this.type = set("rippleColor", value.asInstanceOf[js.Any])
    
    inline def rippleRadius(value: Double): this.type = set("rippleRadius", value.asInstanceOf[js.Any])
    
    inline def rippleRadiusNull: this.type = set("rippleRadius", null)
    
    inline def shouldActivateOnStart(value: Boolean): this.type = set("shouldActivateOnStart", value.asInstanceOf[js.Any])
    
    inline def shouldCancelWhenOutside(value: Boolean): this.type = set("shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    inline def simultaneousHandlers(value: Ref[Any] | js.Array[Ref[Any]]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def simultaneousHandlersFunction1(value: Any | Null => Callback): this.type = set("simultaneousHandlers", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def simultaneousHandlersNull: this.type = set("simultaneousHandlers", null)
    
    inline def simultaneousHandlersVarargs(value: Ref[Any]*): this.type = set("simultaneousHandlers", js.Array(value*))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def touchSoundDisabled(value: Boolean): this.type = set("touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def waitFor(value: Ref[Any] | js.Array[Ref[Any]]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    
    inline def waitForFunction1(value: Any | Null => Callback): this.type = set("waitFor", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def waitForNull: this.type = set("waitFor", null)
    
    inline def waitForVarargs(value: Ref[Any]*): this.type = set("waitFor", js.Array(value*))
  }
  
  implicit def make(companion: BaseButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BaseButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
