package typingsJapgolly.svelteLeafletjs.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.leaflet.mod.ImageOverlayOptions
import typingsJapgolly.leaflet.mod.LatLngBoundsExpression
import typingsJapgolly.leaflet.mod.LatLngTuple
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

trait Bounds extends StObject {
  
  var bounds: LatLngBoundsExpression
  
  var events: js.UndefOr[PathEventKeys] = js.undefined
  
  var getImageOverlay: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  var imageUrl: String
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var options: js.UndefOr[ImageOverlayOptions] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object Bounds {
  
  inline def apply(bounds: LatLngBoundsExpression, imageUrl: String): Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  
  extension [Self <: Bounds](x: Self) {
    
    inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value*))
    
    inline def setEvents(value: PathEventKeys): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(
      value: (ondblclick | oncontextmenu | onremove | onmouseout | onadd | onclick | onmouseover | onpopupopen | onpopupclose | onmousedown)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setGetImageOverlay(value: CallbackTo[Bounds]): Self = StObject.set(x, "getImageOverlay", value.toJsFn)
    
    inline def setGetImageOverlayUndefined: Self = StObject.set(x, "getImageOverlay", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOptions(value: ImageOverlayOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
