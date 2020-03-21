package typingsJapgolly.reactMapGl

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactMapGl.mod.InteractiveState
import typingsJapgolly.reactMapGl.mod.MapState
import typingsJapgolly.reactMapGl.mod.MapStateProps
import typingsJapgolly.reactMapGl.mod.PositionInput
import typingsJapgolly.reactMapGl.mod.ViewportProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-map-gl.react-map-gl.MapState> */
trait PartialMapState extends js.Object {
  var constructor: js.UndefOr[js.Function1[/* props */ MapStateProps, js.Any]] = js.undefined
  var getInteractiveState: js.UndefOr[js.Function0[InteractiveState]] = js.undefined
  var getViewportProps: js.UndefOr[js.Function0[ViewportProps]] = js.undefined
  var pan: js.UndefOr[js.Function1[/* input */ PositionInputstartPosnumb, MapState]] = js.undefined
  var panEnd: js.UndefOr[js.Function0[MapState]] = js.undefined
  var panStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.undefined
  var rotate: js.UndefOr[js.Function1[/* input */ AnonDeltaScaleX, MapState]] = js.undefined
  var rotateEnd: js.UndefOr[js.Function0[MapState]] = js.undefined
  var rotateStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.undefined
  var zoom: js.UndefOr[js.Function1[/* input */ PositionInputscalenumbers, MapState]] = js.undefined
  var zoomEnd: js.UndefOr[js.Function0[MapState]] = js.undefined
  var zoomStart: js.UndefOr[js.Function1[/* input */ PositionInput, MapState]] = js.undefined
}

object PartialMapState {
  @scala.inline
  def apply(
    constructor: /* props */ MapStateProps => CallbackTo[js.Any] = null,
    getInteractiveState: js.UndefOr[CallbackTo[InteractiveState]] = js.undefined,
    getViewportProps: js.UndefOr[CallbackTo[ViewportProps]] = js.undefined,
    pan: /* input */ PositionInputstartPosnumb => CallbackTo[MapState] = null,
    panEnd: js.UndefOr[CallbackTo[MapState]] = js.undefined,
    panStart: /* input */ PositionInput => CallbackTo[MapState] = null,
    rotate: /* input */ AnonDeltaScaleX => CallbackTo[MapState] = null,
    rotateEnd: js.UndefOr[CallbackTo[MapState]] = js.undefined,
    rotateStart: /* input */ PositionInput => CallbackTo[MapState] = null,
    zoom: /* input */ PositionInputscalenumbers => CallbackTo[MapState] = null,
    zoomEnd: js.UndefOr[CallbackTo[MapState]] = js.undefined,
    zoomStart: /* input */ PositionInput => CallbackTo[MapState] = null
  ): PartialMapState = {
    val __obj = js.Dynamic.literal()
    if (constructor != null) __obj.updateDynamic("constructor")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactMapGl.mod.MapStateProps) => constructor(t0).runNow()))
    getInteractiveState.foreach(p => __obj.updateDynamic("getInteractiveState")(p.toJsFn))
    getViewportProps.foreach(p => __obj.updateDynamic("getViewportProps")(p.toJsFn))
    if (pan != null) __obj.updateDynamic("pan")(js.Any.fromFunction1((t0: /* input */ typingsJapgolly.reactMapGl.PositionInputstartPosnumb) => pan(t0).runNow()))
    panEnd.foreach(p => __obj.updateDynamic("panEnd")(p.toJsFn))
    if (panStart != null) __obj.updateDynamic("panStart")(js.Any.fromFunction1((t0: /* input */ typingsJapgolly.reactMapGl.mod.PositionInput) => panStart(t0).runNow()))
    if (rotate != null) __obj.updateDynamic("rotate")(js.Any.fromFunction1((t0: /* input */ typingsJapgolly.reactMapGl.AnonDeltaScaleX) => rotate(t0).runNow()))
    rotateEnd.foreach(p => __obj.updateDynamic("rotateEnd")(p.toJsFn))
    if (rotateStart != null) __obj.updateDynamic("rotateStart")(js.Any.fromFunction1((t0: /* input */ typingsJapgolly.reactMapGl.mod.PositionInput) => rotateStart(t0).runNow()))
    if (zoom != null) __obj.updateDynamic("zoom")(js.Any.fromFunction1((t0: /* input */ typingsJapgolly.reactMapGl.PositionInputscalenumbers) => zoom(t0).runNow()))
    zoomEnd.foreach(p => __obj.updateDynamic("zoomEnd")(p.toJsFn))
    if (zoomStart != null) __obj.updateDynamic("zoomStart")(js.Any.fromFunction1((t0: /* input */ typingsJapgolly.reactMapGl.mod.PositionInput) => zoomStart(t0).runNow()))
    __obj.asInstanceOf[PartialMapState]
  }
}

