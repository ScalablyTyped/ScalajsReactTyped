package typingsJapgolly.reactNativeGestureHandler.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsSwipeableMod.SwipeableProps
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HandlerStateChangeEvent
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersGestureHandlerCommonMod.HitSlop
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.left
import typingsJapgolly.reactNativeGestureHandler.reactNativeGestureHandlerStrings.right
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Swipeable {
  
  @JSImport("react-native-gesture-handler", "Swipeable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeGestureHandler.mod.Swipeable] {
    
    inline def activateAfterLongPress(value: Double): this.type = set("activateAfterLongPress", value.asInstanceOf[js.Any])
    
    inline def activeOffsetX(value: Double | js.Array[Double]): this.type = set("activeOffsetX", value.asInstanceOf[js.Any])
    
    inline def activeOffsetXVarargs(value: Double*): this.type = set("activeOffsetX", js.Array(value*))
    
    inline def activeOffsetY(value: Double | js.Array[Double]): this.type = set("activeOffsetY", value.asInstanceOf[js.Any])
    
    inline def activeOffsetYVarargs(value: Double*): this.type = set("activeOffsetY", js.Array(value*))
    
    inline def animationOptions(value: Record[String, Any]): this.type = set("animationOptions", value.asInstanceOf[js.Any])
    
    inline def avgTouches(value: Boolean): this.type = set("avgTouches", value.asInstanceOf[js.Any])
    
    inline def cancelsTouchesInView(value: Boolean): this.type = set("cancelsTouchesInView", value.asInstanceOf[js.Any])
    
    inline def childrenContainerStyle(value: StyleProp[ViewStyle]): this.type = set("childrenContainerStyle", value.asInstanceOf[js.Any])
    
    inline def childrenContainerStyleNull: this.type = set("childrenContainerStyle", null)
    
    inline def containerStyle(value: StyleProp[ViewStyle]): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def containerStyleNull: this.type = set("containerStyle", null)
    
    inline def enableTrackpadTwoFingerGesture(value: Boolean): this.type = set("enableTrackpadTwoFingerGesture", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def failOffsetX(value: Double | js.Array[Double]): this.type = set("failOffsetX", value.asInstanceOf[js.Any])
    
    inline def failOffsetXVarargs(value: Double*): this.type = set("failOffsetX", js.Array(value*))
    
    inline def failOffsetY(value: Double | js.Array[Double]): this.type = set("failOffsetY", value.asInstanceOf[js.Any])
    
    inline def failOffsetYVarargs(value: Double*): this.type = set("failOffsetY", js.Array(value*))
    
    inline def friction(value: Double): this.type = set("friction", value.asInstanceOf[js.Any])
    
    inline def hitSlop(value: HitSlop): this.type = set("hitSlop", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def leftThreshold(value: Double): this.type = set("leftThreshold", value.asInstanceOf[js.Any])
    
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
    
    inline def onSwipeableClose(
      value: (/* direction */ left | right, /* swipeable */ typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsSwipeableMod.Swipeable) => Callback
    ): this.type = set("onSwipeableClose", js.Any.fromFunction2((t0: /* direction */ left | right, t1: /* swipeable */ typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsSwipeableMod.Swipeable) => (value(t0, t1)).runNow()))
    
    inline def onSwipeableLeftOpen(value: Callback): this.type = set("onSwipeableLeftOpen", value.toJsFn)
    
    inline def onSwipeableLeftWillOpen(value: Callback): this.type = set("onSwipeableLeftWillOpen", value.toJsFn)
    
    inline def onSwipeableOpen(
      value: (/* direction */ left | right, /* swipeable */ typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsSwipeableMod.Swipeable) => Callback
    ): this.type = set("onSwipeableOpen", js.Any.fromFunction2((t0: /* direction */ left | right, t1: /* swipeable */ typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsSwipeableMod.Swipeable) => (value(t0, t1)).runNow()))
    
    inline def onSwipeableRightOpen(value: Callback): this.type = set("onSwipeableRightOpen", value.toJsFn)
    
    inline def onSwipeableRightWillOpen(value: Callback): this.type = set("onSwipeableRightWillOpen", value.toJsFn)
    
    inline def onSwipeableWillClose(value: /* direction */ left | right => Callback): this.type = set("onSwipeableWillClose", js.Any.fromFunction1((t0: /* direction */ left | right) => value(t0).runNow()))
    
    inline def onSwipeableWillOpen(value: /* direction */ left | right => Callback): this.type = set("onSwipeableWillOpen", js.Any.fromFunction1((t0: /* direction */ left | right) => value(t0).runNow()))
    
    inline def overshootFriction(value: Double): this.type = set("overshootFriction", value.asInstanceOf[js.Any])
    
    inline def overshootLeft(value: Boolean): this.type = set("overshootLeft", value.asInstanceOf[js.Any])
    
    inline def overshootRight(value: Boolean): this.type = set("overshootRight", value.asInstanceOf[js.Any])
    
    inline def renderLeftActions(
      value: (/* progressAnimatedValue */ AnimatedInterpolation[Double | String], /* dragAnimatedValue */ AnimatedInterpolation[Double | String]) => Node
    ): this.type = set("renderLeftActions", js.Any.fromFunction2(value))
    
    inline def renderRightActions(
      value: (/* progressAnimatedValue */ AnimatedInterpolation[Double | String], /* dragAnimatedValue */ AnimatedInterpolation[Double | String], /* swipeable */ typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsSwipeableMod.Swipeable) => Node
    ): this.type = set("renderRightActions", js.Any.fromFunction3(value))
    
    inline def rightThreshold(value: Double): this.type = set("rightThreshold", value.asInstanceOf[js.Any])
    
    inline def shouldCancelWhenOutside(value: Boolean): this.type = set("shouldCancelWhenOutside", value.asInstanceOf[js.Any])
    
    inline def simultaneousHandlers(value: Ref[Any] | js.Array[Ref[Any]]): this.type = set("simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def simultaneousHandlersFunction1(value: Any | Null => Callback): this.type = set("simultaneousHandlers", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def simultaneousHandlersNull: this.type = set("simultaneousHandlers", null)
    
    inline def simultaneousHandlersVarargs(value: Ref[Any]*): this.type = set("simultaneousHandlers", js.Array(value*))
    
    inline def testID(value: String): this.type = set("testID", value.asInstanceOf[js.Any])
    
    inline def useNativeAnimations(value: Boolean): this.type = set("useNativeAnimations", value.asInstanceOf[js.Any])
    
    inline def waitFor(value: Ref[Any] | js.Array[Ref[Any]]): this.type = set("waitFor", value.asInstanceOf[js.Any])
    
    inline def waitForFunction1(value: Any | Null => Callback): this.type = set("waitFor", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def waitForNull: this.type = set("waitFor", null)
    
    inline def waitForVarargs(value: Ref[Any]*): this.type = set("waitFor", js.Array(value*))
  }
  
  implicit def make(companion: Swipeable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwipeableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
