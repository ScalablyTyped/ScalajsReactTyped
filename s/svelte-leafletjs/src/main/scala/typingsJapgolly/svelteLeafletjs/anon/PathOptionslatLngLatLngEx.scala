package typingsJapgolly.svelteLeafletjs.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.leaflet.mod.CircleMarkerOptions
import typingsJapgolly.leaflet.mod.Circle_
import typingsJapgolly.leaflet.mod.FillRule
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.LineCapShape
import typingsJapgolly.leaflet.mod.LineJoinShape
import typingsJapgolly.leaflet.mod.Renderer
import typingsJapgolly.svelteLeafletjs.mod.PathEventKeys
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onadd
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onclick
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.oncontextmenu
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.ondblclick
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmousedown
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmouseout
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmouseover
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onpopupclose
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onpopupopen
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onremove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined leaflet.leaflet.PathOptions & {  latLng :leaflet.leaflet.LatLngExpression,   radius :number | undefined,   options :leaflet.leaflet.CircleMarkerOptions | undefined,   events :svelte-leafletjs.svelte-leafletjs.PathEventKeys | undefined,   getCircle :(): leaflet.leaflet.Circle<any> | undefined} */
trait PathOptionslatLngLatLngEx extends StObject {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var dashArray: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var dashOffset: js.UndefOr[String] = js.undefined
  
  var events: js.UndefOr[PathEventKeys] = js.undefined
  
  var fill: js.UndefOr[Boolean] = js.undefined
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var fillRule: js.UndefOr[FillRule] = js.undefined
  
  var getCircle: js.UndefOr[js.Function0[Circle_[Any]]] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var latLng: LatLngExpression
  
  var lineCap: js.UndefOr[LineCapShape] = js.undefined
  
  var lineJoin: js.UndefOr[LineJoinShape] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var options: js.UndefOr[CircleMarkerOptions] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var renderer: js.UndefOr[Renderer] = js.undefined
  
  var stroke: js.UndefOr[Boolean] = js.undefined
  
  var weight: js.UndefOr[Double] = js.undefined
}
object PathOptionslatLngLatLngEx {
  
  inline def apply(latLng: LatLngExpression): PathOptionslatLngLatLngEx = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOptionslatLngLatLngEx]
  }
  
  extension [Self <: PathOptionslatLngLatLngEx](x: Self) {
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setBubblingMouseEvents(value: Boolean): Self = StObject.set(x, "bubblingMouseEvents", value.asInstanceOf[js.Any])
    
    inline def setBubblingMouseEventsUndefined: Self = StObject.set(x, "bubblingMouseEvents", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashArray(value: String | js.Array[Double]): Self = StObject.set(x, "dashArray", value.asInstanceOf[js.Any])
    
    inline def setDashArrayUndefined: Self = StObject.set(x, "dashArray", js.undefined)
    
    inline def setDashArrayVarargs(value: Double*): Self = StObject.set(x, "dashArray", js.Array(value*))
    
    inline def setDashOffset(value: String): Self = StObject.set(x, "dashOffset", value.asInstanceOf[js.Any])
    
    inline def setDashOffsetUndefined: Self = StObject.set(x, "dashOffset", js.undefined)
    
    inline def setEvents(value: PathEventKeys): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(
      value: (ondblclick | oncontextmenu | onremove | onmouseout | onadd | onclick | onmouseover | onpopupopen | onpopupclose | onmousedown)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillRule(value: FillRule): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setGetCircle(value: CallbackTo[Circle_[Any]]): Self = StObject.set(x, "getCircle", value.toJsFn)
    
    inline def setGetCircleUndefined: Self = StObject.set(x, "getCircle", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setLatLng(value: LatLngExpression): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLineCap(value: LineCapShape): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setLineJoin(value: LineJoinShape): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOptions(value: CircleMarkerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
