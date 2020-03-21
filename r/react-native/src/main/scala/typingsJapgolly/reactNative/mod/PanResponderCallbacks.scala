package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanResponderCallbacks extends js.Object {
  var onMoveShouldSetPanResponder: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  var onMoveShouldSetPanResponderCapture: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  var onPanResponderEnd: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderGrant: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderMove: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderReject: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderRelease: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderStart: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderTerminate: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ PanResponderGestureState, 
      Unit
    ]
  ] = js.undefined
  var onPanResponderTerminationRequest: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  var onShouldBlockNativeResponder: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  var onStartShouldSetPanResponder: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
  var onStartShouldSetPanResponderCapture: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ PanResponderGestureState, 
      Boolean
    ]
  ] = js.undefined
}

object PanResponderCallbacks {
  @scala.inline
  def apply(
    onMoveShouldSetPanResponder: (ReactEventFrom[NodeHandle with Element], /* gestureState */ PanResponderGestureState) => CallbackTo[Boolean] = null,
    onMoveShouldSetPanResponderCapture: (ReactEventFrom[NodeHandle with Element], /* gestureState */ PanResponderGestureState) => CallbackTo[Boolean] = null,
    onPanResponderEnd: (ReactEventFrom[NodeHandle with Element], /* gestureState */ PanResponderGestureState) => Callback = null,
    onPanResponderGrant: (ReactEventFrom[NodeHandle with Element], /* gestureState */ PanResponderGestureState) => Callback = null,
    onPanResponderMove: (ReactEventFrom[NodeHandle with Element], /* gestureState */ PanResponderGestureState) => Callback = null,
    onPanResponderReject: (ReactEventFrom[NodeHandle with Element], /* gestureState */ PanResponderGestureState) => Callback = null,
    onPanResponderRelease: (ReactEventFrom[NodeHandle with Element], /* gestureState */ PanResponderGestureState) => Callback = null,
    onPanResponderStart: (ReactEventFrom[NodeHandle with Element], /* gestureState */ PanResponderGestureState) => Callback = null,
    onPanResponderTerminate: (ReactEventFrom[NodeHandle with Element], /* gestureState */ PanResponderGestureState) => Callback = null,
    onPanResponderTerminationRequest: (ReactEventFrom[NodeHandle with Element], /* gestureState */ PanResponderGestureState) => CallbackTo[Boolean] = null,
    onShouldBlockNativeResponder: (ReactEventFrom[NodeHandle with Element], /* gestureState */ PanResponderGestureState) => CallbackTo[Boolean] = null,
    onStartShouldSetPanResponder: (ReactEventFrom[NodeHandle with Element], /* gestureState */ PanResponderGestureState) => CallbackTo[Boolean] = null,
    onStartShouldSetPanResponderCapture: (ReactEventFrom[NodeHandle with Element], /* gestureState */ PanResponderGestureState) => CallbackTo[Boolean] = null
  ): PanResponderCallbacks = {
    val __obj = js.Dynamic.literal()
    if (onMoveShouldSetPanResponder != null) __obj.updateDynamic("onMoveShouldSetPanResponder")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ typingsJapgolly.reactNative.mod.PanResponderGestureState) => onMoveShouldSetPanResponder(t0, t1).runNow()))
    if (onMoveShouldSetPanResponderCapture != null) __obj.updateDynamic("onMoveShouldSetPanResponderCapture")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ typingsJapgolly.reactNative.mod.PanResponderGestureState) => onMoveShouldSetPanResponderCapture(t0, t1).runNow()))
    if (onPanResponderEnd != null) __obj.updateDynamic("onPanResponderEnd")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ typingsJapgolly.reactNative.mod.PanResponderGestureState) => onPanResponderEnd(t0, t1).runNow()))
    if (onPanResponderGrant != null) __obj.updateDynamic("onPanResponderGrant")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ typingsJapgolly.reactNative.mod.PanResponderGestureState) => onPanResponderGrant(t0, t1).runNow()))
    if (onPanResponderMove != null) __obj.updateDynamic("onPanResponderMove")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ typingsJapgolly.reactNative.mod.PanResponderGestureState) => onPanResponderMove(t0, t1).runNow()))
    if (onPanResponderReject != null) __obj.updateDynamic("onPanResponderReject")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ typingsJapgolly.reactNative.mod.PanResponderGestureState) => onPanResponderReject(t0, t1).runNow()))
    if (onPanResponderRelease != null) __obj.updateDynamic("onPanResponderRelease")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ typingsJapgolly.reactNative.mod.PanResponderGestureState) => onPanResponderRelease(t0, t1).runNow()))
    if (onPanResponderStart != null) __obj.updateDynamic("onPanResponderStart")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ typingsJapgolly.reactNative.mod.PanResponderGestureState) => onPanResponderStart(t0, t1).runNow()))
    if (onPanResponderTerminate != null) __obj.updateDynamic("onPanResponderTerminate")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ typingsJapgolly.reactNative.mod.PanResponderGestureState) => onPanResponderTerminate(t0, t1).runNow()))
    if (onPanResponderTerminationRequest != null) __obj.updateDynamic("onPanResponderTerminationRequest")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ typingsJapgolly.reactNative.mod.PanResponderGestureState) => onPanResponderTerminationRequest(t0, t1).runNow()))
    if (onShouldBlockNativeResponder != null) __obj.updateDynamic("onShouldBlockNativeResponder")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ typingsJapgolly.reactNative.mod.PanResponderGestureState) => onShouldBlockNativeResponder(t0, t1).runNow()))
    if (onStartShouldSetPanResponder != null) __obj.updateDynamic("onStartShouldSetPanResponder")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ typingsJapgolly.reactNative.mod.PanResponderGestureState) => onStartShouldSetPanResponder(t0, t1).runNow()))
    if (onStartShouldSetPanResponderCapture != null) __obj.updateDynamic("onStartShouldSetPanResponderCapture")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ typingsJapgolly.reactNative.mod.PanResponderGestureState) => onStartShouldSetPanResponderCapture(t0, t1).runNow()))
    __obj.asInstanceOf[PanResponderCallbacks]
  }
}

