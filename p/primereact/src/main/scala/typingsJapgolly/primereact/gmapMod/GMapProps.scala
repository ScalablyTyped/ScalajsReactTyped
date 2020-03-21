package typingsJapgolly.primereact.gmapMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.primereact.AnonMap
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GMapProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onMapClick: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onMapDragEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onMapReady: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.undefined
  var onOverlayClick: js.UndefOr[js.Function1[/* e */ AnonMap, Unit]] = js.undefined
  var onOverlayDrag: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onOverlayDragEnd: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onOverlayDragStart: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var onZoomChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var overlays: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object GMapProps {
  @scala.inline
  def apply(
    className: String = null,
    onMapClick: /* event */ Event_ => Callback = null,
    onMapDragEnd: js.UndefOr[Callback] = js.undefined,
    onMapReady: /* map */ js.Any => Callback = null,
    onOverlayClick: /* e */ AnonMap => Callback = null,
    onOverlayDrag: /* event */ Event_ => Callback = null,
    onOverlayDragEnd: /* event */ Event_ => Callback = null,
    onOverlayDragStart: /* event */ Event_ => Callback = null,
    onZoomChanged: js.UndefOr[Callback] = js.undefined,
    options: js.Object = null,
    overlays: js.Array[_] = null,
    style: js.Object = null
  ): GMapProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onMapClick != null) __obj.updateDynamic("onMapClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onMapClick(t0).runNow()))
    onMapDragEnd.foreach(p => __obj.updateDynamic("onMapDragEnd")(p.toJsFn))
    if (onMapReady != null) __obj.updateDynamic("onMapReady")(js.Any.fromFunction1((t0: /* map */ js.Any) => onMapReady(t0).runNow()))
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonMap) => onOverlayClick(t0).runNow()))
    if (onOverlayDrag != null) __obj.updateDynamic("onOverlayDrag")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onOverlayDrag(t0).runNow()))
    if (onOverlayDragEnd != null) __obj.updateDynamic("onOverlayDragEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onOverlayDragEnd(t0).runNow()))
    if (onOverlayDragStart != null) __obj.updateDynamic("onOverlayDragStart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onOverlayDragStart(t0).runNow()))
    onZoomChanged.foreach(p => __obj.updateDynamic("onZoomChanged")(p.toJsFn))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (overlays != null) __obj.updateDynamic("overlays")(overlays.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[GMapProps]
  }
}

