package typingsJapgolly.reactNativeWindows.rntypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://github.com/facebook/react-native/blob/0.34-stable\Libraries\Components\Touchable\Touchable.js
  */
trait TouchableMixin extends StObject {
  
  /**
    * Returns the number of millis to wait before triggering a highlight.
    */
  def touchableGetHighlightDelayMS(): Double
  
  def touchableGetHitSlop(): Insets
  
  // These methods are undocumented but still being used by TouchableMixin internals
  def touchableGetLongPressDelayMS(): Double
  
  def touchableGetPressOutDelayMS(): Double
  
  /**
    * Returns the amount to extend the `HitRect` into the `PressRect`. Positive
    * numbers mean the size expands outwards.
    */
  def touchableGetPressRectOffset(): Insets
  
  /**
    * Invoked when the item should be highlighted. Mixers should implement this
    * to visually distinguish the `VisualRect` so that the user knows that
    * releasing a touch will result in a "selection" (analog to click).
    */
  def touchableHandleActivePressIn(e: ReactEventFrom[NodeHandle & Element]): Unit
  
  /**
    * Invoked when the item is "active" (in that it is still eligible to become
    * a "select") but the touch has left the `PressRect`. Usually the mixer will
    * want to unhighlight the `VisualRect`. If the user (while pressing) moves
    * back into the `PressRect` `touchableHandleActivePressIn` will be invoked
    * again and the mixer should probably highlight the `VisualRect` again. This
    * event will not fire on an `touchEnd/mouseUp` event, only move events while
    * the user is depressing the mouse/touch.
    */
  def touchableHandleActivePressOut(e: ReactEventFrom[NodeHandle & Element]): Unit
  
  /**
    * Invoked when the item is long pressed - meaning the interaction ended by
    * letting up while the item was in `RESPONDER_ACTIVE_LONG_PRESS_IN`. If
    * `touchableHandleLongPress` is *not* provided, `touchableHandlePress` will
    * be called as it normally is. If `touchableHandleLongPress` is provided, by
    * default any `touchableHandlePress` callback will not be invoked. To
    * override this default behavior, override `touchableLongPressCancelsPress`
    * to return false. As a result, `touchableHandlePress` will be called when
    * lifting up, even if `touchableHandleLongPress` has also been called.
    */
  def touchableHandleLongPress(e: ReactEventFrom[NodeHandle & Element]): Unit
  
  /**
    * Invoked when the item is "selected" - meaning the interaction ended by
    * letting up while the item was either in the state
    * `RESPONDER_ACTIVE_PRESS_IN` or `RESPONDER_INACTIVE_PRESS_IN`.
    */
  def touchableHandlePress(e: ReactEventFrom[NodeHandle & Element]): Unit
}
object TouchableMixin {
  
  inline def apply(
    touchableGetHighlightDelayMS: CallbackTo[Double],
    touchableGetHitSlop: CallbackTo[Insets],
    touchableGetLongPressDelayMS: CallbackTo[Double],
    touchableGetPressOutDelayMS: CallbackTo[Double],
    touchableGetPressRectOffset: CallbackTo[Insets],
    touchableHandleActivePressIn: ReactEventFrom[NodeHandle & Element] => Callback,
    touchableHandleActivePressOut: ReactEventFrom[NodeHandle & Element] => Callback,
    touchableHandleLongPress: ReactEventFrom[NodeHandle & Element] => Callback,
    touchableHandlePress: ReactEventFrom[NodeHandle & Element] => Callback
  ): TouchableMixin = {
    val __obj = js.Dynamic.literal(touchableGetHighlightDelayMS = touchableGetHighlightDelayMS.toJsFn, touchableGetHitSlop = touchableGetHitSlop.toJsFn, touchableGetLongPressDelayMS = touchableGetLongPressDelayMS.toJsFn, touchableGetPressOutDelayMS = touchableGetPressOutDelayMS.toJsFn, touchableGetPressRectOffset = touchableGetPressRectOffset.toJsFn, touchableHandleActivePressIn = js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => touchableHandleActivePressIn(t0).runNow()), touchableHandleActivePressOut = js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => touchableHandleActivePressOut(t0).runNow()), touchableHandleLongPress = js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => touchableHandleLongPress(t0).runNow()), touchableHandlePress = js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => touchableHandlePress(t0).runNow()))
    __obj.asInstanceOf[TouchableMixin]
  }
  
  extension [Self <: TouchableMixin](x: Self) {
    
    inline def setTouchableGetHighlightDelayMS(value: CallbackTo[Double]): Self = StObject.set(x, "touchableGetHighlightDelayMS", value.toJsFn)
    
    inline def setTouchableGetHitSlop(value: CallbackTo[Insets]): Self = StObject.set(x, "touchableGetHitSlop", value.toJsFn)
    
    inline def setTouchableGetLongPressDelayMS(value: CallbackTo[Double]): Self = StObject.set(x, "touchableGetLongPressDelayMS", value.toJsFn)
    
    inline def setTouchableGetPressOutDelayMS(value: CallbackTo[Double]): Self = StObject.set(x, "touchableGetPressOutDelayMS", value.toJsFn)
    
    inline def setTouchableGetPressRectOffset(value: CallbackTo[Insets]): Self = StObject.set(x, "touchableGetPressRectOffset", value.toJsFn)
    
    inline def setTouchableHandleActivePressIn(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "touchableHandleActivePressIn", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setTouchableHandleActivePressOut(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "touchableHandleActivePressOut", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setTouchableHandleLongPress(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "touchableHandleLongPress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setTouchableHandlePress(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "touchableHandlePress", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
  }
}
