package typingsJapgolly.reactSimpleMaps.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGGElement
import typingsJapgolly.react.mod.SVGAttributes
import typingsJapgolly.reactSimpleMaps.mod.Point
import typingsJapgolly.reactSimpleMaps.mod.Position
import typingsJapgolly.reactSimpleMaps.mod.ZoomableGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ZoomableGroup {
  def apply(
    SVGAttributes: SVGAttributes[SVGGElement] = null,
    center: Point = null,
    disablePanning: js.UndefOr[Boolean] = js.undefined,
    disableZooming: js.UndefOr[Boolean] = js.undefined,
    maxZoom: Int | Double = null,
    minZoom: Int | Double = null,
    onMoveEnd: (/* event */ js.Any, /* position */ Position) => Callback = null,
    onMoveStart: (/* event */ js.Any, /* position */ Position) => Callback = null,
    onZoomEnd: (/* event */ js.Any, /* position */ Position) => Callback = null,
    onZoomStart: (/* event */ js.Any, /* position */ Position) => Callback = null,
    zoom: Int | Double = null,
    zoomSensitivity: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ZoomableGroupProps, 
    MountedWithRawType[ZoomableGroupProps, js.Object, RawMounted[ZoomableGroupProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (SVGAttributes != null) js.Dynamic.global.Object.assign(__obj, SVGAttributes)
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(disablePanning)) __obj.updateDynamic("disablePanning")(disablePanning.asInstanceOf[js.Any])
    if (!js.isUndefined(disableZooming)) __obj.updateDynamic("disableZooming")(disableZooming.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (onMoveEnd != null) __obj.updateDynamic("onMoveEnd")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* position */ typingsJapgolly.reactSimpleMaps.mod.Position) => onMoveEnd(t0, t1).runNow()))
    if (onMoveStart != null) __obj.updateDynamic("onMoveStart")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* position */ typingsJapgolly.reactSimpleMaps.mod.Position) => onMoveStart(t0, t1).runNow()))
    if (onZoomEnd != null) __obj.updateDynamic("onZoomEnd")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* position */ typingsJapgolly.reactSimpleMaps.mod.Position) => onZoomEnd(t0, t1).runNow()))
    if (onZoomStart != null) __obj.updateDynamic("onZoomStart")(js.Any.fromFunction2((t0: /* event */ js.Any, t1: /* position */ typingsJapgolly.reactSimpleMaps.mod.Position) => onZoomStart(t0, t1).runNow()))
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    if (zoomSensitivity != null) __obj.updateDynamic("zoomSensitivity")(zoomSensitivity.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactSimpleMaps.mod.ZoomableGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSimpleMaps.mod.ZoomableGroupProps])(children: _*)
  }
  @JSImport("react-simple-maps", "ZoomableGroup")
  @js.native
  object componentImport extends js.Object
  
}

