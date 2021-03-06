package typingsJapgolly.rcGesture.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcGesture.mod.IGesture
import typingsJapgolly.rcGesture.mod.IGestureStatus
import typingsJapgolly.rcGesture.mod.default
import typingsJapgolly.rcGesture.rcGestureStrings.all
import typingsJapgolly.rcGesture.rcGestureStrings.horizontal
import typingsJapgolly.rcGesture.rcGestureStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcGesture {
  def apply(
    direction: all | vertical | horizontal = null,
    enablePinch: js.UndefOr[Boolean] = js.undefined,
    enableRotate: js.UndefOr[Boolean] = js.undefined,
    onPan: /* s */ IGestureStatus => Callback = null,
    onPanCancel: /* s */ IGestureStatus => Callback = null,
    onPanDown: /* s */ IGestureStatus => Callback = null,
    onPanEnd: /* s */ IGestureStatus => Callback = null,
    onPanLeft: /* s */ IGestureStatus => Callback = null,
    onPanMove: /* s */ IGestureStatus => Callback = null,
    onPanRight: /* s */ IGestureStatus => Callback = null,
    onPanStart: /* s */ IGestureStatus => Callback = null,
    onPanUp: /* s */ IGestureStatus => Callback = null,
    onPinch: /* s */ IGestureStatus => Callback = null,
    onPinchCancel: /* s */ IGestureStatus => Callback = null,
    onPinchEnd: /* s */ IGestureStatus => Callback = null,
    onPinchIn: /* s */ IGestureStatus => Callback = null,
    onPinchMove: /* s */ IGestureStatus => Callback = null,
    onPinchOut: /* s */ IGestureStatus => Callback = null,
    onPinchStart: /* s */ IGestureStatus => Callback = null,
    onPress: /* s */ IGestureStatus => Callback = null,
    onPressUp: /* s */ IGestureStatus => Callback = null,
    onRotate: /* s */ IGestureStatus => Callback = null,
    onRotateCancel: /* s */ IGestureStatus => Callback = null,
    onRotateEnd: /* s */ IGestureStatus => Callback = null,
    onRotateMove: /* s */ IGestureStatus => Callback = null,
    onRotateStart: /* s */ IGestureStatus => Callback = null,
    onSwipe: /* s */ IGestureStatus => Callback = null,
    onSwipeDown: /* s */ IGestureStatus => Callback = null,
    onSwipeLeft: /* s */ IGestureStatus => Callback = null,
    onSwipeRight: /* s */ IGestureStatus => Callback = null,
    onSwipeUp: /* s */ IGestureStatus => Callback = null,
    onTap: /* s */ IGestureStatus => Callback = null,
    onTouchCancel: ReactTouchEventFrom[HTMLElement] => Callback = null,
    onTouchEnd: ReactTouchEventFrom[HTMLElement] => Callback = null,
    onTouchMove: ReactTouchEventFrom[HTMLElement] => Callback = null,
    onTouchStart: ReactTouchEventFrom[HTMLElement] => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IGesture, default, Unit, IGesture] = {
    val __obj = js.Dynamic.literal()
  
      if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePinch)) __obj.updateDynamic("enablePinch")(enablePinch.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRotate)) __obj.updateDynamic("enableRotate")(enableRotate.asInstanceOf[js.Any])
    if (onPan != null) __obj.updateDynamic("onPan")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPan(t0).runNow()))
    if (onPanCancel != null) __obj.updateDynamic("onPanCancel")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPanCancel(t0).runNow()))
    if (onPanDown != null) __obj.updateDynamic("onPanDown")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPanDown(t0).runNow()))
    if (onPanEnd != null) __obj.updateDynamic("onPanEnd")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPanEnd(t0).runNow()))
    if (onPanLeft != null) __obj.updateDynamic("onPanLeft")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPanLeft(t0).runNow()))
    if (onPanMove != null) __obj.updateDynamic("onPanMove")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPanMove(t0).runNow()))
    if (onPanRight != null) __obj.updateDynamic("onPanRight")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPanRight(t0).runNow()))
    if (onPanStart != null) __obj.updateDynamic("onPanStart")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPanStart(t0).runNow()))
    if (onPanUp != null) __obj.updateDynamic("onPanUp")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPanUp(t0).runNow()))
    if (onPinch != null) __obj.updateDynamic("onPinch")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPinch(t0).runNow()))
    if (onPinchCancel != null) __obj.updateDynamic("onPinchCancel")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPinchCancel(t0).runNow()))
    if (onPinchEnd != null) __obj.updateDynamic("onPinchEnd")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPinchEnd(t0).runNow()))
    if (onPinchIn != null) __obj.updateDynamic("onPinchIn")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPinchIn(t0).runNow()))
    if (onPinchMove != null) __obj.updateDynamic("onPinchMove")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPinchMove(t0).runNow()))
    if (onPinchOut != null) __obj.updateDynamic("onPinchOut")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPinchOut(t0).runNow()))
    if (onPinchStart != null) __obj.updateDynamic("onPinchStart")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPinchStart(t0).runNow()))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPress(t0).runNow()))
    if (onPressUp != null) __obj.updateDynamic("onPressUp")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onPressUp(t0).runNow()))
    if (onRotate != null) __obj.updateDynamic("onRotate")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onRotate(t0).runNow()))
    if (onRotateCancel != null) __obj.updateDynamic("onRotateCancel")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onRotateCancel(t0).runNow()))
    if (onRotateEnd != null) __obj.updateDynamic("onRotateEnd")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onRotateEnd(t0).runNow()))
    if (onRotateMove != null) __obj.updateDynamic("onRotateMove")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onRotateMove(t0).runNow()))
    if (onRotateStart != null) __obj.updateDynamic("onRotateStart")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onRotateStart(t0).runNow()))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onSwipe(t0).runNow()))
    if (onSwipeDown != null) __obj.updateDynamic("onSwipeDown")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onSwipeDown(t0).runNow()))
    if (onSwipeLeft != null) __obj.updateDynamic("onSwipeLeft")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onSwipeLeft(t0).runNow()))
    if (onSwipeRight != null) __obj.updateDynamic("onSwipeRight")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onSwipeRight(t0).runNow()))
    if (onSwipeUp != null) __obj.updateDynamic("onSwipeUp")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onSwipeUp(t0).runNow()))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1((t0: /* s */ typingsJapgolly.rcGesture.mod.IGestureStatus) => onTap(t0).runNow()))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTouchCancel(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactTouchEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTouchStart(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rcGesture.mod.IGesture, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rcGesture.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcGesture.mod.IGesture])(children: _*)
  }
  @JSImport("rc-gesture", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

