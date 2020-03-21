package typingsJapgolly.eventTargetShim

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<event-target-shim.event-target-shim.Event, event-target-shim.event-target-shim.EventTarget.OmittableEventKeys>> */
trait PartialPickEventOmittable extends js.Object {
  var AT_TARGET: js.UndefOr[Double] = js.undefined
  var BUBBLING_PHASE: js.UndefOr[Double] = js.undefined
  var CAPTURING_PHASE: js.UndefOr[Double] = js.undefined
  var NONE: js.UndefOr[Double] = js.undefined
  var bubbles: js.UndefOr[Boolean] = js.undefined
  var cancelBubble: js.UndefOr[Boolean] = js.undefined
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var composed: js.UndefOr[Boolean] = js.undefined
  var composedPath: js.UndefOr[js.Function0[js.Array[EventTargetstandardAddEventListener]]] = js.undefined
  var currentTarget: js.UndefOr[EventTargetstandardAddEventListener] = js.undefined
  var defaultPrevented: js.UndefOr[Boolean] = js.undefined
  var eventPhase: js.UndefOr[Double] = js.undefined
  var initEvent: js.UndefOr[
    js.Function3[
      /* type */ String, 
      /* bubbles */ js.UndefOr[Boolean], 
      /* cancelable */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  var isTrusted: js.UndefOr[Boolean] = js.undefined
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
  var returnValue: js.UndefOr[Boolean] = js.undefined
  var srcElement: js.UndefOr[js.Any] = js.undefined
  var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.undefined
  var target: js.UndefOr[EventTargetstandardAddEventListener] = js.undefined
  var timeStamp: js.UndefOr[Double] = js.undefined
}

object PartialPickEventOmittable {
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
    composedPath: js.UndefOr[CallbackTo[js.Array[EventTargetstandardAddEventListener]]] = js.undefined,
    currentTarget: EventTargetstandardAddEventListener = null,
    defaultPrevented: js.UndefOr[Boolean] = js.undefined,
    eventPhase: Int | Double = null,
    initEvent: (/* type */ String, /* bubbles */ js.UndefOr[Boolean], /* cancelable */ js.UndefOr[Boolean]) => Callback = null,
    isTrusted: js.UndefOr[Boolean] = js.undefined,
    preventDefault: js.UndefOr[Callback] = js.undefined,
    returnValue: js.UndefOr[Boolean] = js.undefined,
    srcElement: js.Any = null,
    stopImmediatePropagation: js.UndefOr[Callback] = js.undefined,
    stopPropagation: js.UndefOr[Callback] = js.undefined,
    target: EventTargetstandardAddEventListener = null,
    timeStamp: Int | Double = null
  ): PartialPickEventOmittable = {
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
    if (eventPhase != null) __obj.updateDynamic("eventPhase")(eventPhase.asInstanceOf[js.Any])
    if (initEvent != null) __obj.updateDynamic("initEvent")(js.Any.fromFunction3((t0: /* type */ java.lang.String, t1: /* bubbles */ js.UndefOr[scala.Boolean], t2: /* cancelable */ js.UndefOr[scala.Boolean]) => initEvent(t0, t1, t2).runNow()))
    if (!js.isUndefined(isTrusted)) __obj.updateDynamic("isTrusted")(isTrusted.asInstanceOf[js.Any])
    preventDefault.foreach(p => __obj.updateDynamic("preventDefault")(p.toJsFn))
    if (!js.isUndefined(returnValue)) __obj.updateDynamic("returnValue")(returnValue.asInstanceOf[js.Any])
    if (srcElement != null) __obj.updateDynamic("srcElement")(srcElement.asInstanceOf[js.Any])
    stopImmediatePropagation.foreach(p => __obj.updateDynamic("stopImmediatePropagation")(p.toJsFn))
    stopPropagation.foreach(p => __obj.updateDynamic("stopPropagation")(p.toJsFn))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickEventOmittable]
  }
}

