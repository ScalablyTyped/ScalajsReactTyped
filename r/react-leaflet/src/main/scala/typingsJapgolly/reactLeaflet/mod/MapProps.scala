package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.leaflet.mod.FitBoundsOptions
import typingsJapgolly.leaflet.mod.LatLngBoundsExpression
import typingsJapgolly.leaflet.mod.LatLngTuple
import typingsJapgolly.leaflet.mod.MapOptions
import typingsJapgolly.leaflet.mod.PointExpression
import typingsJapgolly.leaflet.mod.ZoomOptions
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.leaflet.mod.FitBoundsOptions because var conflicts: easeLinearity, maxZoom. Inlined noMoveStart, padding, duration, paddingBottomRight, paddingTopLeft
- typingsJapgolly.leaflet.mod.LocateOptions because var conflicts: maxZoom. Inlined setView, enableHighAccuracy, maximumAge, timeout, watch */ trait MapProps
  extends StObject
     with MapEvents
     with MapOptions
     with ZoomOptions {
  
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
  
  var boundsOptions: js.UndefOr[FitBoundsOptions] = js.undefined
  
  var children: Children
  
  var className: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var maximumAge: js.UndefOr[Double] = js.undefined
  
  var noMoveStart: js.UndefOr[Boolean] = js.undefined
  
  var onViewportChange: js.UndefOr[js.Function1[/* viewport */ Viewport, Unit]] = js.undefined
  
  var onViewportChanged: js.UndefOr[js.Function1[/* viewport */ Viewport, Unit]] = js.undefined
  
  var padding: js.UndefOr[PointExpression] = js.undefined
  
  var paddingBottomRight: js.UndefOr[PointExpression] = js.undefined
  
  var paddingTopLeft: js.UndefOr[PointExpression] = js.undefined
  
  var setView: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var useFlyTo: js.UndefOr[Boolean] = js.undefined
  
  var viewport: js.UndefOr[Viewport] = js.undefined
  
  var watch: js.UndefOr[Boolean] = js.undefined
  
  var whenReady: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object MapProps {
  
  inline def apply(): MapProps = {
    val __obj = js.Dynamic.literal(children = null)
    __obj.asInstanceOf[MapProps]
  }
  
  extension [Self <: MapProps](x: Self) {
    
    inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsOptions(value: FitBoundsOptions): Self = StObject.set(x, "boundsOptions", value.asInstanceOf[js.Any])
    
    inline def setBoundsOptionsUndefined: Self = StObject.set(x, "boundsOptions", js.undefined)
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value*))
    
    inline def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEnableHighAccuracy(value: Boolean): Self = StObject.set(x, "enableHighAccuracy", value.asInstanceOf[js.Any])
    
    inline def setEnableHighAccuracyUndefined: Self = StObject.set(x, "enableHighAccuracy", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMaximumAge(value: Double): Self = StObject.set(x, "maximumAge", value.asInstanceOf[js.Any])
    
    inline def setMaximumAgeUndefined: Self = StObject.set(x, "maximumAge", js.undefined)
    
    inline def setNoMoveStart(value: Boolean): Self = StObject.set(x, "noMoveStart", value.asInstanceOf[js.Any])
    
    inline def setNoMoveStartUndefined: Self = StObject.set(x, "noMoveStart", js.undefined)
    
    inline def setOnViewportChange(value: /* viewport */ Viewport => Callback): Self = StObject.set(x, "onViewportChange", js.Any.fromFunction1((t0: /* viewport */ Viewport) => value(t0).runNow()))
    
    inline def setOnViewportChangeUndefined: Self = StObject.set(x, "onViewportChange", js.undefined)
    
    inline def setOnViewportChanged(value: /* viewport */ Viewport => Callback): Self = StObject.set(x, "onViewportChanged", js.Any.fromFunction1((t0: /* viewport */ Viewport) => value(t0).runNow()))
    
    inline def setOnViewportChangedUndefined: Self = StObject.set(x, "onViewportChanged", js.undefined)
    
    inline def setPadding(value: PointExpression): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomRight(value: PointExpression): Self = StObject.set(x, "paddingBottomRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingBottomRightUndefined: Self = StObject.set(x, "paddingBottomRight", js.undefined)
    
    inline def setPaddingTopLeft(value: PointExpression): Self = StObject.set(x, "paddingTopLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopLeftUndefined: Self = StObject.set(x, "paddingTopLeft", js.undefined)
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSetView(value: Boolean): Self = StObject.set(x, "setView", value.asInstanceOf[js.Any])
    
    inline def setSetViewUndefined: Self = StObject.set(x, "setView", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUseFlyTo(value: Boolean): Self = StObject.set(x, "useFlyTo", value.asInstanceOf[js.Any])
    
    inline def setUseFlyToUndefined: Self = StObject.set(x, "useFlyTo", js.undefined)
    
    inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    
    inline def setWhenReady(value: Callback): Self = StObject.set(x, "whenReady", value.toJsFn)
    
    inline def setWhenReadyUndefined: Self = StObject.set(x, "whenReady", js.undefined)
  }
}
