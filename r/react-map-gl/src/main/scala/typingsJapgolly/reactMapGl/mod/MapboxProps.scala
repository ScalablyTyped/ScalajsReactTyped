package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<react-map-gl.react-map-gl.ViewState> */
trait MapboxProps extends js.Object {
  var altitude: js.UndefOr[Double] = js.undefined
  var attributionControl: js.UndefOr[Boolean] = js.undefined
  var bearing: js.UndefOr[Double] = js.undefined
  var container: js.UndefOr[js.Object] = js.undefined
  var gl: js.UndefOr[js.Object] = js.undefined
  var height: Double | String
  var latitude: js.UndefOr[Double] = js.undefined
  var longitude: js.UndefOr[Double] = js.undefined
  var mapOptions: js.UndefOr[js.Object] = js.undefined
  var mapStyle: js.UndefOr[String | js.Object] = js.undefined
  var mapboxApiAccessToken: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* e */ MapError, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function1[/* event */ MapLoadEvent, Unit]] = js.undefined
  var pitch: js.UndefOr[Double] = js.undefined
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  var reuseMap: js.UndefOr[Boolean] = js.undefined
  var reuseMaps: js.UndefOr[Boolean] = js.undefined
  var transformRequest: js.UndefOr[
    js.Function2[/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String], MapRequest]
  ] = js.undefined
  var viewState: js.UndefOr[ViewState] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: Double | String
  var zoom: js.UndefOr[Double] = js.undefined
}

object MapboxProps {
  @scala.inline
  def apply(
    height: Double | String,
    width: Double | String,
    altitude: Int | Double = null,
    attributionControl: js.UndefOr[Boolean] = js.undefined,
    bearing: Int | Double = null,
    container: js.Object = null,
    gl: js.Object = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    mapOptions: js.Object = null,
    mapStyle: String | js.Object = null,
    mapboxApiAccessToken: String = null,
    onError: /* e */ MapError => Callback = null,
    onLoad: /* event */ MapLoadEvent => Callback = null,
    pitch: Int | Double = null,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    reuseMap: js.UndefOr[Boolean] = js.undefined,
    reuseMaps: js.UndefOr[Boolean] = js.undefined,
    transformRequest: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => CallbackTo[MapRequest] = null,
    viewState: ViewState = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null
  ): MapboxProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (gl != null) __obj.updateDynamic("gl")(gl.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions.asInstanceOf[js.Any])
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (mapboxApiAccessToken != null) __obj.updateDynamic("mapboxApiAccessToken")(mapboxApiAccessToken.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactMapGl.mod.MapError) => onError(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.MapLoadEvent) => onLoad(t0).runNow()))
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseMap)) __obj.updateDynamic("reuseMap")(reuseMap.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseMaps)) __obj.updateDynamic("reuseMaps")(reuseMaps.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction2((t0: /* url */ js.UndefOr[java.lang.String], t1: /* resourceType */ js.UndefOr[java.lang.String]) => transformRequest(t0, t1).runNow()))
    if (viewState != null) __obj.updateDynamic("viewState")(viewState.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapboxProps]
  }
}

