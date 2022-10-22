package typingsJapgolly.maplibreGl.mod

import org.scalajs.dom.MouseEvent
import typingsJapgolly.maplibreGl.maplibreGlStrings.boxzoomcancel
import typingsJapgolly.maplibreGl.maplibreGlStrings.boxzoomend
import typingsJapgolly.maplibreGl.maplibreGlStrings.boxzoomstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapLibreZoomEvent extends StObject {
  
  var originalEvent: MouseEvent
  
  var target: Map
  
  var `type`: boxzoomstart | boxzoomend | boxzoomcancel
}
object MapLibreZoomEvent {
  
  inline def apply(originalEvent: MouseEvent, target: Map, `type`: boxzoomstart | boxzoomend | boxzoomcancel): MapLibreZoomEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapLibreZoomEvent]
  }
  
  extension [Self <: MapLibreZoomEvent](x: Self) {
    
    inline def setOriginalEvent(value: MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Map): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: boxzoomstart | boxzoomend | boxzoomcancel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
