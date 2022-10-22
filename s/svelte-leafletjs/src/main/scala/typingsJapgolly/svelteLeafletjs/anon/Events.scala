package typingsJapgolly.svelteLeafletjs.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.leaflet.mod.GeoJSONOptions
import typingsJapgolly.leaflet.mod.GeoJSON__
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

trait Events extends StObject {
  
  var events: js.UndefOr[PathEventKeys] = js.undefined
  
  var getGeoJSON: js.UndefOr[js.Function0[GeoJSON__[Any]]] = js.undefined
  
  var options: js.UndefOr[GeoJSONOptions[Any]] = js.undefined
  
  var url: String
}
object Events {
  
  inline def apply(url: String): Events = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setEvents(value: PathEventKeys): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(
      value: (ondblclick | oncontextmenu | onremove | onmouseout | onadd | onclick | onmouseover | onpopupopen | onpopupclose | onmousedown)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetGeoJSON(value: CallbackTo[GeoJSON__[Any]]): Self = StObject.set(x, "getGeoJSON", value.toJsFn)
    
    inline def setGetGeoJSONUndefined: Self = StObject.set(x, "getGeoJSON", js.undefined)
    
    inline def setOptions(value: GeoJSONOptions[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
