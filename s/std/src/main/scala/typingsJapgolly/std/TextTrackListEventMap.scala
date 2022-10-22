package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTrackListEventMap extends StObject {
  
  /* standard dom */
  var addtrack: org.scalajs.dom.TrackEvent
  
  /* standard dom */
  var change: org.scalajs.dom.Event
  
  /* standard dom */
  var removetrack: org.scalajs.dom.TrackEvent
}
object TextTrackListEventMap {
  
  inline def apply(
    addtrack: org.scalajs.dom.TrackEvent,
    change: org.scalajs.dom.Event,
    removetrack: org.scalajs.dom.TrackEvent
  ): TextTrackListEventMap = {
    val __obj = js.Dynamic.literal(addtrack = addtrack.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], removetrack = removetrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackListEventMap]
  }
  
  extension [Self <: TextTrackListEventMap](x: Self) {
    
    inline def setAddtrack(value: org.scalajs.dom.TrackEvent): Self = StObject.set(x, "addtrack", value.asInstanceOf[js.Any])
    
    inline def setChange(value: org.scalajs.dom.Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setRemovetrack(value: org.scalajs.dom.TrackEvent): Self = StObject.set(x, "removetrack", value.asInstanceOf[js.Any])
  }
}
