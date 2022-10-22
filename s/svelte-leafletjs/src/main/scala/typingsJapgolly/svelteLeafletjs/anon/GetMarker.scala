package typingsJapgolly.svelteLeafletjs.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.leaflet.mod.IconOptions
import typingsJapgolly.leaflet.mod.Icon_
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leaflet.mod.MarkerOptions
import typingsJapgolly.leaflet.mod.Marker_
import typingsJapgolly.svelteLeafletjs.mod.MarkerEventKeys
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onadd
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onclick
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.oncontextmenu
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.ondblclick
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.ondrag
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.ondragend
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.ondragstart
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmousedown
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmouseout
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmouseover
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmove
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onpopupclose
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onpopupopen
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onremove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMarker extends StObject {
  
  var events: js.UndefOr[MarkerEventKeys] = js.undefined
  
  var getMarker: js.UndefOr[js.Function0[Marker_[Any]]] = js.undefined
  
  var icon: js.UndefOr[Icon_[IconOptions]] = js.undefined
  
  var latLng: LatLngExpression
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var options: js.UndefOr[MarkerOptions] = js.undefined
  
  var zIndexOffset: js.UndefOr[Double] = js.undefined
}
object GetMarker {
  
  inline def apply(latLng: LatLngExpression): GetMarker = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMarker]
  }
  
  extension [Self <: GetMarker](x: Self) {
    
    inline def setEvents(value: MarkerEventKeys): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(
      value: (ondragstart | ondrag | ondblclick | oncontextmenu | onremove | onmouseout | onadd | onclick | onmove | onmouseover | ondragend | onpopupopen | onpopupclose | onmousedown)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetMarker(value: CallbackTo[Marker_[Any]]): Self = StObject.set(x, "getMarker", value.toJsFn)
    
    inline def setGetMarkerUndefined: Self = StObject.set(x, "getMarker", js.undefined)
    
    inline def setIcon(value: Icon_[IconOptions]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLatLng(value: LatLngExpression): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOptions(value: MarkerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setZIndexOffset(value: Double): Self = StObject.set(x, "zIndexOffset", value.asInstanceOf[js.Any])
    
    inline def setZIndexOffsetUndefined: Self = StObject.set(x, "zIndexOffset", js.undefined)
  }
}
