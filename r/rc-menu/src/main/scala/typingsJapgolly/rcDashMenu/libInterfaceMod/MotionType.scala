package typingsJapgolly.rcDashMenu.libInterfaceMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcDashMenu.rcDashMenuNumbers.`false`
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotionType extends js.Object {
  var leavedClassName: js.UndefOr[String] = js.undefined
  var motionAppear: js.UndefOr[Boolean] = js.undefined
  var motionEnter: js.UndefOr[Boolean] = js.undefined
  var motionLeave: js.UndefOr[Boolean] = js.undefined
  var motionLeaveImmediately: js.UndefOr[Boolean] = js.undefined
  var motionName: js.UndefOr[String | MotionNameObject] = js.undefined
  var onAppearActive: js.UndefOr[MotionEventHandler] = js.undefined
  var onAppearEnd: js.UndefOr[MotionEventHandler] = js.undefined
  var onAppearStart: js.UndefOr[MotionEventHandler] = js.undefined
  var onEnterActive: js.UndefOr[MotionEventHandler] = js.undefined
  var onEnterEnd: js.UndefOr[MotionEventHandler] = js.undefined
  var onEnterStart: js.UndefOr[MotionEventHandler] = js.undefined
  var onLeaveActive: js.UndefOr[MotionEventHandler] = js.undefined
  var onLeaveEnd: js.UndefOr[MotionEventHandler] = js.undefined
  var onLeaveStart: js.UndefOr[MotionEventHandler] = js.undefined
  var removeOnLeave: js.UndefOr[Boolean] = js.undefined
}

