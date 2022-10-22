package typingsJapgolly.reactMapGl.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMapGl.anon.Height
import typingsJapgolly.reactMapGl.anon.MaxPitch
import typingsJapgolly.reactMapGl.mod.ContextViewStateChangeInfo
import typingsJapgolly.reactMapGl.mod.ExtraState
import typingsJapgolly.reactMapGl.mod.MapController
import typingsJapgolly.reactMapGl.mod.MapError
import typingsJapgolly.reactMapGl.mod.MapLoadEvent
import typingsJapgolly.reactMapGl.mod.MapRequest
import typingsJapgolly.reactMapGl.mod.PointerEvent
import typingsJapgolly.reactMapGl.mod.TRANSITION_EVENTS
import typingsJapgolly.reactMapGl.mod.TransitionInterpolator
import typingsJapgolly.reactMapGl.mod.ViewState
import typingsJapgolly.reactMapGl.mod.ViewportProps
import typingsJapgolly.reactMapGl.reactMapGlStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_InteractiveMapProps193159941[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def altitude(value: Double): this.type = set("altitude", value.asInstanceOf[js.Any])
  
  inline def attributionControl(value: Boolean): this.type = set("attributionControl", value.asInstanceOf[js.Any])
  
  inline def bearing(value: Double): this.type = set("bearing", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def clickRadius(value: Double): this.type = set("clickRadius", value.asInstanceOf[js.Any])
  
  inline def container(value: js.Object): this.type = set("container", value.asInstanceOf[js.Any])
  
  inline def controller(value: MapController): this.type = set("controller", value.asInstanceOf[js.Any])
  
  inline def disableTokenWarning(value: Boolean): this.type = set("disableTokenWarning", value.asInstanceOf[js.Any])
  
  inline def doubleClickZoom(value: Boolean): this.type = set("doubleClickZoom", value.asInstanceOf[js.Any])
  
  inline def dragPan(value: Boolean): this.type = set("dragPan", value.asInstanceOf[js.Any])
  
  inline def dragRotate(value: Boolean): this.type = set("dragRotate", value.asInstanceOf[js.Any])
  
  inline def getCursor(value: /* state */ ExtraState => Callback): this.type = set("getCursor", js.Any.fromFunction1((t0: /* state */ ExtraState) => value(t0).runNow()))
  
  inline def gl(value: js.Object): this.type = set("gl", value.asInstanceOf[js.Any])
  
  inline def interactiveLayerIds(value: js.Array[String]): this.type = set("interactiveLayerIds", value.asInstanceOf[js.Any])
  
  inline def interactiveLayerIdsVarargs(value: String*): this.type = set("interactiveLayerIds", js.Array(value*))
  
  inline def keyboard(value: Boolean): this.type = set("keyboard", value.asInstanceOf[js.Any])
  
  inline def latitude(value: Double): this.type = set("latitude", value.asInstanceOf[js.Any])
  
  inline def longitude(value: Double): this.type = set("longitude", value.asInstanceOf[js.Any])
  
  inline def mapOptions(value: js.Object): this.type = set("mapOptions", value.asInstanceOf[js.Any])
  
  inline def mapStyle(value: String | js.Object): this.type = set("mapStyle", value.asInstanceOf[js.Any])
  
  inline def mapboxApiAccessToken(value: String): this.type = set("mapboxApiAccessToken", value.asInstanceOf[js.Any])
  
  inline def mapboxApiUrl(value: String): this.type = set("mapboxApiUrl", value.asInstanceOf[js.Any])
  
  inline def maxPitch(value: Double): this.type = set("maxPitch", value.asInstanceOf[js.Any])
  
  inline def maxZoom(value: Double): this.type = set("maxZoom", value.asInstanceOf[js.Any])
  
  inline def minPitch(value: Double): this.type = set("minPitch", value.asInstanceOf[js.Any])
  
  inline def minZoom(value: Double): this.type = set("minZoom", value.asInstanceOf[js.Any])
  
  inline def onClick(value: /* event */ PointerEvent => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onContextMenu(value: /* event */ PointerEvent => Callback): this.type = set("onContextMenu", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onDblClick(value: /* event */ PointerEvent => Callback): this.type = set("onDblClick", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onError(value: /* e */ MapError => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* e */ MapError) => value(t0).runNow()))
  
  inline def onHover(value: /* event */ PointerEvent => Callback): this.type = set("onHover", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onInteractionStateChange(value: /* state */ ExtraState => Callback): this.type = set("onInteractionStateChange", js.Any.fromFunction1((t0: /* state */ ExtraState) => value(t0).runNow()))
  
  inline def onLoad(value: /* event */ MapLoadEvent => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: /* event */ MapLoadEvent) => value(t0).runNow()))
  
  inline def onMouseDown(value: /* event */ PointerEvent => Callback): this.type = set("onMouseDown", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onMouseEnter(value: /* event */ PointerEvent => Callback): this.type = set("onMouseEnter", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onMouseLeave(value: /* event */ PointerEvent => Callback): this.type = set("onMouseLeave", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onMouseMove(value: /* event */ PointerEvent => Callback): this.type = set("onMouseMove", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onMouseOut(value: /* event */ PointerEvent => Callback): this.type = set("onMouseOut", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onMouseUp(value: /* event */ PointerEvent => Callback): this.type = set("onMouseUp", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onNativeClick(value: /* event */ PointerEvent => Callback): this.type = set("onNativeClick", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onResize(value: /* dimensions */ Height => Callback): this.type = set("onResize", js.Any.fromFunction1((t0: /* dimensions */ Height) => value(t0).runNow()))
  
  inline def onTouchEnd(value: /* event */ PointerEvent => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onTouchMove(value: /* event */ PointerEvent => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onTouchStart(value: /* event */ PointerEvent => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def onTransitionEnd(value: Callback): this.type = set("onTransitionEnd", value.toJsFn)
  
  inline def onTransitionInterrupt(value: Callback): this.type = set("onTransitionInterrupt", value.toJsFn)
  
  inline def onTransitionStart(value: Callback): this.type = set("onTransitionStart", value.toJsFn)
  
  inline def onViewStateChange(value: /* info */ ContextViewStateChangeInfo => Callback): this.type = set("onViewStateChange", js.Any.fromFunction1((t0: /* info */ ContextViewStateChangeInfo) => value(t0).runNow()))
  
  inline def onViewportChange(
    value: (/* viewState */ ViewportProps, /* interactionState */ ExtraState, /* oldViewState */ ViewportProps) => Callback
  ): this.type = set("onViewportChange", js.Any.fromFunction3((t0: /* viewState */ ViewportProps, t1: /* interactionState */ ExtraState, t2: /* oldViewState */ ViewportProps) => (value(t0, t1, t2)).runNow()))
  
  inline def onWheel(value: /* event */ PointerEvent => Callback): this.type = set("onWheel", js.Any.fromFunction1((t0: /* event */ PointerEvent) => value(t0).runNow()))
  
  inline def pitch(value: Double): this.type = set("pitch", value.asInstanceOf[js.Any])
  
  inline def preserveDrawingBuffer(value: Boolean): this.type = set("preserveDrawingBuffer", value.asInstanceOf[js.Any])
  
  inline def preventStyleDiffing(value: Boolean): this.type = set("preventStyleDiffing", value.asInstanceOf[js.Any])
  
  inline def reuseMap(value: Boolean): this.type = set("reuseMap", value.asInstanceOf[js.Any])
  
  inline def reuseMaps(value: Boolean): this.type = set("reuseMaps", value.asInstanceOf[js.Any])
  
  inline def scrollZoom(value: Boolean): this.type = set("scrollZoom", value.asInstanceOf[js.Any])
  
  inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def touchAction(value: String): this.type = set("touchAction", value.asInstanceOf[js.Any])
  
  inline def touchRotate(value: Boolean): this.type = set("touchRotate", value.asInstanceOf[js.Any])
  
  inline def touchZoom(value: Boolean): this.type = set("touchZoom", value.asInstanceOf[js.Any])
  
  inline def transformRequest(value: (/* url */ js.UndefOr[String], /* resourceType */ js.UndefOr[String]) => MapRequest): this.type = set("transformRequest", js.Any.fromFunction2(value))
  
  inline def transitionDuration(value: Double | auto): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
  
  inline def transitionEasing(value: /* t */ Double => Double): this.type = set("transitionEasing", js.Any.fromFunction1(value))
  
  inline def transitionInterpolator(value: TransitionInterpolator): this.type = set("transitionInterpolator", value.asInstanceOf[js.Any])
  
  inline def transitionInterruption(value: TRANSITION_EVENTS): this.type = set("transitionInterruption", value.asInstanceOf[js.Any])
  
  inline def viewState(value: ViewState): this.type = set("viewState", value.asInstanceOf[js.Any])
  
  inline def visibilityConstraints(value: MaxPitch): this.type = set("visibilityConstraints", value.asInstanceOf[js.Any])
  
  inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  
  inline def zoom(value: Double): this.type = set("zoom", value.asInstanceOf[js.Any])
}
