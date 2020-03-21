package typingsJapgolly.reactabularSticky

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.EventTarget
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.UIEvent> */
trait PartialUIEvent extends js.Object {
  var AT_TARGET: js.UndefOr[Double] = js.undefined
  var BUBBLING_PHASE: js.UndefOr[Double] = js.undefined
  var CAPTURING_PHASE: js.UndefOr[Double] = js.undefined
  var NONE: js.UndefOr[Double] = js.undefined
  var bubbles: js.UndefOr[Boolean] = js.undefined
  var cancelBubble: js.UndefOr[Boolean] = js.undefined
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var composed: js.UndefOr[Boolean] = js.undefined
  var composedPath: js.UndefOr[js.Function0[js.Array[EventTarget]]] = js.undefined
  var currentTarget: js.UndefOr[EventTarget] = js.undefined
  var defaultPrevented: js.UndefOr[Boolean] = js.undefined
  var detail: js.UndefOr[Double] = js.undefined
  var eventPhase: js.UndefOr[Double] = js.undefined
  var initEvent: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.undefined
  var isTrusted: js.UndefOr[Boolean] = js.undefined
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
  var returnValue: js.UndefOr[Boolean] = js.undefined
  var srcElement: js.UndefOr[EventTarget] = js.undefined
  var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var target: js.UndefOr[EventTarget] = js.undefined
  var timeStamp: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[Window_] = js.undefined
  var which: js.UndefOr[Double] = js.undefined
}

object PartialUIEvent {
  @scala.inline
  def apply(
    AT_TARGET: Int | Double = null,
    BUBBLING_PHASE: Int | Double = null,
    CAPTURING_PHASE: Int | Double = null,
    NONE: Int | Double = null,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelBubble: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined,
    composedPath: js.UndefOr[CallbackTo[js.Array[EventTarget]]] = js.undefined,
    currentTarget: EventTarget = null,
    defaultPrevented: js.UndefOr[Boolean] = js.undefined,
    detail: Int | Double = null,
    eventPhase: Int | Double = null,
    initEvent: /* type */ String => Callback = null,
    isTrusted: js.UndefOr[Boolean] = js.undefined,
    preventDefault: js.UndefOr[Callback] = js.undefined,
    returnValue: js.UndefOr[Boolean] = js.undefined,
    srcElement: EventTarget = null,
    stopImmediatePropagation: js.UndefOr[Callback] = js.undefined,
    stopPropagation: js.UndefOr[Callback] = js.undefined,
    target: EventTarget = null,
    timeStamp: Int | Double = null,
    `type`: String = null,
    view: Window_ = null,
    which: Int | Double = null
  ): PartialUIEvent = {
    val __obj = js.Dynamic.literal()
    if (AT_TARGET != null) __obj.updateDynamic("AT_TARGET")(AT_TARGET.asInstanceOf[js.Any])
    if (BUBBLING_PHASE != null) __obj.updateDynamic("BUBBLING_PHASE")(BUBBLING_PHASE.asInstanceOf[js.Any])
    if (CAPTURING_PHASE != null) __obj.updateDynamic("CAPTURING_PHASE")(CAPTURING_PHASE.asInstanceOf[js.Any])
    if (NONE != null) __obj.updateDynamic("NONE")(NONE.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelBubble)) __obj.updateDynamic("cancelBubble")(cancelBubble.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    composedPath.foreach(p => __obj.updateDynamic("composedPath")(p.toJsFn))
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultPrevented)) __obj.updateDynamic("defaultPrevented")(defaultPrevented.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (eventPhase != null) __obj.updateDynamic("eventPhase")(eventPhase.asInstanceOf[js.Any])
    if (initEvent != null) __obj.updateDynamic("initEvent")(js.Any.fromFunction1((t0: /* type */ java.lang.String) => initEvent(t0).runNow()))
    if (!js.isUndefined(isTrusted)) __obj.updateDynamic("isTrusted")(isTrusted.asInstanceOf[js.Any])
    preventDefault.foreach(p => __obj.updateDynamic("preventDefault")(p.toJsFn))
    if (!js.isUndefined(returnValue)) __obj.updateDynamic("returnValue")(returnValue.asInstanceOf[js.Any])
    if (srcElement != null) __obj.updateDynamic("srcElement")(srcElement.asInstanceOf[js.Any])
    stopImmediatePropagation.foreach(p => __obj.updateDynamic("stopImmediatePropagation")(p.toJsFn))
    stopPropagation.foreach(p => __obj.updateDynamic("stopPropagation")(p.toJsFn))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (which != null) __obj.updateDynamic("which")(which.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialUIEvent]
  }
}

