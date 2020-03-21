package typingsJapgolly.googleMapReact.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.googleMapReact.AnonMap
import typingsJapgolly.react.mod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var bootstrapURLKeys: js.UndefOr[BootstrapURLKeys] = js.undefined
  var center: js.UndefOr[Coords] = js.undefined
  var debounced: js.UndefOr[Boolean] = js.undefined
  var defaultCenter: js.UndefOr[Coords] = js.undefined
  var defaultZoom: js.UndefOr[Double] = js.undefined
  var distanceToMouse: js.UndefOr[
    js.Function3[/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object], Double]
  ] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var googleMapLoader: js.UndefOr[js.Function1[/* bootstrapURLKeys */ js.Any, Unit]] = js.undefined
  var heatmapLibrary: js.UndefOr[Boolean] = js.undefined
  var hoverDistance: js.UndefOr[Double] = js.undefined
  var layerTypes: js.UndefOr[js.Array[String]] = js.undefined
  var margin: js.UndefOr[js.Array[_]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ ChangeEventValue, _]] = js.undefined
  var onChildClick: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, Unit]] = js.undefined
  var onChildMouseDown: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, Unit]
  ] = js.undefined
  var onChildMouseEnter: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, Unit]] = js.undefined
  var onChildMouseLeave: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, Unit]] = js.undefined
  var onChildMouseMove: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, Unit]
  ] = js.undefined
  var onChildMouseUp: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, Unit]
  ] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* value */ ClickEventValue, _]] = js.undefined
  var onDrag: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.undefined
  var onDragEnd: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.undefined
  var onGoogleApiLoaded: js.UndefOr[js.Function1[/* maps */ AnonMap, Unit]] = js.undefined
  var onMapTypeIdChange: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.undefined
  var onTilesLoaded: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onZoomAnimationEnd: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.undefined
  var onZoomAnimationStart: js.UndefOr[js.Function1[/* args */ js.Any, Unit]] = js.undefined
  var options: js.UndefOr[MapOptions | (js.Function1[/* maps */ Maps, MapOptions])] = js.undefined
  var resetBoundsOnResize: js.UndefOr[Boolean] = js.undefined
  var shouldUnregisterMapOnUnmount: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[HTMLProps[HTMLDivElement]] = js.undefined
  var yesIWantToUseGoogleMapApiInternals: js.UndefOr[Boolean] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    bootstrapURLKeys: BootstrapURLKeys = null,
    center: Coords = null,
    debounced: js.UndefOr[Boolean] = js.undefined,
    defaultCenter: Coords = null,
    defaultZoom: Int | Double = null,
    distanceToMouse: (/* pt */ Point, /* mousePos */ Point, /* markerProps */ js.UndefOr[js.Object]) => CallbackTo[Double] = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    googleMapLoader: /* bootstrapURLKeys */ js.Any => Callback = null,
    heatmapLibrary: js.UndefOr[Boolean] = js.undefined,
    hoverDistance: Int | Double = null,
    layerTypes: js.Array[String] = null,
    margin: js.Array[_] = null,
    onChange: /* value */ ChangeEventValue => CallbackTo[js.Any] = null,
    onChildClick: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Callback = null,
    onChildMouseDown: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Callback = null,
    onChildMouseEnter: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Callback = null,
    onChildMouseLeave: (/* hoverKey */ js.Any, /* childProps */ js.Any) => Callback = null,
    onChildMouseMove: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Callback = null,
    onChildMouseUp: (/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any) => Callback = null,
    onClick: /* value */ ClickEventValue => CallbackTo[js.Any] = null,
    onDrag: /* map */ js.Any => Callback = null,
    onDragEnd: /* map */ js.Any => Callback = null,
    onGoogleApiLoaded: /* maps */ AnonMap => Callback = null,
    onMapTypeIdChange: /* args */ js.Any => Callback = null,
    onTilesLoaded: js.UndefOr[Callback] = js.undefined,
    onZoomAnimationEnd: /* args */ js.Any => Callback = null,
    onZoomAnimationStart: /* args */ js.Any => Callback = null,
    options: MapOptions | (js.Function1[/* maps */ Maps, MapOptions]) = null,
    resetBoundsOnResize: js.UndefOr[Boolean] = js.undefined,
    shouldUnregisterMapOnUnmount: js.UndefOr[Boolean] = js.undefined,
    style: HTMLProps[HTMLDivElement] = null,
    yesIWantToUseGoogleMapApiInternals: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (bootstrapURLKeys != null) __obj.updateDynamic("bootstrapURLKeys")(bootstrapURLKeys.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(debounced)) __obj.updateDynamic("debounced")(debounced.asInstanceOf[js.Any])
    if (defaultCenter != null) __obj.updateDynamic("defaultCenter")(defaultCenter.asInstanceOf[js.Any])
    if (defaultZoom != null) __obj.updateDynamic("defaultZoom")(defaultZoom.asInstanceOf[js.Any])
    if (distanceToMouse != null) __obj.updateDynamic("distanceToMouse")(js.Any.fromFunction3((t0: /* pt */ typingsJapgolly.googleMapReact.mod.Point, t1: /* mousePos */ typingsJapgolly.googleMapReact.mod.Point, t2: /* markerProps */ js.UndefOr[js.Object]) => distanceToMouse(t0, t1, t2).runNow()))
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (googleMapLoader != null) __obj.updateDynamic("googleMapLoader")(js.Any.fromFunction1((t0: /* bootstrapURLKeys */ js.Any) => googleMapLoader(t0).runNow()))
    if (!js.isUndefined(heatmapLibrary)) __obj.updateDynamic("heatmapLibrary")(heatmapLibrary.asInstanceOf[js.Any])
    if (hoverDistance != null) __obj.updateDynamic("hoverDistance")(hoverDistance.asInstanceOf[js.Any])
    if (layerTypes != null) __obj.updateDynamic("layerTypes")(layerTypes.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.googleMapReact.mod.ChangeEventValue) => onChange(t0).runNow()))
    if (onChildClick != null) __obj.updateDynamic("onChildClick")(js.Any.fromFunction2((t0: /* hoverKey */ js.Any, t1: /* childProps */ js.Any) => onChildClick(t0, t1).runNow()))
    if (onChildMouseDown != null) __obj.updateDynamic("onChildMouseDown")(js.Any.fromFunction3((t0: /* childKey */ js.Any, t1: /* childProps */ js.Any, t2: /* mouse */ js.Any) => onChildMouseDown(t0, t1, t2).runNow()))
    if (onChildMouseEnter != null) __obj.updateDynamic("onChildMouseEnter")(js.Any.fromFunction2((t0: /* hoverKey */ js.Any, t1: /* childProps */ js.Any) => onChildMouseEnter(t0, t1).runNow()))
    if (onChildMouseLeave != null) __obj.updateDynamic("onChildMouseLeave")(js.Any.fromFunction2((t0: /* hoverKey */ js.Any, t1: /* childProps */ js.Any) => onChildMouseLeave(t0, t1).runNow()))
    if (onChildMouseMove != null) __obj.updateDynamic("onChildMouseMove")(js.Any.fromFunction3((t0: /* childKey */ js.Any, t1: /* childProps */ js.Any, t2: /* mouse */ js.Any) => onChildMouseMove(t0, t1, t2).runNow()))
    if (onChildMouseUp != null) __obj.updateDynamic("onChildMouseUp")(js.Any.fromFunction3((t0: /* childKey */ js.Any, t1: /* childProps */ js.Any, t2: /* mouse */ js.Any) => onChildMouseUp(t0, t1, t2).runNow()))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.googleMapReact.mod.ClickEventValue) => onClick(t0).runNow()))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1((t0: /* map */ js.Any) => onDrag(t0).runNow()))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1((t0: /* map */ js.Any) => onDragEnd(t0).runNow()))
    if (onGoogleApiLoaded != null) __obj.updateDynamic("onGoogleApiLoaded")(js.Any.fromFunction1((t0: /* maps */ typingsJapgolly.googleMapReact.AnonMap) => onGoogleApiLoaded(t0).runNow()))
    if (onMapTypeIdChange != null) __obj.updateDynamic("onMapTypeIdChange")(js.Any.fromFunction1((t0: /* args */ js.Any) => onMapTypeIdChange(t0).runNow()))
    onTilesLoaded.foreach(p => __obj.updateDynamic("onTilesLoaded")(p.toJsFn))
    if (onZoomAnimationEnd != null) __obj.updateDynamic("onZoomAnimationEnd")(js.Any.fromFunction1((t0: /* args */ js.Any) => onZoomAnimationEnd(t0).runNow()))
    if (onZoomAnimationStart != null) __obj.updateDynamic("onZoomAnimationStart")(js.Any.fromFunction1((t0: /* args */ js.Any) => onZoomAnimationStart(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(resetBoundsOnResize)) __obj.updateDynamic("resetBoundsOnResize")(resetBoundsOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldUnregisterMapOnUnmount)) __obj.updateDynamic("shouldUnregisterMapOnUnmount")(shouldUnregisterMapOnUnmount.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(yesIWantToUseGoogleMapApiInternals)) __obj.updateDynamic("yesIWantToUseGoogleMapApiInternals")(yesIWantToUseGoogleMapApiInternals.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

