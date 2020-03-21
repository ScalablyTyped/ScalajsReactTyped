package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactMapGl.AnonHeight
import typingsJapgolly.reactMapGl.AnonMaxPitch
import typingsJapgolly.reactMapGl.reactMapGlStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveMapProps extends StaticMapProps {
  var clickRadius: js.UndefOr[Double] = js.undefined
  var controller: js.UndefOr[MapController] = js.undefined
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
  var dragPan: js.UndefOr[Boolean] = js.undefined
  var dragRotate: js.UndefOr[Boolean] = js.undefined
  var getCursor: js.UndefOr[js.Function1[/* state */ ExtraState, Unit]] = js.undefined
  var interactiveLayerIds: js.UndefOr[js.Array[String]] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var maxPitch: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minPitch: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onDblClick: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onHover: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onInteractionStateChange: js.UndefOr[js.Function1[/* state */ ExtraState, Unit]] = js.undefined
  var onMouseDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onMouseMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onMouseOut: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onMouseUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onNativeClick: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onTouchEnd: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onTouchMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onTouchStart: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var onTransitionEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionInterrupt: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onViewStateChange: js.UndefOr[ContextViewStateChangeHandler] = js.undefined
  var onViewportChange: js.UndefOr[ContextViewportChangeHandler] = js.undefined
  var onWheel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
  var touchAction: js.UndefOr[String] = js.undefined
  var touchRotate: js.UndefOr[Boolean] = js.undefined
  var touchZoom: js.UndefOr[Boolean] = js.undefined
  var transitionDuration: js.UndefOr[Double | auto] = js.undefined
  var transitionEasing: js.UndefOr[EasingFunction] = js.undefined
  var transitionInterpolator: js.UndefOr[TransitionInterpolator] = js.undefined
  var transitionInterruption: js.UndefOr[TRANSITION_EVENTS] = js.undefined
}

