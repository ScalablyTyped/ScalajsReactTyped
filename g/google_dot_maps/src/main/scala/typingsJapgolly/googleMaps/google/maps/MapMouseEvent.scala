package typingsJapgolly.googleMaps.google.maps

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object is returned from various mouse events on the map and overlays,
  * and contains all the fields shown below.
  */
trait MapMouseEvent extends StObject {
  
  /**
    * The corresponding native DOM event. Developers should not rely on
    * <code>target</code>, <code>currentTarget</code>,
    * <code>relatedTarget</code> and <code>path</code> properties being defined
    * and consistent. Developers should not also rely on the DOM structure of
    * the internal implementation of the Maps API. Due to internal event
    * mapping, the <code>domEvent</code> may have different semantics from
    * the {@link google.maps.MapMouseEvent} (e.g. a {@link
    * google.maps.MapMouseEvent} &quot;click&quot; may have a
    * <code>domEvent</code> of type <code>KeyboardEvent</code>).
    */
  var domEvent: MouseEvent | TouchEvent | PointerEvent | KeyboardEvent | Event
  
  /**
    * The latitude/longitude that was below the cursor when the event occurred.
    */
  var latLng: Null | LatLng
  
  /**
    * Prevents this event from propagating further.
    */
  def stop(): Unit
}
object MapMouseEvent {
  
  inline def apply(domEvent: MouseEvent | TouchEvent | PointerEvent | KeyboardEvent | Event, stop: Callback): MapMouseEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], stop = stop.toJsFn, latLng = null)
    __obj.asInstanceOf[MapMouseEvent]
  }
  
  extension [Self <: MapMouseEvent](x: Self) {
    
    inline def setDomEvent(value: MouseEvent | TouchEvent | PointerEvent | KeyboardEvent | Event): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
    
    inline def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngNull: Self = StObject.set(x, "latLng", null)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
  }
}
