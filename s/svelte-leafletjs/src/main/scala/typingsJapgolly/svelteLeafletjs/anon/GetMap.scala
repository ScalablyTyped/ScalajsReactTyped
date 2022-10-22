package typingsJapgolly.svelteLeafletjs.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.leaflet.mod.MapOptions
import typingsJapgolly.leaflet.mod.Map_
import typingsJapgolly.svelteLeafletjs.mod.MapEventKeys
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onautopanstart
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onbaselayerchange
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onblur
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onclick
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.oncontextmenu
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.ondblclick
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.ondrag
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.ondragend
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.ondragstart
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onfocus
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onlayeradd
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onlayerremove
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onload
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onlocationerror
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onlocationfound
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmousedown
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmousemove
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmouseout
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmouseover
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmouseup
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmove
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmoveend
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onmovestart
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onoverlayadd
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onoverlayremove
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onpopupclose
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onpopupopen
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onpreclick
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onresize
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onunload
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onviewreset
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onzoom
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onzoomend
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onzoomlevelschange
import typingsJapgolly.svelteLeafletjs.svelteLeafletjsStrings.onzoomstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMap extends StObject {
  
  var events: js.UndefOr[MapEventKeys] = js.undefined
  
  var getMap: js.UndefOr[js.Function0[Map_]] = js.undefined
  
  var options: js.UndefOr[MapOptions] = js.undefined
}
object GetMap {
  
  inline def apply(): GetMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMap]
  }
  
  extension [Self <: GetMap](x: Self) {
    
    inline def setEvents(value: MapEventKeys): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(
      value: (onlocationfound | ondragstart | onzoomlevelschange | onzoom | ondrag | ondblclick | onbaselayerchange | oncontextmenu | onoverlayadd | onmouseout | onviewreset | onoverlayremove | onzoomstart | onlayerremove | onclick | onresize | onmovestart | onfocus | onmouseup | onmoveend | onmove | onmouseover | onpreclick | onzoomend | onautopanstart | onblur | onload | ondragend | onlocationerror | onpopupopen | onmousemove | onpopupclose | onunload | onlayeradd | onmousedown)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetMap(value: CallbackTo[Map_]): Self = StObject.set(x, "getMap", value.toJsFn)
    
    inline def setGetMapUndefined: Self = StObject.set(x, "getMap", js.undefined)
    
    inline def setOptions(value: MapOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
