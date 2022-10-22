package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackViewModelTrackEvent extends StObject {
  
  var position: Any
}
object TrackViewModelTrackEvent {
  
  inline def apply(position: Any): TrackViewModelTrackEvent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackViewModelTrackEvent]
  }
  
  extension [Self <: TrackViewModelTrackEvent](x: Self) {
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
