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
  * This object is sent in an event when a user clicks on an icon on the map.
  * The place ID of this place is stored in the placeId member. To prevent the
  * default info window from showing up, call the stop() method on this event
  * to prevent it being propagated. Learn more about <a
  * href="https://developers.google.com/maps/documentation/places/web-service/place-id">place
  * IDs</a> in the Places API developer guide.
  */
trait IconMouseEvent
  extends StObject
     with MapMouseEvent {
  
  /**
    * The place ID of the place that was clicked. This place ID can be used to
    * query more information about the feature that was clicked. <p> Learn more
    * about <a
    * href="https://developers.google.com/maps/documentation/places/web-service/place-id">place
    * IDs</a> in the Places API developer guide.
    */
  var placeId: String | Null
}
object IconMouseEvent {
  
  inline def apply(domEvent: MouseEvent | TouchEvent | PointerEvent | KeyboardEvent | Event, stop: Callback): IconMouseEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], stop = stop.toJsFn, latLng = null, placeId = null)
    __obj.asInstanceOf[IconMouseEvent]
  }
  
  extension [Self <: IconMouseEvent](x: Self) {
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdNull: Self = StObject.set(x, "placeId", null)
  }
}
