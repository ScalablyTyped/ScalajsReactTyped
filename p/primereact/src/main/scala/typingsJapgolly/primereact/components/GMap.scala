package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonMap
import typingsJapgolly.primereact.gmapMod.GMapProps
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GMap {
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
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GMapProps, typingsJapgolly.primereact.primereactGmapMod.GMap, Unit, GMapProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.gmapMod.GMapProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactGmapMod.GMap](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.gmapMod.GMapProps])(children: _*)
  }
  @JSImport("primereact/gmap", "GMap")
  @js.native
  object componentImport extends js.Object
  
}