object MotionType {
  @scala.inline
  def apply(
    leavedClassName: String = null,
    motionAppear: js.UndefOr[Boolean] = js.undefined,
    motionEnter: js.UndefOr[Boolean] = js.undefined,
    motionLeave: js.UndefOr[Boolean] = js.undefined,
    motionLeaveImmediately: js.UndefOr[Boolean] = js.undefined,
    motionName: String | MotionNameObject = null,
    onAppearActive: (/* element */ HTMLElement, /* event */ js.UndefOr[ReactTransitionEventFrom[HTMLElement] | ReactAnimationEventFrom[HTMLElement]]) => CallbackTo[js.UndefOr[CSSProperties | `false` | Null | Unit]] = null,
    onAppearEnd: (/* element */ HTMLElement, /* event */ js.UndefOr[ReactTransitionEventFrom[HTMLElement] | ReactAnimationEventFrom[HTMLElement]]) => CallbackTo[js.UndefOr[CSSProperties | `false` | Null | Unit]] = null,
    onAppearStart: (/* element */ HTMLElement, /* event */ js.UndefOr[ReactTransitionEventFrom[HTMLElement] | ReactAnimationEventFrom[HTMLElement]]) => CallbackTo[js.UndefOr[CSSProperties | `false` | Null | Unit]] = null,
    onEnterActive: (/* element */ HTMLElement, /* event */ js.UndefOr[ReactTransitionEventFrom[HTMLElement] | ReactAnimationEventFrom[HTMLElement]]) => CallbackTo[js.UndefOr[CSSProperties | `false` | Null | Unit]] = null,
    onEnterEnd: (/* element */ HTMLElement, /* event */ js.UndefOr[ReactTransitionEventFrom[HTMLElement] | ReactAnimationEventFrom[HTMLElement]]) => CallbackTo[js.UndefOr[CSSProperties | `false` | Null | Unit]] = null,
    onEnterStart: (/* element */ HTMLElement, /* event */ js.UndefOr[ReactTransitionEventFrom[HTMLElement] | ReactAnimationEventFrom[HTMLElement]]) => CallbackTo[js.UndefOr[CSSProperties | `false` | Null | Unit]] = null,
    onLeaveActive: (/* element */ HTMLElement, /* event */ js.UndefOr[ReactTransitionEventFrom[HTMLElement] | ReactAnimationEventFrom[HTMLElement]]) => CallbackTo[js.UndefOr[CSSProperties | `false` | Null | Unit]] = null,
    onLeaveEnd: (/* element */ HTMLElement, /* event */ js.UndefOr[ReactTransitionEventFrom[HTMLElement] | ReactAnimationEventFrom[HTMLElement]]) => CallbackTo[js.UndefOr[CSSProperties | `false` | Null | Unit]] = null,
    onLeaveStart: (/* element */ HTMLElement, /* event */ js.UndefOr[ReactTransitionEventFrom[HTMLElement] | ReactAnimationEventFrom[HTMLElement]]) => CallbackTo[js.UndefOr[CSSProperties | `false` | Null | Unit]] = null,
    removeOnLeave: js.UndefOr[Boolean] = js.undefined
  ): MotionType = {
    val __obj = js.Dynamic.literal()
    if (leavedClassName != null) __obj.updateDynamic("leavedClassName")(leavedClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(motionAppear)) __obj.updateDynamic("motionAppear")(motionAppear.asInstanceOf[js.Any])
    if (!js.isUndefined(motionEnter)) __obj.updateDynamic("motionEnter")(motionEnter.asInstanceOf[js.Any])
    if (!js.isUndefined(motionLeave)) __obj.updateDynamic("motionLeave")(motionLeave.asInstanceOf[js.Any])
    if (!js.isUndefined(motionLeaveImmediately)) __obj.updateDynamic("motionLeaveImmediately")(motionLeaveImmediately.asInstanceOf[js.Any])
    if (motionName != null) __obj.updateDynamic("motionName")(motionName.asInstanceOf[js.Any])
    if (onAppearActive != null) __obj.updateDynamic("onAppearActive")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.HTMLElement, t1: /* event */ js.UndefOr[
  japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onAppearActive(t0, t1).runNow()))
    if (onAppearEnd != null) __obj.updateDynamic("onAppearEnd")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.HTMLElement, t1: /* event */ js.UndefOr[
  japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onAppearEnd(t0, t1).runNow()))
    if (onAppearStart != null) __obj.updateDynamic("onAppearStart")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.HTMLElement, t1: /* event */ js.UndefOr[
  japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onAppearStart(t0, t1).runNow()))
    if (onEnterActive != null) __obj.updateDynamic("onEnterActive")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.HTMLElement, t1: /* event */ js.UndefOr[
  japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onEnterActive(t0, t1).runNow()))
    if (onEnterEnd != null) __obj.updateDynamic("onEnterEnd")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.HTMLElement, t1: /* event */ js.UndefOr[
  japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onEnterEnd(t0, t1).runNow()))
    if (onEnterStart != null) __obj.updateDynamic("onEnterStart")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.HTMLElement, t1: /* event */ js.UndefOr[
  japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onEnterStart(t0, t1).runNow()))
    if (onLeaveActive != null) __obj.updateDynamic("onLeaveActive")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.HTMLElement, t1: /* event */ js.UndefOr[
  japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onLeaveActive(t0, t1).runNow()))
    if (onLeaveEnd != null) __obj.updateDynamic("onLeaveEnd")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.HTMLElement, t1: /* event */ js.UndefOr[
  japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onLeaveEnd(t0, t1).runNow()))
    if (onLeaveStart != null) __obj.updateDynamic("onLeaveStart")(js.Any.fromFunction2((t0: /* element */ org.scalajs.dom.raw.HTMLElement, t1: /* event */ js.UndefOr[
  japgolly.scalajs.react.ReactTransitionEventFrom[org.scalajs.dom.raw.HTMLElement] | japgolly.scalajs.react.ReactAnimationEventFrom[org.scalajs.dom.raw.HTMLElement]]) => onLeaveStart(t0, t1).runNow()))
    if (!js.isUndefined(removeOnLeave)) __obj.updateDynamic("removeOnLeave")(removeOnLeave.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionType]
  }
}

