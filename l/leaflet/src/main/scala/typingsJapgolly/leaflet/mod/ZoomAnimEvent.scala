package typingsJapgolly.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomAnimEvent
  extends StObject
     with LeafletEvent {
  
  var center: LatLng_
  
  var noUpdate: Boolean
  
  var zoom: Double
}
object ZoomAnimEvent {
  
  inline def apply(
    center: LatLng_,
    layer: Any,
    noUpdate: Boolean,
    popup: Any,
    propagatedFrom: Any,
    sourceTarget: Any,
    target: Any,
    `type`: String,
    zoom: Double
  ): ZoomAnimEvent = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], noUpdate = noUpdate.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomAnimEvent]
  }
  
  extension [Self <: ZoomAnimEvent](x: Self) {
    
    inline def setCenter(value: LatLng_): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setNoUpdate(value: Boolean): Self = StObject.set(x, "noUpdate", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