object InteractiveMapProps {
  @scala.inline
  def apply(
    height: Double | String,
    width: Double | String,
    altitude: Int | Double = null,
    attributionControl: js.UndefOr[Boolean] = js.undefined,
    bearing: Int | Double = null,
    className: String = null,
    clickRadius: Int | Double = null,
    container: js.Object = null,
    controller: MapController = null,
    disableTokenWarning: js.UndefOr[Boolean] = js.undefined,
    doubleClickZoom: js.UndefOr[Boolean] = js.undefined,
    dragPan: js.UndefOr[Boolean] = js.undefined,
    dragRotate: js.UndefOr[Boolean] = js.undefined,
    getCursor: /* state */ ExtraState => Callback = null,
    gl: js.Object = null,
    interactiveLayerIds: js.Array[String] = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    mapOptions: js.Object = null,
    mapStyle: String | js.Object = null,
    mapboxApiAccessToken: String = null,
    maxPitch: Int | Double = null,
    maxZoom: Int | Double = null,
    minPitch: Int | Double = null,
    minZoom: Int | Double = null,
    onClick: /* event */ PointerEvent => Callback = null,
    onContextMenu: /* event */ PointerEvent => Callback = null,
    onDblClick: /* event */ PointerEvent => Callback = null,
    onError: /* e */ MapError => Callback = null,
    onHover: /* event */ PointerEvent => Callback = null,
    onInteractionStateChange: /* state */ ExtraState => Callback = null,
    onLoad: /* event */ MapLoadEvent => Callback = null,
    onMouseDown: /* event */ PointerEvent => Callback = null,
    onMouseEnter: /* event */ PointerEvent => Callback = null,
    onMouseLeave: /* event */ PointerEvent => Callback = null,
    onMouseMove: /* event */ PointerEvent => Callback = null,
    onMouseOut: /* event */ PointerEvent => Callback = null,
    onMouseUp: /* event */ PointerEvent => Callback = null,
    onNativeClick: /* event */ PointerEvent => Callback = null,
    onResize: /* dimensions */ AnonHeight => Callback = null,
    onTouchEnd: /* event */ PointerEvent => Callback = null,
    onTouchMove: /* event */ PointerEvent => Callback = null,
    onTouchStart: /* event */ PointerEvent => Callback = null,
    onTransitionEnd: js.UndefOr[Callback] = js.undefined,
    onTransitionInterrupt: js.UndefOr[Callback] = js.undefined,
    onTransitionStart: js.UndefOr[Callback] = js.undefined,
    onViewStateChange: /* info */ ContextViewStateChangeInfo => Callback = null,
    onViewportChange: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Callback = null,
    onWheel: /* event */ PointerEvent => Callback = null,
    pitch: Int | Double = null,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined,
    preventStyleDiffing: js.UndefOr[Boolean] = js.undefined,
    reuseMap: js.UndefOr[Boolean] = js.undefined,
    reuseMaps: js.UndefOr[Boolean] = js.undefined,
    scrollZoom: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    touchAction: String = null,
    touchRotate: js.UndefOr[Boolean] = js.undefined,
    touchZoom: js.UndefOr[Boolean] = js.undefined,
    transformRequest: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => CallbackTo[MapRequest] = null,
    transitionDuration: Double | auto = null,
    transitionEasing: /* t */ Double => CallbackTo[Double] = null,
    transitionInterpolator: TransitionInterpolator = null,
    transitionInterruption: TRANSITION_EVENTS = null,
    viewState: ViewState = null,
    visibilityConstraints: AnonMaxPitch = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zoom: Int | Double = null
  ): InteractiveMapProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (!js.isUndefined(attributionControl)) __obj.updateDynamic("attributionControl")(attributionControl.asInstanceOf[js.Any])
    if (bearing != null) __obj.updateDynamic("bearing")(bearing.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (clickRadius != null) __obj.updateDynamic("clickRadius")(clickRadius.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (!js.isUndefined(disableTokenWarning)) __obj.updateDynamic("disableTokenWarning")(disableTokenWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleClickZoom)) __obj.updateDynamic("doubleClickZoom")(doubleClickZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(dragPan)) __obj.updateDynamic("dragPan")(dragPan.asInstanceOf[js.Any])
    if (!js.isUndefined(dragRotate)) __obj.updateDynamic("dragRotate")(dragRotate.asInstanceOf[js.Any])
    if (getCursor != null) __obj.updateDynamic("getCursor")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.reactMapGl.mod.ExtraState) => getCursor(t0).runNow()))
    if (gl != null) __obj.updateDynamic("gl")(gl.asInstanceOf[js.Any])
    if (interactiveLayerIds != null) __obj.updateDynamic("interactiveLayerIds")(interactiveLayerIds.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (mapOptions != null) __obj.updateDynamic("mapOptions")(mapOptions.asInstanceOf[js.Any])
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (mapboxApiAccessToken != null) __obj.updateDynamic("mapboxApiAccessToken")(mapboxApiAccessToken.asInstanceOf[js.Any])
    if (maxPitch != null) __obj.updateDynamic("maxPitch")(maxPitch.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minPitch != null) __obj.updateDynamic("minPitch")(minPitch.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onClick(t0).runNow()))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onContextMenu(t0).runNow()))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onDblClick(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactMapGl.mod.MapError) => onError(t0).runNow()))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onHover(t0).runNow()))
    if (onInteractionStateChange != null) __obj.updateDynamic("onInteractionStateChange")(js.Any.fromFunction1((t0: /* state */ typingsJapgolly.reactMapGl.mod.ExtraState) => onInteractionStateChange(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.MapLoadEvent) => onLoad(t0).runNow()))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onMouseDown(t0).runNow()))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onMouseLeave(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onMouseMove(t0).runNow()))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onMouseOut(t0).runNow()))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onMouseUp(t0).runNow()))
    if (onNativeClick != null) __obj.updateDynamic("onNativeClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onNativeClick(t0).runNow()))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1((t0: /* dimensions */ typingsJapgolly.reactMapGl.AnonHeight) => onResize(t0).runNow()))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onTouchEnd(t0).runNow()))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onTouchMove(t0).runNow()))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onTouchStart(t0).runNow()))
    onTransitionEnd.foreach(p => __obj.updateDynamic("onTransitionEnd")(p.toJsFn))
    onTransitionInterrupt.foreach(p => __obj.updateDynamic("onTransitionInterrupt")(p.toJsFn))
    onTransitionStart.foreach(p => __obj.updateDynamic("onTransitionStart")(p.toJsFn))
    if (onViewStateChange != null) __obj.updateDynamic("onViewStateChange")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.reactMapGl.mod.ContextViewStateChangeInfo) => onViewStateChange(t0).runNow()))
    if (onViewportChange != null) __obj.updateDynamic("onViewportChange")(js.Any.fromFunction3((t0: /* viewState */ typingsJapgolly.reactMapGl.mod.ViewportProps, t1: /* interactionState */ typingsJapgolly.reactMapGl.mod.ExtraState, t2: /* oldViewState */ typingsJapgolly.reactMapGl.mod.ViewportProps) => onViewportChange(t0, t1, t2).runNow()))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.reactMapGl.mod.PointerEvent) => onWheel(t0).runNow()))
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(preventStyleDiffing)) __obj.updateDynamic("preventStyleDiffing")(preventStyleDiffing.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseMap)) __obj.updateDynamic("reuseMap")(reuseMap.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseMaps)) __obj.updateDynamic("reuseMaps")(reuseMaps.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollZoom)) __obj.updateDynamic("scrollZoom")(scrollZoom.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (touchAction != null) __obj.updateDynamic("touchAction")(touchAction.asInstanceOf[js.Any])
    if (!js.isUndefined(touchRotate)) __obj.updateDynamic("touchRotate")(touchRotate.asInstanceOf[js.Any])
    if (!js.isUndefined(touchZoom)) __obj.updateDynamic("touchZoom")(touchZoom.asInstanceOf[js.Any])
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(js.Any.fromFunction2((t0: /* url */ js.UndefOr[java.lang.String], t1: /* resourceType */ js.UndefOr[java.lang.String]) => transformRequest(t0, t1).runNow()))
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (transitionEasing != null) __obj.updateDynamic("transitionEasing")(js.Any.fromFunction1((t0: /* t */ scala.Double) => transitionEasing(t0).runNow()))
    if (transitionInterpolator != null) __obj.updateDynamic("transitionInterpolator")(transitionInterpolator.asInstanceOf[js.Any])
    if (transitionInterruption != null) __obj.updateDynamic("transitionInterruption")(transitionInterruption.asInstanceOf[js.Any])
    if (viewState != null) __obj.updateDynamic("viewState")(viewState.asInstanceOf[js.Any])
    if (visibilityConstraints != null) __obj.updateDynamic("visibilityConstraints")(visibilityConstraints.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveMapProps]
  }
}

