package typingsJapgolly.dashjs.mod

import typingsJapgolly.dashjs.anon.DroppedFrames
import typingsJapgolly.dashjs.dashjsStrings.qualityChangeRequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QualityChangeRequestedEvent
  extends StObject
     with Event {
  
  var mediaType: MediaType
  
  var newQuality: Double
  
  var oldQuality: Double
  
  var reason: DroppedFrames | Null
  
  var streamInfo: StreamInfo | Null
  
  @JSName("type")
  var type_QualityChangeRequestedEvent: qualityChangeRequested
}
object QualityChangeRequestedEvent {
  
  inline def apply(mediaType: MediaType, newQuality: Double, oldQuality: Double): QualityChangeRequestedEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], newQuality = newQuality.asInstanceOf[js.Any], oldQuality = oldQuality.asInstanceOf[js.Any], reason = null, streamInfo = null)
    __obj.updateDynamic("type")("qualityChangeRequested")
    __obj.asInstanceOf[QualityChangeRequestedEvent]
  }
  
  extension [Self <: QualityChangeRequestedEvent](x: Self) {
    
    inline def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setNewQuality(value: Double): Self = StObject.set(x, "newQuality", value.asInstanceOf[js.Any])
    
    inline def setOldQuality(value: Double): Self = StObject.set(x, "oldQuality", value.asInstanceOf[js.Any])
    
    inline def setReason(value: DroppedFrames): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setStreamInfo(value: StreamInfo): Self = StObject.set(x, "streamInfo", value.asInstanceOf[js.Any])
    
    inline def setStreamInfoNull: Self = StObject.set(x, "streamInfo", null)
    
    inline def setType(value: qualityChangeRequested): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
