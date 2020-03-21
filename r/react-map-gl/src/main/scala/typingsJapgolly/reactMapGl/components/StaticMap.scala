package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactMapGl.AnonHeight
import typingsJapgolly.reactMapGl.AnonMaxPitch
import typingsJapgolly.reactMapGl.mod.MapError
import typingsJapgolly.reactMapGl.mod.MapLoadEvent
import typingsJapgolly.reactMapGl.mod.MapRequest
import typingsJapgolly.reactMapGl.mod.StaticMapProps
import typingsJapgolly.reactMapGl.mod.ViewState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StaticMap {
  def apply(
    height: Double | String,
    width: Double | String,
    altitude: Int | Double = null,
    attributionControl: js.UndefOr[Boolean] = js.undefined,
    bearing: Int | Double = null,
    className: String = null,
    container: js.Object = null,
    disableTokenWarning: js.UndefOr[Boolean] = js.undefined,
    gl: js.Object = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    mapOptions: js.Object = null,
    mapStyle: String | js.Object = null,
    mapboxApiAccessToken: String = null,
    onError: /* e */ MapError => Callback = null,
    onLoad: /* event */ MapLoadEvent => Callback = null,
    onResize: /* dimensions */ AnonHeight => Callback = null,
    pitch: Int | Double = null,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    preventStyleDiffing: js.UndefOr[Boolean] = js.undefined,
    reuseMap: js.UndefOr[Boolean] = js.undefined,
    reuseMaps: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    transformRequest: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => CallbackTo[MapRequest] = null,
    viewState: ViewState = null,
    visibilityConstraints: AnonMaxPitch = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StaticMapProps, typingsJapgolly.reactMapGl.mod.StaticMap, Unit, StaticMapProps] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTokenWarning)) __obj.updateDynamic("disableTokenWarning")(disableTokenWarning.asInstanceOf[js.Any])
    if (gl != null) __obj.updateDynamic("gl")(gl.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions.asInstanceOf[js.Any])
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (mapboxApiAccessToken != null) __obj.updateDynamic("mapboxApiAccessToken")(mapboxApiAccessToken.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactMapGl.mod.MapError) => onError(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.MapLoadEvent) => onLoad(t0).runNow()))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* dimensions */ typingsJapgolly.reactMapGl.AnonHeight) => onResize(t0).runNow()))
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(preventStyleDiffing)) __obj.updateDynamic("preventStyleDiffing")(preventStyleDiffing.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseMap)) __obj.updateDynamic("reuseMap")(reuseMap.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseMaps)) __obj.updateDynamic("reuseMaps")(reuseMaps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction2((t0: /* url */ js.UndefOr[java.lang.String], t1: /* resourceType */ js.UndefOr[java.lang.String]) => transformRequest(t0, t1).runNow()))
    if (viewState != null) __obj.updateDynamic("viewState")(viewState.asInstanceOf[js.Any])
    if (visibilityConstraints != null) __obj.updateDynamic("visibilityConstraints")(visibilityConstraints.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMapGl.mod.StaticMapProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMapGl.mod.StaticMap](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMapGl.mod.StaticMapProps])(children: _*)
  }
  @JSImport("react-map-gl", "StaticMap")
  @js.native
  object componentImport extends js.Object
  
}

