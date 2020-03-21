package typingsJapgolly.reactSwipeable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSwipeable.mod.EventData
import typingsJapgolly.reactSwipeable.mod.SwipeableOptions
import typingsJapgolly.reactSwipeable.mod.SwipeableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Swipeable {
  def apply(
    className: String = null,
    delta: Int | Double = null,
    innerRef: /* element */ HTMLElement | Null => Callback = null,
    nodeName: String = null,
    onSwiped: /* eventData */ EventData => Callback = null,
    onSwipedDown: /* eventData */ EventData => Callback = null,
    onSwipedLeft: /* eventData */ EventData => Callback = null,
    onSwipedRight: /* eventData */ EventData => Callback = null,
    onSwipedUp: /* eventData */ EventData => Callback = null,
    onSwiping: /* eventData */ EventData => Callback = null,
    preventDefaultTouchmoveEvent: js.UndefOr[Boolean] = js.undefined,
    rotationAngle: Int | Double = null,
    style: CSSProperties = null,
    trackMouse: js.UndefOr[Boolean] = js.undefined,
    trackTouch: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SwipeableProps with SwipeableOptions, 
    typingsJapgolly.reactSwipeable.mod.Swipeable, 
    Unit, 
    SwipeableProps with SwipeableOptions
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (delta != null) __obj.updateDynamic("delta")(delta.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(js.Any.fromFunction1((t0: /* element */ org.scalajs.dom.raw.HTMLElement | scala.Null) => innerRef(t0).runNow()))
    if (nodeName != null) __obj.updateDynamic("nodeName")(nodeName.asInstanceOf[js.Any])
    if (onSwiped != null) __obj.updateDynamic("onSwiped")(js.Any.fromFunction1((t0: /* eventData */ typingsJapgolly.reactSwipeable.mod.EventData) => onSwiped(t0).runNow()))
    if (onSwipedDown != null) __obj.updateDynamic("onSwipedDown")(js.Any.fromFunction1((t0: /* eventData */ typingsJapgolly.reactSwipeable.mod.EventData) => onSwipedDown(t0).runNow()))
    if (onSwipedLeft != null) __obj.updateDynamic("onSwipedLeft")(js.Any.fromFunction1((t0: /* eventData */ typingsJapgolly.reactSwipeable.mod.EventData) => onSwipedLeft(t0).runNow()))
    if (onSwipedRight != null) __obj.updateDynamic("onSwipedRight")(js.Any.fromFunction1((t0: /* eventData */ typingsJapgolly.reactSwipeable.mod.EventData) => onSwipedRight(t0).runNow()))
    if (onSwipedUp != null) __obj.updateDynamic("onSwipedUp")(js.Any.fromFunction1((t0: /* eventData */ typingsJapgolly.reactSwipeable.mod.EventData) => onSwipedUp(t0).runNow()))
    if (onSwiping != null) __obj.updateDynamic("onSwiping")(js.Any.fromFunction1((t0: /* eventData */ typingsJapgolly.reactSwipeable.mod.EventData) => onSwiping(t0).runNow()))
    if (!js.isUndefined(preventDefaultTouchmoveEvent)) __obj.updateDynamic("preventDefaultTouchmoveEvent")(preventDefaultTouchmoveEvent.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(trackMouse)) __obj.updateDynamic("trackMouse")(trackMouse.asInstanceOf[js.Any])
    if (!js.isUndefined(trackTouch)) __obj.updateDynamic("trackTouch")(trackTouch.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSwipeable.mod.SwipeableProps with typingsJapgolly.reactSwipeable.mod.SwipeableOptions, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSwipeable.mod.Swipeable](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSwipeable.mod.SwipeableProps with typingsJapgolly.reactSwipeable.mod.SwipeableOptions])(children: _*)
  }
  @JSImport("react-swipeable", "Swipeable")
  @js.native
  object componentImport extends js.Object
  
}

